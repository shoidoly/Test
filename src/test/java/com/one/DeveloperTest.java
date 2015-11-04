package com.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Before;
import org.junit.Test;

import spring.core.helper.JsonOutput;

public class DeveloperTest {

	@Before
	public void before(){
		
	}
	
	@Test
	public void intTest(){
		
		float a = 20000f;
		
		System.out.println( a );
	}
	
	private int[] addPos(int[] a, int pos, int num) {
	    int[] result = new int[a.length];
	    for(int i = 0; i < pos; i++)
	        result[i] = a[i];
	    result[pos] = num;
	    for(int i = pos + 1; i < a.length; i++)
	        result[i] = a[i - 1];
	    return result;
	}
	
	public static void insert(Object[] arr, int curSize, Object element, int position) {
		Object[] result = new Object[arr.length];
		for (int i=0; i < position; i++)
			result[i] = arr[i];
		result[position] = element;
		for (int i=position+1; i<curSize;i++)
			result[i] = arr[i-1];
		arr = result;
	}
	
	@Test
	public void jsonTest(){
		StringBuffer sb = new StringBuffer();
//		sb.append("{\"root\":[");
		sb.append("[");
		sb.append("  {\"id\": 1, \"group\": \"group1\"},"); 
		sb.append("  {\"id\": 2, \"group\": \"group1\"},"); 
		sb.append("  {\"id\": 3, \"group\": \"group2\"},"); 
		sb.append("  {\"id\": 4, \"group\": \"group3\"},"); 
		sb.append("  {\"id\": 5, \"group\": \"group3\"},"); 
		sb.append("  {\"id\": 6, \"group\": \"group3\"}");
		sb.append("]");
//		sb.append("]}");
		
		try {
			regroupingByGroup(sb.toString());
			
		} catch (ParseException e) {
			e.printStackTrace();
			throw new AssertionError();
		}
		
	}
	
	private JSONArray regroupingByGroup(String jsonStr) throws ParseException{
		JSONParser jsonParser = new JSONParser();
		JSONArray resultJson = new JSONArray();
		
		JSONArray inputJson = (JSONArray)jsonParser.parse(jsonStr);
		Map<String, ArrayList<JSONObject>> map = new LinkedHashMap<String, ArrayList<JSONObject>>();
		JSONObject jobj;
		for (int i=0; i<inputJson.size(); i++){
			jobj = (JSONObject)inputJson.get(i);
			if (map.get(jobj.get("group")) != null){
				map.get(jobj.get("group")).add(jobj);
			} else {
				ArrayList<JSONObject> list = new ArrayList<JSONObject>();
				list.add(jobj);
				
				map.put((String)jobj.get("group"), list);
			}
		}
		
		for(Map.Entry<String, ArrayList<JSONObject>> entry : map.entrySet()){
			jobj = new JSONObject();
			jobj.put("id", entry.getKey());
			jobj.put("children", entry.getValue());
			resultJson.add(jobj);
		}
		
		return resultJson;
	}

}

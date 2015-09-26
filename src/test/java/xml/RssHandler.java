package xml;

import java.util.Stack;
import org.xml.sax.Attributes;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class RssHandler extends DefaultHandler {

	private boolean inUrl = false;
    private boolean inTitle = false;
    private boolean inDescription = false;
    private boolean inItem = false;
    private boolean inDate = false;
    //private Bitmap image = null;
    private String title = null;
    private StringBuffer description = new StringBuffer();
    private String date = null;
    
  //As we read any XML element we will push that in this stack
    private Stack<String> elementStack = new Stack<String>();

//    private Bitmap getBitmap(String url) {
//        try {
//            HttpURLConnection connection =
//                    (HttpURLConnection)new URL(url).openConnection();
//            connection.setDoInput(true);
//            connection.connect();
//            InputStream input = connection.getInputStream();
//            Bitmap bitmap = BitmapFactory.decodeStream(input);
//            input.close();
//            return bitmap;
//        } catch (IOException ioe) { return null; }
//    }

    public void characters(char ch[], int start, int length) {
        String chars = new String(ch).substring(start, start + length).trim();
        if (chars.length() == 0)
        {
            return; // ignore white space
        }
        if ("title".equals(currentElement())){
        	this.title = chars;  
        }
    }
    
    private String currentElement()
    {
        return this.elementStack.peek();
    }

    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {

    	this.elementStack.push(qName);
    	
//        if (localName.equals("url")) { inUrl = true; }
//        else {inUrl = false; }
//
//        if (localName.startsWith("item")) { inItem = true; }
//        else if (inItem) {
//            if (localName.equals("title")) { inTitle = true; }
//            else { inTitle = false; }
//
//            if (localName.equals("description")) { inDescription = true; }
//            else { inDescription = false; }
//
//            if (localName.equals("pubDate")) { inDate = true; }
//            else { inDate = false; }
//        }
    }
    
    public void endElement(String uri, String localName, String qName) throws SAXException
    {
        //Remove last added  element
        this.elementStack.pop();
    }


//    public Bitmap getImage() { return image; }
    public String getTitle() { return title; }
    public StringBuffer getDescription() { return description; }
    public String getDate() { return date; }

}

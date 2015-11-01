package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

import org.junit.Before;
import org.junit.Test;

public class ReadFileTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		// The name of the file to open.
        String fileName = "C:/download/Resume_Hyunsool_Song.doc";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }    

            // Always close files.
            bufferedReader.close();            
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                   
            // Or we could just do this: 
            // ex.printStackTrace();
        }
	}
	
	@Test
	public void testCopy(){
		// The name of the file to open.
        String source = "C:/download/Resume_Hyunsool_Song.doc";
        String dest = "C:/download/Resume_Hyunsool_Song_new.doc";
        try {
			copyFileUsingJava7Files(new File(source), new File(dest));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void copyFileUsingJava7Files(File source, File dest) throws IOException{
		Files.copy(source.toPath(), dest.toPath());
	}
	
	@Test
	public void numberTest(){
		System.out.println("(2^0)"+(2^3));
	}

}

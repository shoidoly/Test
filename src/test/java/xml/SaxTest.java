package xml;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.junit.Before;
import org.junit.Test;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

public class SaxTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String url = "http://www.nasa.gov/rss/image_of_the_day.rss";
		RssHandler rssHandler = new RssHandler();
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
	        SAXParser parser = factory.newSAXParser();
	        XMLReader reader = parser.getXMLReader();
	        reader.setContentHandler(rssHandler);
            InputStream inputStream = new URL(url).openStream();
            reader.parse(new InputSource(inputStream));
            String title = rssHandler.getTitle();
            System.out.println(title);
		} catch (Exception e){
			e.printStackTrace();
		}
		
	}

}

import java.io.*;
import java.util.*;
import java.net.*;
import org.json.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.charset.Charset;

public class TocHW4
{
	public static class RealPriceSearch
	{
		private static String ReadFile(Reader filename) throws IOException
		{
			int temp;
		    StringBuilder buffer = new StringBuilder();
		    while ((temp = filename.read()) != -1)
		      buffer.append((char) temp);
		    return buffer.toString();
		}

		  public static JSONArray readJsonFromUrl(String url) throws IOException, JSONException
		  {
			  InputStream is = new URL(url).openStream();
			  try 
			  {
				  BufferedReader rd = new BufferedReader(new InputStreamReader(is,  Charset.forName("UTF-8")));
				  String jsonText = ReadFile(rd);
				  JSONArray json = new JSONArray(jsonText);
				  return json;
			  } 
			  finally
			  {
				  is.close();
			  }
		  }
	}
	
	public static void main(String[] args) throws JSONException, IOException
	{
		
	}
}

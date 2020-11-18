package testing;

import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpURLConnectionExample {
	
	public void getMethodExample() throws IOException
	{

URL url=new URL("http://dummy.restapiexample.com api/v1/employees");
HttpURLConnection connetion=(HttpURLConnection)url.openConnection();
connetion.setRequestMethod("GET");
connetion.connect();

int responseccode=connetion.getResponseCode();
System.out.println(responseccode);

	}

	public static void main(String[]args) throws IOException
	{
		HttpURLConnectionExample url=new HttpURLConnectionExample();
		url.getMethodExample();   
	}
}

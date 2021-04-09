package testingMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class PostReq_Examples {

	
	public void postReq() throws IOException
	{
	URL url=new URL("http://dummy.restapiexample.com/api/v1/create");
	HttpsURLConnection connection= (HttpsURLConnection) url.openConnection();
	connection.setRequestMethod("POST");
	connection.setRequestProperty("Content-Type", "application/json");
	connection.setDoOutput(true);
	
	String jsonBody="{\"name\":\"viji\",\"salary\":\"123000\",\"age\":\"40\"}";
	byte[] b=jsonBody.getBytes();
	
	OutputStream ops=connection.getOutputStream();
	ops.write(b);
	
	
	System.out.println("The code is:"+connection.getResponseCode());
	System.out.println("The message is:"+connection.getResponseMessage());
    
	InputStream inputsream=connection.getInputStream();
	InputStreamReader isreader=new InputStreamReader(inputsream);
	BufferedReader br=new BufferedReader(isreader);
	String line;
	StringBuffer sb=new StringBuffer();
	while((line=br.readLine())!=null)
	{
		sb.append(line);
	}
	System.out.println(sb);
	
	
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		PostReq_Examples obj=new PostReq_Examples();
		obj.postReq();
		
	}

}

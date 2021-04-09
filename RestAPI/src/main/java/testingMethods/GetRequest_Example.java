package testingMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class GetRequest_Example {

	public void getReq() throws IOException
	{
		URL url=new URL("http://dummy.restapiexample.com/api/v1/employees");
		HttpsURLConnection connection=(HttpsURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();

		int code=connection.getResponseCode();
		System.out.println("Code is:"+code);
		String msg=connection.getResponseMessage();
		System.out.println("The message is"+msg);

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

		GetRequest_Example obj=new GetRequest_Example();
		obj.getReq();
	}

}

package testingMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class PutReq_Example {

	public void putReq() throws IOException
	{

		URL url=new URL("http://dummy.restapiexample.com/api/v1/update/21");
		HttpsURLConnection connection= (HttpsURLConnection) url.openConnection();
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);

		String jsonBody="{\"name\":\"viji\",\"salary\":\"1023000\",\"age\":\"41\"}";
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
		PutReq_Example obj=new PutReq_Example();
		obj.putReq();
	}

}

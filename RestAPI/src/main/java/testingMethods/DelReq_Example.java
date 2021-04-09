package testingMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class DelReq_Example {

		public void delReq() throws IOException
		{

			URL url=new URL("http://dummy.restapiexample.com/api/v1/delete/2");
			HttpsURLConnection connection= (HttpsURLConnection) url.openConnection();
			connection.setRequestMethod("DELETE");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setDoOutput(true);


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

	public static void main(String args[]) throws IOException
	{
		DelReq_Example obj=new DelReq_Example();
		obj.delReq();

	}

}

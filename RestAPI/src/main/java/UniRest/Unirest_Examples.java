package UniRest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Unirest_Examples {
	
	
	public void getReq() throws UnirestException
	{
	HttpResponse<JsonNode> get1=Unirest.get("http://dummy.restapiexample.com/api/v1/employees").asJson();
	System.out.println("The Code is: "+get1.getStatus());
	System.out.println("The message is: "+get1.getStatusText());
	System.out.println("The content is: "+get1.getBody());
	}

	public void postReq() throws UnirestException
	{
		HttpResponse<JsonNode> get2=Unirest.post("http://dummy.restapiexample.com/api/v1/create").body("{\"name\":\"chandhini\",\"salary\":\"30000\",\"age\":\"23\"}").asJson();
		System.out.println("The Code is: "+get2.getStatus());
		System.out.println("The message is: "+get2.getStatusText());
		System.out.println("The content is: "+get2.getBody());
	}
	
	public void putReq() throws UnirestException
	{
		HttpResponse<JsonNode> get3=Unirest.post("http://dummy.restapiexample.com/api/v1/create").body("{\"name\":\"chandhini\",\"salary\":\"30000\",\"age\":\"24\"}").asJson();
		System.out.println("The Code is: "+get3.getStatus());
		System.out.println("The message is: "+get3.getStatusText());
		System.out.println("The content is: "+get3.getBody());
	}
	
	
	public void delReq() throws UnirestException
	{
		HttpResponse<JsonNode> get4=Unirest.delete("http://dummy.restapiexample.com/api/v1/delete/2").asJson();
		System.out.println("The Code is: "+get4.getStatus());
		System.out.println("The message is: "+get4.getStatusText());
		System.out.println("The content is: "+get4.getBody());
	}
	
	
	public static void main(String[] args) throws UnirestException {
		
            Unirest_Examples obj=new Unirest_Examples();
            obj.getReq();
            //obj.postReq();
           // obj.putReq();
           // obj.delReq();
	}

}

package testResponseValidation;

import io.restassured.response.Response;
import org.testng.Assert;

public class ResponseValidations {

//    public void responseValidation(Response response){
//        System.out.println(response.statusLine());
//        System.out.println(response.asString());
//    }

    public static void responseStatusLineCodeVal(int expStatCode, Response response){
        Assert.assertEquals(response.getStatusCode(),expStatCode);
    }

    public static void responseDataVal(String expData, String actualData){
        Assert.assertEquals(expData,actualData);
    }
}

package testCases;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import payloads.Person;
import testResponseValidation.ResponseValidations;
import testSteps.HttpMethods;
import testUtilities.ConfigurationReader;

public class TC3 {

    public void deleteRequestTest(){
        HttpMethods http = new HttpMethods();
        Response response = http.deleteRequest(TC2.idValue,ConfigurationReader.getProperty("url1"));
        ResponseValidations.responseStatusLineCodeVal(200,response);
        System.out.println("Data Deleted Succesfully : "+response.getStatusCode());
    }
}

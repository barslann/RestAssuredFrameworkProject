package testCases;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import payloads.Person;
import testResponseValidation.ResponseValidations;
import testSteps.HttpMethods;
import testUtilities.ConfigurationReader;

public class TC2 {

    public void postRequestTest(){
        HttpMethods http = new HttpMethods();
        Person person = new Person("Beck","Ars",20);
        Response response = http.postRequest(person,ConfigurationReader.getProperty("url1"));

        ResponseValidations.responseStatusLineCodeVal(201,response);
    }
}

package testCases;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import payloads.Person;
import testResponseValidation.ResponseValidations;
import testSteps.HttpMethods;
import testUtilities.ConfigurationReader;
import testUtilities.JsonResParsing;

public class TC2 {

    static String idValue;

    public void postRequestTest(){
        HttpMethods http = new HttpMethods();
        Person person = new Person("Beck","Ars",20);
        Response response = http.postRequest(person,ConfigurationReader.getProperty("url1"));

        ResponseValidations.responseStatusLineCodeVal(201,response);

        response.prettyPrint();

        idValue = JsonResParsing.jsonResDataParsing(response,"id");
        System.out.println("id : " +   idValue);

    }
}

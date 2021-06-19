package testCases;

import io.restassured.response.Response;
import testResponseValidation.ResponseValidations;
import testSteps.HttpMethods;
import testUtilities.ConfigurationReader;
import testUtilities.JsonResParsing;

public class TC1 {
    public void getAPersonRequest() {
        HttpMethods http = new HttpMethods();
        Response response = http.getRequest(TC2.idValue,ConfigurationReader.getProperty("url1"));

        ResponseValidations.responseStatusLineCodeVal(200,response);

        String ParseData= JsonResParsing.jsonResDataParsing(response,"firstName");
        System.out.println("The value of Json Key fecthed is :"+ParseData);
        ResponseValidations.responseDataValid("Beck", ParseData);
        System.out.println(response.asString()+"\n");

    }
    public void getAllPeopleRequest() {
        HttpMethods http = new HttpMethods();
        Response response = http.getRequest(ConfigurationReader.getProperty("url1"));
        ResponseValidations.responseStatusLineCodeVal(200,response);
        System.out.println(response.asString()+"\n");

    }
}

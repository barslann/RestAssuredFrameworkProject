package testCases;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import testResponseValidation.ResponseValidations;
import testSteps.HttpMethods;
import testUtilities.ConfigurationReader;



public class TC1 {
    public void getRequestTest() {
        HttpMethods http = new HttpMethods();
        Response response = http.getRequest(ConfigurationReader.getProperty("url1"));

        ResponseValidations.responseStatusLineCodeVal(200,response);

    }
}

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
        Response response = http.deleteRequest(ConfigurationReader.getProperty("url1"),"_D7YFDg");
        ResponseValidations.responseStatusLineCodeVal(200,response);
    }
}

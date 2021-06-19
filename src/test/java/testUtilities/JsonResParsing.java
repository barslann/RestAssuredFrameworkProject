package testUtilities;

import io.restassured.response.Response;

public class JsonResParsing {

    public static String  jsonResDataParsing(Response response,String param){
        String jsonParseKeyValue = response.jsonPath().get(param).toString();
        return jsonParseKeyValue;
    }
}

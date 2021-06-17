package testSteps;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import payloads.Person;


public class HttpMethods {
    public Response getRequest(String url){
        Response response = given().contentType(ContentType.JSON)
                .when()
                .get(url);

        return  response;
    }

    public Response postRequest(Person person, String url){
        Response response = given().contentType(ContentType.JSON)
                .body(person)
                .when()
                .post(url);

        return  response;
    }

    public Response deleteRequest(String url,String id){
        return given().contentType(ContentType.JSON)
                .when().delete(url + "/" + id);
    }


}

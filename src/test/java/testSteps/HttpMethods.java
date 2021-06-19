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

    public Response getRequest(String id, String url){
        Response response = given().contentType(ContentType.JSON)
                .when()
                .get(url+"/"+id);

        return  response;
    }

    // Single Responsibility Principle
    public Response postRequest(Person person, String url){
        Response response = given().contentType(ContentType.JSON)
                .body(person)
                .when()
                .post(url);

        return  response;
    }

    public Response putRequest(Person person, String url){
        Response response = given().contentType(ContentType.JSON)
                .body(person)
                .when()
                .put(url);

        return  response;
    }

    public Response deleteRequest(String id,String url){
        return given().contentType(ContentType.JSON)
                .when().delete(url + "/" + id);
    }


}

package testTrigger;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.response.Response;
import testCases.TC1;
import testCases.TC2;
import testCases.TC3;
import testCases.TC4;
import testSteps.HttpMethods;

public class Trigger {

    public static void main(String[] args) throws JsonProcessingException {
//
//        System.out.println("Executing Test Case 1- get() request");
        TC1 tc1 = new TC1();
//        tc1.getAllPeopleRequest();

        System.out.println("Executing Test Case 2- post() request");
        TC2 tc2 = new TC2();
        tc2.postRequestTest();

        System.out.println("Executing Test Case 1- get() request");
        tc1.getAPersonRequest();

//        System.out.println("Executing Test Case 1- get() request");
//        tc1.getAllPeopleRequest();
//
        System.out.println("Executing Test Case 4- get() request");
        TC4 tc4 = new TC4();
        tc4.putRequest();
//
//        System.out.println("Executing Test Case 1- get() request");
//        tc1.getAllPeopleRequest();
//
//        System.out.println("Executing Test Case 3- delete() request");
//        TC3 tc3 = new TC3();
//        tc3.deleteRequestTest();
//
//        System.out.println("Executing Test Case 1- get() request");
//        tc1.getAllPeopleRequest();


    }
}

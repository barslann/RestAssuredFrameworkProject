package testTrigger;

import testCases.TC1;
import testCases.TC2;
import testCases.TC3;

public class Trigger {

    public static void main(String[] args) {
        System.out.println("Executing Test Case 1- get() request");
        TC1 tc1 = new TC1();
        tc1.getRequestTest();



        System.out.println("Executing Test Case 2- post() request");
        TC2 tc2 = new TC2();
        tc2.postRequestTest();

        System.out.println("Executing Test Case 3- delete() request");
        TC3 tc3 = new TC3();
        tc3.deleteRequestTest();
    }
}

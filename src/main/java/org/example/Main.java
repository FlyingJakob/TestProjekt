package org.example;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String number = scanner.nextLine();

            System.out.println(getNumberOutput(number));
        }
    }

    public static String getNumberOutput(String number){

        if (number.length()!=4){
            return "Invalid PIN";
        }
        try{
            int pin = Integer.parseInt(number);
        }catch (Exception e){
            return "Invalid PIN";
        }
        return "Valid PIN";
    }


    @Test
    public void TestNumberOutput(){
        String output = getNumberOutput("1234");
        assertEquals("Valid PIN",output);
        String output2 = getNumberOutput("12345");
        assertEquals("Invalid PIN",output2);
        String output3 = getNumberOutput("ABCD");
        assertEquals("Invalid PIN",output3);
    }

}
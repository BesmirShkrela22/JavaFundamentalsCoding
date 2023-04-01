package com.academy.sda.app11;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("vendosni nje text");

        String  inputtext= scanner.nextLine();
        String maxInputLength=inputtext;


        while(!inputtext.equals("Enought")){

            inputtext= scanner.nextLine();

            if(inputtext.length()>maxInputLength.length()){
                maxInputLength=inputtext;
            }
        }
        System.out.println("teksti me i gjate eshte "+ maxInputLength);
    }
}

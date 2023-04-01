package com.academy.sda.app10;

import java.util.Scanner;


public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos nje numer pozitiv: ");
        int numer = scanner.nextInt();

        int shuma=0;
while (numer>0){
    int shifra=numer%10;
shuma+=shifra;
numer/=10;


        }
        System.out.println(shuma);
    }
}
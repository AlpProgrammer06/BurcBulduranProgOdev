package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);
        System.out.print("Do�um ay�n�z� giriniz: ");
        month = input.nextInt();
        System.out.print("Do�um g�n�n�z� giriniz: ");
        day = input.nextInt();

        if (month == 1){
            if (day <= 22){
                System.out.println("O�lak burcu");
            }else if (day > 31){
                System.out.println("Hatal� giri� yapt�n�z");
            } else{
                System.out.println("Kova burcu");
            }
        }
        if (month == 2){
            if (day <= 19){
                System.out.println("Kova burcu");
            }else if (day > 28){
                System.out.println("Hatal� giri� yapt�n�z");
            }else{
                System.out.println("Bal�k burcu");
            }
        }
        if (month == 3){
            if (day <= 20){
                System.out.println("Bal�k burcu");
            }else if (day > 31){
                System.out.println("Hatal� giri� yapt�n�z");
            }else{
                System.out.println("Ko� burcu");
            }
        }
        if (month == 4){
            if (day <= 20){
                System.out.println("Ko� burcu");
            }else if (day > 31){
                System.out.println("Hatal� giri� yapt�n�z");
            }else{
                System.out.println("Bo�a burcu");
            }
        }
        if (month == 5){
            if (day <= 21){
                System.out.println("Bo�a burcu");
            }else if (day > 31){
                System.out.println("Hatal� giri� yapt�n�z");
            }else{
                System.out.println("�kizler burcu");
            }
        }
        if (month == 6){
            if (day <= 22){
                System.out.println("�kizler burcu");
            }else if (day > 31){
                System.out.println("Hatal� giri� yapt�n�z");
            }else{
                System.out.println("Yenge� burcu");
            }
        }
        if (month == 7){
            if (day <= 22){
                System.out.println("Yenge� burcu");
            }else if (day > 31){
                System.out.println("Hatal� giri� yapt�n�z");
            }else{
                System.out.println("Aslan burcu");
            }
        }
        if (month == 8){
            if (day <= 22){
                System.out.println("Aslan burcu");
            }else if (day > 31){
                System.out.println("Hatal� giri� yapt�n�z");
            }else{
                System.out.println("Ba�ak burcu");
            }
        }
        if (month == 9){
            if (day <= 22){
                System.out.println("Ba�ak burcu");
            }else if (day > 31){
                System.out.println("Hatal� giri� yapt�n�z");
            }else{
                System.out.println("Terazi burcu");
            }
        }
        if (month == 10){
            if (day <= 22){
                System.out.println("Terazi burcu");
            }else if (day > 31){
                System.out.println("Hatal� giri� yapt�n�z");
            }else{
                System.out.println("Akrep burcu");
            }
        }
        if (month == 11){
            if (day <= 21){
                System.out.println("Akrep burcu");
            }else if (day > 31){
                System.out.println("Hatal� giri� yapt�n�z");
            }else{
                System.out.println("Yay burcu");
            }
        }
        if (month == 12){
            if (day <= 21){
                System.out.println("Yay burcu");
            }else if (day > 31){
                System.out.println("Hatal� giri� yapt�n�z");
            }else{
                System.out.println("O�lak burcu");
            }
        }
        if (month > 12){
            System.out.println("Hatal� giri� yapt�n�z!");
        }

    }

}

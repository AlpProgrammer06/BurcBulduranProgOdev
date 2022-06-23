package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);
        System.out.print("Doðum ayýnýzý giriniz: ");
        month = input.nextInt();
        System.out.print("Doðum gününüzü giriniz: ");
        day = input.nextInt();

        if (month == 1){
            if (day <= 22){
                System.out.println("Oðlak burcu");
            }else if (day > 31){
                System.out.println("Hatalý giriþ yaptýnýz");
            } else{
                System.out.println("Kova burcu");
            }
        }
        if (month == 2){
            if (day <= 19){
                System.out.println("Kova burcu");
            }else if (day > 28){
                System.out.println("Hatalý giriþ yaptýnýz");
            }else{
                System.out.println("Balýk burcu");
            }
        }
        if (month == 3){
            if (day <= 20){
                System.out.println("Balýk burcu");
            }else if (day > 31){
                System.out.println("Hatalý giriþ yaptýnýz");
            }else{
                System.out.println("Koç burcu");
            }
        }
        if (month == 4){
            if (day <= 20){
                System.out.println("Koç burcu");
            }else if (day > 31){
                System.out.println("Hatalý giriþ yaptýnýz");
            }else{
                System.out.println("Boða burcu");
            }
        }
        if (month == 5){
            if (day <= 21){
                System.out.println("Boða burcu");
            }else if (day > 31){
                System.out.println("Hatalý giriþ yaptýnýz");
            }else{
                System.out.println("Ýkizler burcu");
            }
        }
        if (month == 6){
            if (day <= 22){
                System.out.println("Ýkizler burcu");
            }else if (day > 31){
                System.out.println("Hatalý giriþ yaptýnýz");
            }else{
                System.out.println("Yengeç burcu");
            }
        }
        if (month == 7){
            if (day <= 22){
                System.out.println("Yengeç burcu");
            }else if (day > 31){
                System.out.println("Hatalý giriþ yaptýnýz");
            }else{
                System.out.println("Aslan burcu");
            }
        }
        if (month == 8){
            if (day <= 22){
                System.out.println("Aslan burcu");
            }else if (day > 31){
                System.out.println("Hatalý giriþ yaptýnýz");
            }else{
                System.out.println("Baþak burcu");
            }
        }
        if (month == 9){
            if (day <= 22){
                System.out.println("Baþak burcu");
            }else if (day > 31){
                System.out.println("Hatalý giriþ yaptýnýz");
            }else{
                System.out.println("Terazi burcu");
            }
        }
        if (month == 10){
            if (day <= 22){
                System.out.println("Terazi burcu");
            }else if (day > 31){
                System.out.println("Hatalý giriþ yaptýnýz");
            }else{
                System.out.println("Akrep burcu");
            }
        }
        if (month == 11){
            if (day <= 21){
                System.out.println("Akrep burcu");
            }else if (day > 31){
                System.out.println("Hatalý giriþ yaptýnýz");
            }else{
                System.out.println("Yay burcu");
            }
        }
        if (month == 12){
            if (day <= 21){
                System.out.println("Yay burcu");
            }else if (day > 31){
                System.out.println("Hatalý giriþ yaptýnýz");
            }else{
                System.out.println("Oðlak burcu");
            }
        }
        if (month > 12){
            System.out.println("Hatalý giriþ yaptýnýz!");
        }

    }

}

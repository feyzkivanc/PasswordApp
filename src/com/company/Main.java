package com.company;

import java.util.Scanner;

public class Main {
        /*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre
        ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, " +
        "lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/

    public static void main(String[] args) {
        String pass = "3edp67d";
        Scanner scan = new Scanner(System.in);
        System.out.print("please enter your password: ");
        String pass1 = scan.nextLine();
        if (pass.equals(pass1)) {
            System.out.println("Login success");
        } else {
            System.out.print("Password is not correct. Do you want change your password? yes or no: ");
            String answer = scan.nextLine();
            if (answer.equals("yes")) {
                System.out.print("enter new password: ");
                String newPass = scan.nextLine();
                if (newPass.equals(pass)) {
                    System.out.print("Please enter a another password:");
                } else {
                    System.out.print("Password created. Thanks!");
                }

            } else {
                System.out.println("Have a nice day!");
            }
        }
    }
}

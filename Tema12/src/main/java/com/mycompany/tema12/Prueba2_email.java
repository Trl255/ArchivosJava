package com.mycompany.tema12;

import java.util.Scanner;

/**
 * @author josea
 */
public class Prueba2_email {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un mail");
        System.out.println("");
        String mail = sc.nextLine();

        comprobarMail(mail);

    }

    static void comprobarMail(String mail) {

        boolean punto = false;
        int arroba = 0;

        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                arroba++;
            }

        
        if (mail.charAt(i) == '.') {

            punto = true;
        }
}
    }
}

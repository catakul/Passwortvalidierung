package de.neufische;

/*
Plan Passwortvalidierung:
Methode für die Länge des Passwortes
oder copy paste regex?
 */

public class PasswordValidator {
    public static void main(String[] args) {


    String password = "lis547uitzutzutut";
        boolean val = isPasswordLongEnough(password);
        System.out.println(val);
    }
    public static boolean isPasswordLongEnough(String password) {
        if(password.length()>10){

            return true;
        };
        return false;
    }

    public static boolean isStringWithLetters(String s) {

        return true;
    }
}
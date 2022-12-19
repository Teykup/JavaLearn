package Intellegent.mlkt;

import java.util.Scanner;

public class q6 {
    //6  -->>  Write a return method that can verify if a password is valid or not.
    //requirements:
    //Password MUST be at least have 6 characters and should not contain space
    //Password should at least contain one upper case letter
    //Password should at least contain one lowercase letter
    //Password should at least contain one special characters
    //Password should at least contain a digit
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        System.out.println("passwordCheck(password) = " + passwordCheck(password));
    }

    private static boolean passwordCheck(String password) {

        if (password.length() < 6 || password.contains(" "))
            return false;
        else {

            int upperCaseCount = 0;
            int lowerCaseCount = 0;
            int specialCharacterCount = 0;
            int digitCount = 0;
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= 65 && password.charAt(i) <= 90) ;
                upperCaseCount++;
                if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') ;
                lowerCaseCount++;
                if (password.charAt(i) >= 33 && password.charAt(i) <= 47
                        || password.charAt(i) >= 58 && password.charAt(i) <= 64
                        || password.charAt(i) >= 91 && password.charAt(i) <= 96
                        || password.charAt(i) >= 123 && password.charAt(i) <= 126) ;
                specialCharacterCount++;
                if (password.charAt(i) >= 0 && password.charAt(i) <= 9) ;
                digitCount++;

            }
            return upperCaseCount > 0 && lowerCaseCount > 0 && specialCharacterCount > 0 && digitCount > 0;
        }

    }
}

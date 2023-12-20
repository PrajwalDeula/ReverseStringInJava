import java.io.*;
import java.util.Scanner;

class FCG{
    public static void main(String[] args) {

        String str = "Hello";
        String nstr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
            System.out.print("Start: " + str);
            System.out.println("");


        System.out.println("Reversed: " + nstr);


    }

}
package Strings;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String string=sc.nextLine();
        String rev="";
        for(int i=0;i<string.length();i++){
            rev=string.charAt(i)+rev;
        }
        System.out.println("reverse of string is: "+rev);
    }
}

package Strings;

import java.util.Scanner;

public class Palindorme {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String string=sc.nextLine();
        String s=string;
        String rev="";
        for(int i=0;i<string.length();i++){
            rev=string.charAt(i)+rev;
        }
        if(rev.equals(s)){
            System.out.println("string is palindrom");
        }
        else{
            System.out.println("string is not palindrom");
        }
    }
}

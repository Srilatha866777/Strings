package Strings;

import java.util.Scanner;

public class countvowels {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String string=sc.nextLine();
        int v=0;
        int c=0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)=='a'||string.charAt(i)=='A'||string.charAt(i)=='e'||string.charAt(i)=='E'||string.charAt(i)=='i'||string.charAt(i)=='I'||string.charAt(i)=='o'||string.charAt(i)=='O'||string.charAt(i)=='u'||string.charAt(i)=='U'){
                v++;
            }
            else{
                c++;
            }
        }
        System.out.println("number of vowels:"+v);
        System.out.println("number of consonents:"+c);
    }
    
}

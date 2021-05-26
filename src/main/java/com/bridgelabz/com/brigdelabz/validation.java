package com.bridgelabz.com.brigdelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validation {
    public static String s;
    public boolean FristName()
    {
        System.out.println("enter the first name");
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        String parttern = "^[A-z]+[a-z]{3,}";
        Pattern pattern = Pattern.compile(parttern);
        Matcher matcher = pattern.matcher(s);
        System.out.println(s);
        return matcher.find();
    }
    public boolean LastName()
    {
        System.out.println("enter the Last name");
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        String parttern = "[A-z]+[a-z]{3,}+[0-9]";
        Pattern pattern = Pattern.compile(parttern);
        Matcher matcher = pattern.matcher(s);
        System.out.println(s);
        return matcher.find();
    }
}

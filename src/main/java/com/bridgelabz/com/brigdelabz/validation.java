package com.bridgelabz.com.brigdelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validation {
    public static String s;

    public boolean FristName() {
        System.out.println("enter the first name");
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        String parttern = "^[A-z]+[a-z]{3,}";
        Pattern pattern = Pattern.compile(parttern);
        Matcher matcher = pattern.matcher(s);
        System.out.println(s);
        return matcher.find();
    }

    public boolean LastName() {
        System.out.println("enter the Last name");
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        String parttern = "[A-z]+[a-z]{3,}+[0-9]";
        Pattern pattern = Pattern.compile(parttern);
        Matcher matcher = pattern.matcher(s);
        System.out.println(s);
        return matcher.find();
    }

    public boolean email() {
        System.out.println("enter the Email name");
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        String parttern = "[a-z.a-z]+@[a-z0-9+.a-z+in]";
        Pattern pattern = Pattern.compile(parttern);
        Matcher matcher = pattern.matcher(s);
        System.out.println(s);
        return matcher.find();
    }

    public boolean mobilel() {
        System.out.println("enter the Mobile name");
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        String parttern = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$";
        Pattern pattern = Pattern.compile(parttern);
        Matcher matcher = pattern.matcher(s);
        System.out.println(s);
        return matcher.find();
    }

    public boolean PassWord() {
        System.out.println("enter the Password name");
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        String parttern = "[*.! @#$%^&(){}[]:;<>,.?/~_+-=|\\]]]";
        Pattern pattern = Pattern.compile(parttern);
        Matcher matcher = pattern.matcher(s);
        System.out.println(s);
        return matcher.find();
    }
}
package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(info(generateRandomAge(),28));
        System.out.println(info(generateRandomAge(),26));
        System.out.println(info(generateRandomAge(),28));
        System.out.println(info(generateRandomAge(),22));
        System.out.println(info(generateRandomAge(),26));
    }
    public static String info (int age,int temperature){
        if (age>20 && age<45 && temperature>-20 && temperature<30){
            return "“Можно идти гулять”";
        }else if (age<20 && temperature>0 && temperature<30){
            return "“Можно идти гулять”";
        }else if (age>45 && temperature>-10 && temperature<25){
            return "“Можно идти гулять”";
        }else{
            return "“Оставайтесь дома”";
        }
    }
    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(100)+1;
    }
}

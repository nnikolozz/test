package org.example;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {

//        double x = 2;
//        double y = 3;
//        double k = 1 + x + Math.pow(y, 2) / 2;
//        System.out.println("Sum is" + k);
//
//        double y = (Math.pow(2, 3) + Math.pow(3, 2))
//                / (1-(Math.pow(2, 2) - Math.pow(3, 3))
//                / 2);
//        System.out.println("Sum is" + y);


//
//        double x = Math.sqrt(1 + Math.sqrt(Math.abs(9)));
//        System.out.println("Sum is" + x);
//
//
//
//        double x = (1+5)*(5 + Math.sqrt(5-1)/4) / Math.exp(5-1);
//        System.out.println("Sum is " + x);


//        double x = Math.sin(Math.pow(4, 3)) +
//                Math.pow(Math.cos(Math.pow(4, 4)), 3) -
//                Math.exp(Math.sqrt(4));
//        System.out.println("Sum is " + x);

//        double x = 1 + Math.abs(2) + (Math.abs(3 + 1));
//        System.out.println("Sum is " + x);


//        double x = (Math.abs(5) - Math.abs(3))/(1 + Math.log(7));
//        System.out.println("Sum is " + x);


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("შეიყვანეთ u:");
//        int u = scanner.nextInt();
//
//        System.out.println("შეიყვანეთ r:");
//        int r = scanner.nextInt();
//
//        int j = u / r;
//
//        if(u / r == 0){
//            System.out.println("error");
//        }
//        System.out.println("დენის ძალა უდრის " + j);


//        int a = 5;
//        int b = 5;
//        int c = 5;
//        int d = 5;
//        int e = 5;
//
//        int result = (a + b + c + d + e) / 5;
//        System.out.println(result);

//
//        int a = 10;
//        int b = 15;
//        int c = 20;
//        int d = 25;
//        int e = 35;
//
//        double result = Math.pow(a * b * c * d * e, 1.0 / 5);
//        System.out.println(result);


//        String name = "Nikoloz";
//        int age = 19;
//        String city = "Gori";
//        String profession = "Developer";

//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("City: " + city);
//        System.out.println("Profession: " + profession);

//        System.out.println("Name: " + name + "\nAge: " + age + "\nCity: " + city + "\nProfession: " + profession);
//
//
//

//        int currentyear = LocalDate.now().getYear();
//        int age = 20;
//        int result = LocalDate.now().getYear() - age;
//        System.out.println("დაბადების წელია :" + result);
//
//        int currentyear = LocalDate.now().getYear();
//        int birthdate = 2006;
//        int result = currentyear - birthdate;
//        System.out.println("თქვენი ასაკია: " + result);


//        Fibonach

//        int a = 0;
//        int b = 1;
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print(a + " ");
//            int next = a + b; // next = 1
//            a = b;    //1 = 1 a აიღო b ს მნიშვნელობაქ
//            b = next; // b = 1 აიღო next ის მნიშვნელობა
//        }


        //Parse to int......
//        int  a = 15;
//        double result = a;
//        System.out.println(result);

//        double x = 19.99;
//        int result = (int) x;
//        System.out.println(result);

//
//        int number = 123;
//        String text = String.valueOf(number);
//        System.out.println(text);


//        String text = "123";
//        int number = Integer.parseInt(text);
//        System.out.println(number  + 10);
//
//        String a = new String("Java");
//        String b = new String("Java");
//
//        System.out.println(a == b);
//        System.out.println(a.equals(b));


//        int a = 10;
//        int b = a;
//
//        b = 20;
//
//        System.out.println(a); // 10
//        System.out.println(b); // 20


//        String name = "JAVA";
//        name = name.toLowerCase(); // Reassign to update the variable
//        System.out.println(name);
////
//        int [] numbers = {1,2,3,4};
//        int [] numbers2 = {5,6,7,8};
//        numbers = numbers2;
//        numbers2[1] = 10;
//        System.out.println(numbers[1]);
//        System.out.println(numbers2[1]);


//        int a = 5;
//        int b = 10;
//        b=a;
//        System.out.println(b);

//        String text = "Java";
//        text = text + " is cool";
//        System.out.println(text);
//

//
//        HashMap<Long, String> list = new HashMap<>();
//
//        list.put(1L, "Java");
//        list.put(2L, "Python");
//        list.put(3L, "C#");
//        list.put(4L, "C++");
//
//    for (long key : list.keySet()) {
//        System.out.println(key + ". " + list.get(key));
//    }
//        byte number = 127;
//        number++;
//        System.out.println(number);

//        int number = Integer.MAX_VALUE;
//    number++;
//        System.out.println(number);

//
//        String text = "Java";
//        String text1 = "Java";
//        System.out.println(text == text1);
//        System.out.println(text.equals(text1));


//        int[] numbers = {5, 10, 15};
//        numbers[1] = 50;
//        System.out.println(numbers.length);

//
//        int[] a = {1,2};
//        int [] b = a;
//        b[0] = 15;
//        System.out.println(a[0]);


//        int number = 5;
//        System.out.println(number);
//        ++number;
//        System.out.println(number);



        int a = 10;
        double b = a;

        float c = 5.5f;
        double d = c;
        System.out.println(d);

    }
}
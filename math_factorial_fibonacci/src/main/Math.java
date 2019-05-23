package main;

import java.util.Scanner;

public class Math {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Co chcesz zrobić ?:");
        System.out.println("1-Obliczyć silnię");
        System.out.println("2-Wyznaczyc ciąg Fibonancciego");
        int choice = in.nextInt();

        switch (choice){
            case 1:
                System.out.println("Wybrałeś obliczenie silni");
                System.out.println(factorial(choice));
                break;
            case 2:
                System.out.println("Wybrałeś oblicznie ciągu Fibonacciego: ");
                System.out.println(fib(choice));
                break;
        }
    }

    public static  Long factorial(int number){
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        number = in.nextInt();
        long fact = 1;

        for (int i = 2; i <=number;i++ ){
            fact = fact * i;
        }
        //System.out.println(fact);
        return fact;
    }

    public static Integer fib(int n){

        Scanner in = new Scanner(System.in);
        int i = 1;

        int firstElement = 0;
        int secondElement = 1;


        System.out.println("Podaj ile ma być elementów ciągu: ");
        n = in.nextInt();

        while (i <=n){
            System.out.print(firstElement + " + ");

            int sequence = firstElement + secondElement;
            firstElement = secondElement;
            secondElement = sequence;

            i++;

        }
        return secondElement;
    }
}


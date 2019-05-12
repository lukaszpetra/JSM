package main;

import java.util.Scanner;

public class Morse {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        char[] letters = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
                'p','q','r','s','t','u','v','w','x','y','z'};

        String[] morseCode = {" ",".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",".--.","--.-",".-.","...",
                "-","..-","...-",".--","-..-","-.--","..--"};

        String textToChange = "";
        String newText = "";

        System.out.println("Wpisz tekst do przekonwertowania: ");
        textToChange = in.nextLine();

        textToChange = textToChange.toLowerCase();

        for (int i = 0; i < textToChange.length(); i++){
            for (int j = 0; j<27; j++){
                if (textToChange.charAt(i) == letters[j]){
                    newText +=morseCode[j];
                    newText += "  ";
                }
            }
        }

        System.out.println("Twój tekst po przekonwertoaniu alfabetem Morse'a: ");
        System.out.println(newText);

    }


}


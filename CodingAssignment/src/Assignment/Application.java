package Assignment;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your word...");
        String word = input.nextLine();
        System.out.println("Magic number for the word \""+word +"\" is "+ calMagicNum(word));

    }

    public static int calMagicNum(String word){
        String[] wordSet = word.split(" ");

        String firstWord = wordSet[0].toUpperCase();
        int magicNum = 0;

        for(int i = 0; i<firstWord.length(); i++){
            if (Character.isLetter(firstWord.charAt(i))){
                magicNum += (int)firstWord.charAt(i) - 64;
            }
        }

        return magicNum;
    }
}



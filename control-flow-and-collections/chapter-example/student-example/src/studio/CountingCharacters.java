package studio;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        String input = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = input.toCharArray();

        HashMap<Character,Integer> myString = new HashMap<>();
        for(char character: charactersInString ){
            if(myString.containsKey((character))){
                myString.put(character,myString.get(character) +1);
            }else{
                myString.put(character,1);
            }
        }
        System.out.println(myString);

    }
}

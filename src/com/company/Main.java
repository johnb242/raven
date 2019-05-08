package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<String> goodwords = new ArrayList<String>();
        goodwords.add("good");
        goodwords.add("glad");
        goodwords.add("happy");
        goodwords.add("relaxed");
        goodwords.add("accomplished");
        goodwords.add("alert");
        goodwords.add("creative");

        ArrayList<String> badwords = new ArrayList<String>();
        badwords.add("bad");
        badwords.add("sad");
        badwords.add("tired");
        badwords.add("angry");
        badwords.add("anxious");
        badwords.add("hungry");
        badwords.add("moody");
        badwords.add("afraid");

        String listwords = "";
        while (!listwords.equals("q")) {
            Scanner enterfeelings = new Scanner(System.in);
            System.out.println("Good morning, how are you feeling today?");
            listwords = enterfeelings.nextLine();
            String str = listwords;
            String split[] = str.split(" ", 0);

//                for(String s:split)
//                    System.out.println(s);
            int counterforgoodwords = 0;
            int counterforbadwords = 0;
            for (int array1 = 0; array1 < split.length; array1++) {
                for (int array2 = 0; array2 < goodwords.size(); array2++) {
                    if (split[array1].equalsIgnoreCase(goodwords.get(array2))) {
                        counterforgoodwords++;
                        //   System.out.println(+counterforgoodwords);
                    }
                }
                for (int array3 = 0; array3 < badwords.size(); array3++) {
                    if (split[array1].equalsIgnoreCase(badwords.get(array3))) {
                        counterforbadwords++;


                    }
                }

            }
            if (counterforgoodwords > counterforbadwords) {
                System.out.println("I am so happy for you.. yay!");
            }
            if (counterforgoodwords < counterforbadwords) {
                System.out.println("Really! why? tell me more!");
            }
            if (counterforgoodwords == counterforbadwords) {
                System.out.println("Meh");

            }


        }
    }
}

//        if (goodwords.contains(listwords)) {
//            System.out.println(listwords + " is a happy word");
//        } else{
//            System.out.println((listwords + " is sad word"));
//        }


//for  (int counter = 0; counter < badwords.size(); counter++){
//    if listwords.nextLine().equals(badwords.get(counter))

//   }

// positive words- good, glad, happy, relaxed, accomplished, alert, creative

//                negative words-bad, sad, tired, angry, anxious, hungry, moody, afraid

//    if (numberofpositivewords > numberofnegativewords)

//     System.out.println("I am so happy for you yay");
//  if(numberofnegativewords > numberofpositivewords)

//       System.out.println("really! why? tell me more");
//   if (numberofpositivewords = numberofnegativewords)
//
//        System.out.println("meh");
//     System.out.println("to quit talking enter q");

//     Display chat history;


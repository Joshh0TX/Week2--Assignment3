package org.example.fx;

//Program that detects substrings in a sentence
public class StringDetect {
    public static void main(String[] args) {
        String sentence = "We are living in a yellow submarine. We don't have anything else. Inside the submarine is very tight. So we are drinking" +
                " all the day. We will move out of it in 5 days.";

        String[] splitSentence = sentence.split(" ");

        for (int i = 0; i < splitSentence.length ; i++) {
            if (splitSentence[i].contains("in")) {
                System.out.println(splitSentence[i]);
            }
        }
    }

}

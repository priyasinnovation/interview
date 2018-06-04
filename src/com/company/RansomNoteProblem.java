package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by pshivra on 5/29/2018.
 */
public class RansomNoteProblem {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String args[])
    {
        //String[] mn = scanner.nextLine().split(" ");

        int m = 6;

        int n = 4;

        String[] magazine = new String[m];

        String[] magazineItems = "give me one grand today night".split(" ");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] ransom = new String[n];

        String[] ransomItems = "give one grand today".split(" ");

        for (int i = 0; i < n; i++) {
            String ransomItem = ransomItems[i];
            ransom[i] = ransomItem;
        }

        Map<String,Integer> frequency = new HashMap<>();

        for(String word : magazine)
        {
            if(frequency.containsKey(word))
            {
                frequency.put(word, frequency.get(word) + 1);
            }else {
                frequency.put(word,1);
            }
        }

        Map<String,Integer> freqRanson = new HashMap<>();

        for(String word : ransom)
        {
            if(freqRanson.containsKey(word))
            {
                freqRanson.put(word, freqRanson.get(word) + 1);
            }else {
                freqRanson.put(word,1);
            }
        }

        boolean canReplicate = true;
        for(String s : freqRanson.keySet()){
            if(!frequency.containsKey(s) || (freqRanson.get(s)>frequency.get(s))){
                canReplicate = false;
                break;
            }
        }
        System.out.println(canReplicate?"Yes":"No");
    }
}

package com.hcc.Java8Features;

import java.util.*;

public class AnagramStrings {
    public static void main(String[] args){
        String str[] = {"aba","aba","sam","ram","abba","abba","mas"};
        Map<String, List<String>>map = new HashMap<>();

        for(String s:str){
           char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedString = new String(ch);

            map.computeIfAbsent(sortedString,k->new ArrayList<>()).add(s);
        }

        for(List<String>val: map.values())
            if(val.size()>1){
                System.out.println("Anagram group: "+val);
            }
    }
}

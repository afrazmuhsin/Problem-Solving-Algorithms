package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class StringProblems {
    public void testMethod(){
        System.out.println("This class is String Problems");
    }

    /**
     * This method helps us to find the duplicate characters from string
     * @param str
     */
    public void duplicateCharacters(String str){
        char c[] =  str.toCharArray();
        HashSet<Character> characters = new HashSet<Character>();
        ArrayList duplicateCharacters = new ArrayList();
        for(int i=0;i<c.length;i++){
            if(!duplicateCharacters.contains(c[i])){
                if(!characters.add(c[i])){
                    duplicateCharacters.add(c[i]);
                }
            }
        }
        for (int i=0;i<duplicateCharacters.size();i++){
            System.out.println("Duplicate Numbers are : " + duplicateCharacters.get(i));
        }
    }
}

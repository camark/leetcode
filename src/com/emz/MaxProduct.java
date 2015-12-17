package com.emz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by gongming on 15-12-17.
 */
public class MaxProduct {
    public int maxProduct(String[] words)
    {
        int max=0,max_i=0,max_j=0;


        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int len1 = o1.length();
                int len2 = o2.length();

                if (len1 < len2) {
                    return 1;
                } else if (len1 > len2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        //for(String s:words)
        //System.out.println(s);

        for(int i=0;i<words.length;i++)
        {
            for (int j=i;j<words.length;j++)
            {
                int multi_len= words[i].length() * words[j].length();
                if(multi_len>max){
                    if(!isHaveSameChar(words[i],words[j])){
                        max=multi_len;
                        max_i=i;
                        max_j=j;
                    }
                }
            }
        }

        System.out.println(max);
        System.out.println(words[max_i]);
        System.out.println(words[max_j]);

        return max;
    }
    public static boolean isHaveSameChar(String s1,String s2)
    {
        //String s3=GetMinString(s1);

        //String s4=GetMinString(s2);

        String s3=s1;
        String s4=s2;
        for (char c :s3.toCharArray()){
            for (char c1: s4.toCharArray()) {
                if (c == c1)
                    return true;
            }
        }

        return false;
    }

    public static String GetMinString(String s)
    {
        Set<Character> words= new HashSet<Character>();

        for (Character c: s.toCharArray())
            words.add(c);

        StringBuilder sb=new StringBuilder();

        for(char c:words)
            sb.append(c);

        return sb.toString();

    }
}

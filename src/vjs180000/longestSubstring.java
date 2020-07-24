package vjs180000;

import java.util.HashMap;
import java.util.Map;

public class longestSubstring {
    public static void main(String[] args) {
        String input=args[0];
        int ans=helper(input);
        System.out.println(ans);
    }

    private static int helper(String input) {
        int n=input.length();
        int answer=0;
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0,j=0;j<n;j++){
            if(map.containsKey(input.charAt(j))){
               i=Math.max(i,map.get(input.charAt(j)));

            }
            answer=Math.max(answer,j-i+1);
            map.put(input.charAt(j),j+1);
        }
        return answer;
    }
}

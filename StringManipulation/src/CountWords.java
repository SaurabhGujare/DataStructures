//Write a Java Program to count the number of words in a string using HashMap

import java.util.HashMap;

public class CountWords {
    public static void main(String[] args){
        String str="This is is done by Gaurao Gaurao gaurao";
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();

        String[] split = str.split(" ");
        for(String word:split){
            System.out.println("|"+word);
        }

        for(int i=0;i<split.length;i++){
            if(hashMap.containsKey(split[i])){
                int count = hashMap.get(split[i]);
                hashMap.put(split[i],count+1);
            }else{
                hashMap.put(split[i], 1);
            }
        }

        System.out.println("Words:\n"+hashMap);

    }
}

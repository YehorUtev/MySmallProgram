package mycode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> hashSet = new HashSet<>();
        String text;
        while(true){
            text = bufferedReader.readLine();
            if(text.equals("")){
                break;
            }
            hashSet.add(text);
        }
        System.out.println("List of products is finished, go shopping :)");
        String product;
        while(!hashSet.isEmpty()){
            System.out.println("Left to buy: ");
            for(String list : hashSet){
                System.out.println(list);
            }
            System.out.println("Please input product to remove: ");
            product = bufferedReader.readLine();
            if(hashSet.contains(product)){
                hashSet.remove(product);
            }else{
                System.out.println("There is no such product as: " + product);
            }
        }
        System.out.println("You bought everything go home :)");
    }
}

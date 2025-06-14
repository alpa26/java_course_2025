package timus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Task1545 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Character, List<String>> dict = new HashMap<>();
        in.nextLine();
        for (int i =0;i<n;i++)
        {
            String str = in.nextLine();
            Character key = str.charAt(0);
            if(dict.containsKey(key)){
                List<String> list = dict.get(key);
                if(!list.contains(str))
                    list.add(str);
            }
            else{
                dict.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
            }
        }
        String found = in.nextLine();
        if(dict.containsKey(found.charAt(0)))
        {
            List<String> list = dict.get(found.charAt(0));
            for (String el: list)
            {
                System.out.println(el);
            }
        }
    }
}

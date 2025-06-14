package timus;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Task1563 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashSet<String> hashSet = new HashSet<>();
        in.nextLine();
        int count = 0;
        for (int i =0;i<n;i++)
        {
            String str = in.nextLine();
            if(hashSet.contains(str)){
                count ++;
            } else
            {
                hashSet.add(str);
            }
        }
        System.out.println(count);
    }
}

package timus;

import java.util.Arrays;
import java.util.Scanner;

public class Task1931 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.nextLine();
        int[] nums = Arrays.stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] eqCount = new int[n];
        int target = nums[0];
        int targetId = 0;
        for (int i = 1; i< n; i++)
        {
            eqCount[targetId]++;
            eqCount[i]++;
            if(target > nums[i] || i == n-1 )
            {
                target = nums[i];
                targetId = i;
            }
        }
        int maxIndex = 0;
        for (int i = 1; i < eqCount.length; i++) {
            if (eqCount[i] > eqCount[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println(maxIndex+1);
    }
}






package timus;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Task1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(nums.get(0)* nums.get(1) *nums.get(2)*2);
        in.close();
    }
}

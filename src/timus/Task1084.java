package timus;

import java.util.Scanner;

public class Task1084 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] part = in.nextLine().split(" ");;
        int G = Integer.parseInt(part[0]);
        int R = Integer.parseInt(part[1]);
        if(G/2.0 >= R)
            System.out.printf("%.3f",Math.PI * R * R);
        else if(R >= (G/2.0)*Math.sqrt(2))
            System.out.printf("%.3f",(double)(G * G));
        else{
            double a = 2*Math.acos(G/(2.0*R));
            double serg = 0.5 * R * R * (a - Math.sin(a));
            System.out.printf("%.3f",Math.PI * R * R - 4 * serg);
        }
    }
}

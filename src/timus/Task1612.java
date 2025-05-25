package timus;

import java.util.Scanner;

public class Task1612 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int countTram = 0;
        int countTroll =0;
        StringBuilder sb = new StringBuilder();
        while (in.hasNextLine())
        {
            String line = in.nextLine();
            sb.append(line).append(" ");
        }
        String[] words = sb.toString().split("[\\s.,!?:;\\-]+");
        for (String word : words)
        {
            if (word.length() != 4 && word.length() != 10)
                continue;
            else
            {
                if(word.equals("tram"))
                {
                    countTram++;
                    continue;
                }
                if(word.equals("trolleybus"))
                    countTroll++;
            }
        }
        if(countTram>countTroll)
            System.out.println("Tram driver");
        else if(countTram<countTroll)
            System.out.println("Trolleybus driver");
        else
            System.out.println("Bus driver");
    }
}

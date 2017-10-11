import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int nrOfStings = Integer.parseInt(sc.nextLine());
        for(int nr = 0; nr < nrOfStings; nr++){
            String s = sc.nextLine();
            String evenStr = new String();
            String oddStr =  new String();
            for(int i = 0; i < s.length(); i++){
                if (i % 2 == 1)
                    oddStr += s.charAt(i);
                else
                    evenStr += s.charAt(i);
            }
            System.out.println(evenStr + " " + oddStr);
        }
        
    }
}
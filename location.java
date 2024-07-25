import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);
        int a=y.nextInt();
        int b=y.nextInt();
        int c=y.nextInt();
        int d=y.nextInt();
        System.out.println("Max's house is located at ("+((float)(a+c)/2)+", "+((float)(b+d)/2)+")");
    }
}

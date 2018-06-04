package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotationArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }


        for (int i=0;i<k;i++)
        {
            int temp = a[0];
            for (int j=0;j<n-1;j++)
            {
                a[j] = a[j+1];
                a[j+1] = temp;
            }
            System.out.println(a[0] + " " + a[1] + " " +  a[2] + " " +a[3] +  " " + a[4]);
        }

        System.out.println(Arrays.toString(a).replace(",","").replace("[","").replace("]", ""));

        scanner.close();
    }
}

package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by pshivra on 5/20/2018.
 */
public class LeftRotationModuloExample {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);
        int a[] = new int[n];

        String[] aItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        int newArray[] = new int[n];
        for(int i = 0; i < n; i++){
            int newLocation = (i + k) % n;
            System.out.println(newLocation);
            newArray[i] = a[newLocation];
        }

        System.out.println(Arrays.toString(newArray).replace(",","").replace("[","").replace("]", ""));

    }
}

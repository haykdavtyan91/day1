package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[] = {3, 60, 35, 4, 45, 320, 8};
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - 1); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                //System.out.println("J- " + arr[j]);
            }

            System.out.println(arr[i]);

        }

        System.out.println("min is: " + arr[0]);
        System.out.println("max is: " + arr[arr.length - 1]);
    }
}
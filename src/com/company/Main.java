package com.company;

public class Main {

    public static void main(String[] args) {
        int [] num= { 4,3,5,12,35,4,653,3,45};


        for(int i : num){
            System.out.print(" " + i);
        }

        System.out.println("\n");
        insertionSort(num);

        for(int i : num){
            System.out.print(" " + i);
        }


    }



    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int valueToSort = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > valueToSort) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = valueToSort;
        }
    }
}
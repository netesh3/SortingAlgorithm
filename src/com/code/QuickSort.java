package com.code;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={9,2,6,8,3,4,5,0,7};
        int low = 0;
        int high = arr.length-1;
        quickSort(arr,low,high);
        for (var i =0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low<high){
            int pi = partioning(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }

    }
    private static int partioning(int[] arr,int l,int r) {
        int i = l-1;
        int j = l;
        while (j<r){
            if(arr[j]<arr[r]){
                i++;
                //swap i and j value
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }else {
                j++;
            }
        }
        //swap (i+1) with pivot
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        return i+1;
    }
}

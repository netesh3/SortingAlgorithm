package com.code;

public class LargestMountain {
    public static void main(String[] args) {
        int A[]={875,884,239,731,723,685};
        int res = longestMountain(A);
        System.out.println(res);
    }
    public static int longestMountain(int[] A) {
       int max =0;
        int start = 0;
        int len = A.length;
        while (start<len){
            int end = start;
            if(end+1<len && A[end]<A[end+1]){
                while (end+1<len && A[end]<A[end+1]){
                    end++;
                }
                if(end+1<len && A[end]>A[end+1]){
                    while (end+1<len && A[end]>A[end+1]){
                        end++;
                    }
                    max = Math.max(max,end-start+1);
                }
            }
            start = Math.max(end, start + 1);
        }
       return max;
    }
}

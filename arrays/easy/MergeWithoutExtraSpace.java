/**
 * https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1
 * 
 */

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class MergeWithoutExtraSpace
{
    public static void main(String[] args){
        long[] arr = new long[]{4,5,8,9};
        long[] arr2 = new long[]{0,2,67};
        int n= arr.length;
        int m = arr2.length;
        merge(arr,arr2,n,m);
    }
    
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int i=n-1;
        int j=0;
        
        while(i>=0 && j<m){
            if(arr1[i]>arr2[j]){
                long temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--;
                j++;
            }else{
                break;
            }
        }
         Arrays.sort(arr1);
         Arrays.sort(arr2);
         
         for(long it: arr1){
            System.out.println(it);
         }
         for(long it: arr2){
            System.out.println(it);
         }
    }
}


    

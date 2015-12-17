package com.emz;

/**
 * Created by gongming on 15-12-17.
 */
public class MaxSubArray {
    public int maxSubArray(int[] array){
        int n=array.length;
        int all=array[n-1],start=array[n-1];
        int count=0;
        for(int i=n-2;i>=0;i--){
            if((start+array[i])>array[i]){
                start=start+array[i];
            }else{
                start=array[i];
            }
            if(all<start){
                all=start;
            }
            count++;
        }
        //System.out.println("数组长度="+array.length+"||时间复杂度="+count);
        return all;
    }

}

package LEETCODE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class findMedianSortedArrays_4 {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        // List<Integer>Sorted=new ArrayList<>();
        
        // for ( int i= 0; i<nums1.length;i++){
        //     Sorted.add(nums1[i]);
        // }
        // for ( int i= 0; i<nums2.length;i++){
        //     Sorted.add(nums2[i]);
        // }
        // Collections.sort(Sorted);
        

        // if(Sorted.length%2==0){
        //     int Median=Sorted.length/2;
        //     System.out.println("Median"+ Median);
        //     float a=(float)((Sorted.get(Median))+(Sorted.get(Median-1)))/2;
        //     System.out.print(a);
        // }else{
        //     int Median=Sorted.length/2;
        //     float a=Sorted.get(Median);
        //     System.out.println(a);
        // }

        // -------------------------------------------------------------------------------------------------------------



        int[] Sorted =new int[nums1.length+nums2.length];
        
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while(p1<nums1.length ||p2<nums2.length){

            int val1 = p1<nums1.length? nums1[p1] : Integer.MAX_VALUE;
            int val2 = p2<nums2.length? nums2[p2] : Integer.MAX_VALUE;

            if(val1<val2){
                Sorted[p3]=val1;
                p1++;
            }else{
                Sorted[p3]=val2;
                p2++;
            }
            p3++;

            
        }
        if(Sorted.length%2==0){
            int Median=Sorted.length/2;
            float a=(float)((Sorted[Median])+(Sorted[Median-1]))/2;
            System.out.print(a);
        }else{
            int Median=Sorted.length/2;
            float a=Sorted[Median];
            System.out.println(a);
        }
        
        
        
    }
}

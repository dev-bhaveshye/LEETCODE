package LEETCODE;

public class increasingTriplet_334 {
    static boolean increasingTriplet_334(int[] nums){
        // int first =1000;
        // int second=1000;
        // int third =1000;
        // for(int i=0;i<arr.length;i++){
        //     first=second;
        //     second=third;
        //     third = arr[i];

        //     if(first<second && second<third){
        //         return true;
        //     }

        // }
        // return false;

        int first =Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        int third =Integer.MIN_VALUE;
        for (int num : nums) {
            if (num <= first) {
                first = num;
                System.out.println("first"+first);
            } else if (num <= second) {
                second = num;
                System.out.println("second"+second);
            } else {
                // num > second, found third number
                System.out.println("Triplet: " + first + ", " + second + ", " + num);
                return true;
            }
        }
    
        return false;
        
        
    }

    public static void main(String[] args) {
        int[] arr={1,1,-2,6};
        boolean result=increasingTriplet_334(arr);
        System.out.println(result);
    }
}

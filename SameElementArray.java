package LEETCODE;

public class TRIAL {
    public static void main(String[] Args)throws ArrayIndexOutOfBoundsException{
        int[] arr= {4,8,6,9};
        boolean found= false ;
        for (int i = 0; i < arr.length; i++) {
            int arr1 = arr[i];
        
            if (i + 1 < arr.length && arr1 == arr[i + 1]) {
                System.out.println(arr1);
                found = true;
            } else if (i + 2 < arr.length && arr1 == arr[i + 2]) {
                System.out.println(arr1);
                found = true;
            } else if (i + 3 < arr.length && arr1 == arr[i + 3]) {
                System.out.println(arr1);
                found = true;
            }
    }
    if (!found) {
        System.out.println("-1");
    }
}
}

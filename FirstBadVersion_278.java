package DSA.HackWithInfy.Binary_Search;



public class FirstBadVersion_278 extends VersionControl{
    public static void main(String[] args){

        int n = 3 ; 

        int i = 1 ; 
        int j = n ;
        int mid = 0;

        while ( i < j){

            mid = (i+j)/2;

            if(isBadVersion(mid)==true){
                j=mid;
            }else{
                i = mid+1;
            }
        }
        System.out.println(i);
    }
}

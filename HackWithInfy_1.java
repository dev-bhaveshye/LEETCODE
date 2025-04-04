package DSA;
import java.util.*;



 

public class HackWithInfy_1 {
    static int calculate(int energy, int[] exercise){
        Arrays.sort(exercise);
        int count=0;
            
            for(int i=exercise.length-1;i>=0;i--){
                for(int j=0;j<2;j++){
                    energy=energy-exercise[i];
                    count++;
                    if(energy<=0){
                        return count;
                    }
                    
                }
            }
            return -1;
    
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int N = sc.nextInt();
        int[] exc=new int[N];

    for(int i=0; i<exc.length;i++){
        exc[i]=sc.nextInt();
    }
    int result = calculate(A, exc);
    System.out.println(result);
    }
        
}


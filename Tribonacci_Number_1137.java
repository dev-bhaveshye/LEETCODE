package LEETCODE;

public class Tribonacci_Number_1137 {
    public static void main(String[] args) {
        int FirstTerm=0;
        int SecondTerm=1;
        int ThirdTerm=1;
        int n=3;
        for(int i =3; i<=n;i++){
            int FourthTerm = FirstTerm + SecondTerm + ThirdTerm;
            // int temp=FirstTerm;
            FirstTerm=SecondTerm;
            SecondTerm=ThirdTerm;
            ThirdTerm=FourthTerm;

        }
        System.out.println(ThirdTerm);
        

    }
}

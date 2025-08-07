package DSA.HackWithInfy.Greedy;

public class Check_If_It_Is_Possible_to_Survive_On_Iseland_GFG {
    
    public static void main (String[] args){


        int S = 10, N = 9, M = 8;

        if (S >= 7 && M * 7 > N * 6) {
            System.out.println(-1);
        }
        int total_need = S*M;
        int total_gain_days = S-(S/7);

        int total_balance = total_gain_days * N;

        if(total_balance<total_need){
            System.out.println(-1);
        }

        int min_buys = (int) Math.ceil((double) total_need / N);
        System.out.println(min_buys);

    }
}

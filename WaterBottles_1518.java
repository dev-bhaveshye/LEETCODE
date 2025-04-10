package LEETCODE;
public class WaterBottles_1518{
    public static void main (String[] args){
        int Total_Bottles = 9;
        int Exchange =3;
        int Result=0;
        int Exchanged=0;
        int Remain = Total_Bottles;
        Result+=Remain;
        while(Remain>=Exchange){
            Exchanged= Remain / Exchange ;
            Remain = Remain % Exchange ;
            Result+=Exchanged;
            // Exchanged = (Exchanged + Remain) /Exchange;
            // Remain = Remain % Exchange ;
            // Result+=Exchanged;
            Remain=(Exchanged + Remain);
            
        }

        System.out.println(Result);
        

    }
}
package Capgemini;

public class Replace_Vowels_With_Integer {
    public static void main(String[] args){
        String s = "bhaveshyelekar";
        char[] arr = s.toCharArray();
        int count = 0 ;

        for(int i = 0 ; i < s.length() ; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'){
                arr[i] = (char) (count + '0') ;
                count++;
            }
        }

        String result = "";
        for(char ch :arr){
            result+=ch;
        }
        System.out.println(result);
        System.out.println(count);
    }
}

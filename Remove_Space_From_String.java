package Capgemini;

public class Remove_Space_From_String {
    public static void main(String[] args){
        String s = "Hello  My   Name   is    Bhavesh   ";

        String correct = s.trim().replaceAll("\\s+" , " ");

        System.out.println(correct);
    }
}

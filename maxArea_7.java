package LEETCODE;


 class maxArea_7 {
    static int maxArea_7(int[] height){

        int i=0;
        int j=height.length-1;
        int maxscore=0;
        while(i<j){
            if(height[i]<height[j]){
                if(maxscore<height[i]*(j-i)){
                    maxscore=height[i]*(j-i);
                }
                
                System.out.println("max score is :" +maxscore + "i block");
                System.out.println("height i "+height[i]);
                System.out.println("j "+j);
                System.out.println("---------------------");
                i++;
            }
            else{
                if(maxscore<height[j]*(j-i)){
                    maxscore=height[j]*(j-i);
                }
                
                System.out.println("max score is :" +maxscore +"j block");
                System.out.println("i "+i);
                System.out.println("height j "+height[j]);
                System.out.println("---------------------");
                j--;
                
            }
            
           
        }
        return maxscore;

    }
    

    public static void main(String[] args) {
       
        int[] arr = {1,1};
        int result = maxArea_7(arr);
        System.out.println(result);
    }
}

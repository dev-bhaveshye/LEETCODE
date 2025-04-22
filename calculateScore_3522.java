package LEETCODE;


public class calculateScore_3522{
    
    public static void main(String[] args){
        String[] instructions = {"add"};
        int []values = {1};
        calculateScore_3522 cs = new calculateScore_3522();
        System.out.println(cs.calculateScore(instructions,values));
        


    }

    public long calculateScore(String[] instructions, int[] values) {
        long score =0;
        int i =0;
        boolean[] visited = new boolean[instructions.length];

        while(i >= 0 && i < instructions.length && !visited[i]){
            visited[i]=true;

            if(instructions[i].equals("jump")){
                i+=values[i];
            }else if(instructions[i].equals("add")){
                score+=values[i];
                i++;
            }else{
                System.out.println("Unknown instruction at index " + i + ": " + instructions[i]);
                break;
            }
            
        }
        return score;
    }
}
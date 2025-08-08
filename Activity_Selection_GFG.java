package DSA.HackWithInfy.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Activity_Selection_GFG {

    public static void main(String[] args){

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};

        List<double[]> job = new ArrayList<>();

        for(int i = 0; i<=start.length-1;i++){

            job.add(new double[]{start[i] , finish[i]});

        }

        Collections.sort(job , (a,b)->Double.compare(a[1] , b[1]));

        int lastFinish = (int)job.get(0)[1];
        int j =1;
        int count =1;

        while(j<=start.length-1){
            int jobstart = (int) job.get(j)[0];
            int jobend  = (int) job.get(j)[1];

            if(jobstart >= lastFinish){
                count++;
                lastFinish = jobend;
            }
            
            j++;
        }
        System.out.println(count);

    }
}

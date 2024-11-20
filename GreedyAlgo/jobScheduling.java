package GreedyAlgo;

// tc=O(n^2);
// sc=O(n);


import java.util.*;
import javax.print.attribute.standard.JobHoldUntil;

public class jobScheduling {

    char id;
    int deadline,profit;

    public jobScheduling(){

    };

    public jobScheduling(char id,int deadline,int profit){

        this.id=id;
        this.deadline=deadline;
        this.profit=profit;

    };

    void printJobSequence(ArrayList<jobScheduling>arr,int maxDeadline){
        //1. sort the arr in decreasing order of the profit
        // lambda expressions
        // tc= n log n

        int n=arr.size();
        Collections.sort(arr,(a,b)->b.profit-a.profit);

        //2. store the jod ids on the basis of the max profit and given deadline
        // to track the allocated jobs
        boolean result[]=new boolean[maxDeadline];

        // to store the job ids
        char job[]=new char[maxDeadline];
         // O(n^2)
        for(int i=0;i<n;i++) {
            for (int j = Math.min(maxDeadline - 1, arr.get(i).deadline-1);j>=0;j-- ) {

                if(result[j]==false){
                    result[j]=true;
                    job[j]=arr.get(i).id;
                    break;
                }
            }
        }

        for(char id:job){
            System.out.print(id+" ");
        }
        System.out.println();
    }





    public static void main(String [] args){

        ArrayList<jobScheduling> arr=new ArrayList<>();
        arr.add(new jobScheduling('1',5,55));
        arr.add(new jobScheduling('2',2,65));
        arr.add(new jobScheduling('3',7,75));
        arr.add(new jobScheduling('4',3,60));
        arr.add(new jobScheduling('5',2,70));
        arr.add(new jobScheduling('6',1,50));
        arr.add(new jobScheduling('7',4,85));
        arr.add(new jobScheduling('8',5,68));
        arr.add(new jobScheduling('9',3,45));



        System.out.println("job sequence order to get the maximum profit is: ");
        jobScheduling job=new jobScheduling();
        job.printJobSequence(arr,7);
    }

}

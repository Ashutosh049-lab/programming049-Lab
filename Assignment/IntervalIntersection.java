package Assignment;
import java.util.Arrays;
import java.util.Comparator;

public class IntervalIntersection {

    public static boolean IntervalIntersection(int [][] intervals){

        // sort interval based on the start time
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));

        // check overlap
        for(int i=0;i<intervals.length-1;i++){

            if(intervals[i][1] > intervals[i+1][0]){
                return true;
            }
        }

        return false; // no overlap
    }


    public static void main(String [] args){

        int[][] intervals1 = {{1, 3}, {5, 7}, {2, 4}, {6, 8}};
        int[][] intervals2 = {{1, 3}, {7, 9}, {4, 6}, {10, 13}};


        if(IntervalIntersection(intervals1)){
            System.out.println("yes");

        }else{
            System.out.println("no");
        }

        if(IntervalIntersection(intervals2)){
            System.out.println("yes");

        }else{
            System.out.println("no");
        }
    }
}

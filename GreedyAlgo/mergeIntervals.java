package GreedyAlgo;
import java.util.*;

// T C=O(n log n)+O(n)=O(n log n)
// S C=O(n);

public class mergeIntervals {
    public int[][] merge(int[][] intervals) {

        // t c=O(n log n)
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        LinkedList<int[]> merged = new LinkedList<>();
            //t c=O(n)
        for (int[] interval : intervals) {
            // Non-overlapping
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            } else {
                // Overlapping
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of intervals:");
        int n = scanner.nextInt();
        int[][] intervals = new int[n][2];

        System.out.println("Enter the intervals:");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = scanner.nextInt();
            intervals[i][1] = scanner.nextInt();
        }

        mergeIntervals solution = new mergeIntervals();
        int[][] mergedIntervals = solution.merge(intervals);

        System.out.println("Merged intervals:");
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}

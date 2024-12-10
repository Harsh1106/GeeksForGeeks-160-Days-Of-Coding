import java.util.Arrays;

public class NonOverlappingIntervals {
    static int minRemoval(int intervals[][]) {
        // Edge case: If there are no intervals, no removal is needed
        if (intervals.length == 0) return 0;

        // Sort the intervals by their end times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0; // Count of overlapping intervals to remove
        int prevEnd = intervals[0][1]; // End time of the last non-overlapping interval

        for (int i = 1; i < intervals.length; i++) {
            // If the current interval overlaps with the previous one
            if (intervals[i][0] < prevEnd) {
                count++; // Increment the count of intervals to remove
            } else {
                prevEnd = intervals[i][1]; // Update the end time for the non-overlapping interval
            }
        }

        return count; // Return the minimum number of intervals to remove
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println(minRemoval(intervals1)); // Output: 1

        int[][] intervals2 = {{1, 3}, {1, 3}, {1, 3}};
        System.out.println(minRemoval(intervals2)); // Output: 2

        int[][] intervals3 = {{1, 2}, {5, 10}, {18, 35}, {40, 45}};
        System.out.println(minRemoval(intervals3)); // Output: 0
    }
}

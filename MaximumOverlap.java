 /*Question 3
 Find the maximum overlapping time, given the entry logs of each employee
 (i.e., the maximum number of workers working at a time)
 eg: 4 workers, with their entry and exit logs respectively as:
 (1,4) ; (2,5) ; (3,6) ; (5,9) -> (entry,exit) timing (let it be in 24 hr format - hours)
 then by analysis, we find that, at hr:3-4, workers 1,2,3 are there
 so, maximum work*/
public class MaximumOverlap {
    public static void main(String[] args) {

        int[][] logs = {
                {1, 4},
                {2, 5},
                {3, 6},
                {5, 9}
        };

        int minTime = Integer.MAX_VALUE;
        int maxTime = Integer.MIN_VALUE;

        // Find earliest entry and latest exit
        for (int i = 0; i < logs.length; i++) {

            if (logs[i][0] < minTime)
                minTime = logs[i][0];

            if (logs[i][1] > maxTime)
                maxTime = logs[i][1];
        }

        int maxWorkers = 0;
        int maxHour = 0;

        // Check each hour
        for (int hour = minTime; hour <= maxTime; hour++) {

            int count = 0;

            // Count workers present at this hour
            for (int i = 0; i < logs.length; i++) {

                if (hour >= logs[i][0] && hour <= logs[i][1]) {
                    count++;
                }
            }

            if (count > maxWorkers) {
                maxWorkers = count;
                maxHour = hour;
            }
        }

        System.out.println("Maximum workers = " + maxWorkers);
        System.out.println("At hour = " + maxHour);
    }
}

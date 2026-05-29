// Last updated: 30/05/2026, 00:04:14
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {
            "Friday", "Saturday", "Sunday", "Monday",
            "Tuesday", "Wednesday", "Thursday"
        };

        int totalDays = 0;

        // 1. Count days for full years
        for (int y = 1971; y < year; y++) {
            totalDays += isLeap(y) ? 366 : 365;
        }

        // 2. Days in months
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // 3. Add days for months in current year
        for (int m = 1; m < month; m++) {
            totalDays += daysInMonth[m - 1];

            // add leap day if Feb passed
            if (m == 2 && isLeap(year)) {
                totalDays += 1;
            }
        }

        // 4. Add days of current month
        totalDays += (day - 1); // important: -1 because Jan 1 is day 0

        return days[totalDays % 7];
    }

    boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}
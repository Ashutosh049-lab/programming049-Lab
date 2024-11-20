package Assignment;
import java.util.*;

import java.util.*;

public class MagicalStars {

    static class Line {
        int x1, y1, x2, y2;

        Line(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    // Counts the cells between a line and a star point, with or without splitting
    static int countCells(Line line, int[] star, boolean split) {
        int x1 = line.x1, y1 = line.y1, x2 = line.x2, y2 = line.y2;
        int sx = star[0], sy = star[1];

        if (x1 == x2) {  // Vertical line
            if (split) {
                return Math.min(Math.abs(sy - y1), Math.abs(sy - y2)) + 1;
            } else {
                return Math.abs(y1 - y2) + 1;
            }
        } else {  // Horizontal line
            if (split) {
                return Math.min(Math.abs(sx - x1), Math.abs(sx - x2)) + 1;
            } else {
                return Math.abs(x1 - x2) + 1;
            }
        }
    }

    // Checks if two lines intersect and updates the intersection point
    static boolean intersects(Line a, Line b, int[] intersection) {
        int x1 = a.x1, y1 = a.y1, x2 = a.x2, y2 = a.y2;
        int x3 = b.x1, y3 = b.y1, x4 = b.x2, y4 = b.y2;

        // Check for intersection: a is vertical, b is horizontal
        if (x1 == x2 && y3 == y4) {
            if (x3 <= x1 && x1 <= x4 && y1 <= y3 && y3 <= y2) {
                intersection[0] = x1;
                intersection[1] = y3;
                return true;
            }
        }
        // Check for intersection: a is horizontal, b is vertical
        if (y1 == y2 && x3 == x4) {
            if (x1 <= x3 && x3 <= x2 && y3 <= y1 && y1 <= y4) {
                intersection[0] = x3;
                intersection[1] = y1;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // Number of lines
        Line[] lines = new Line[N];

        // Input lines and ensure consistent orientation (x1, y1) <= (x2, y2)
        for (int i = 0; i < N; ++i) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            if (x1 > x2 || (x1 == x2 && y1 > y2)) {
                int temp = x1;
                x1 = x2;
                x2 = temp;
                temp = y1;
                y1 = y2;
                y2 = temp;
            }
            lines[i] = new Line(x1, y1, x2, y2);
        }

        int K = sc.nextInt();  // Number of intersecting lines required for a star

        // Map to store intersections and their corresponding lines
        Map<String, List<Line>> stars = new HashMap<>();

        // Find intersections between lines
        for (int i = 0; i < N; ++i) {
            for (int j = i + 1; j < N; ++j) {
                int[] intersection = new int[2];
                if (intersects(lines[i], lines[j], intersection)) {
                    String key = intersection[0] + "," + intersection[1];
                    stars.putIfAbsent(key, new ArrayList<>());
                    stars.get(key).add(lines[i]);
                    stars.get(key).add(lines[j]);
                }
            }
        }

        int totalIntensity = 0;

        // Process each star and calculate its intensity
        for (Map.Entry<String, List<Line>> entry : stars.entrySet()) {
            List<Line> intersectingLines = entry.getValue();
            if (intersectingLines.size() / 2 == K) {  // Check if the number of intersecting lines is K
                List<Integer> intensities = new ArrayList<>();
                for (Line line : intersectingLines) {
                    int[] star = {Integer.parseInt(entry.getKey().split(",")[0]), Integer.parseInt(entry.getKey().split(",")[1])};
                    intensities.add(countCells(line, star, true));
                }
                totalIntensity += Collections.min(intensities);  // Add the smallest intensity
            }
        }

        System.out.println(totalIntensity); // Output the result

        sc.close();
    }
}
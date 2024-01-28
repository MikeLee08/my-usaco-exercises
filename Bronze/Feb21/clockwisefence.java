//import java.util.Scanner;
//
//public class clockwisefence {
//    public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            int N = scanner.nextInt();
//            scanner.nextLine();  // Consume the newline character
//
//            for (int i = 0; i < N; i++) {
//                String fencePath = scanner.nextLine();
//                String result = determineDirection(fencePath);
//                System.out.println(result);
//            }
//        }
//
//        public static String determineDirection (String path){
//            int n = path.length();
//            int clockwise = 0;
//            int counterclockwise = 0;
//
//            for (int i = 0; i < n; i++) {
//                char direction = path.charAt(i);
//                char nextDirection = path.charAt((i + 1) % n);
//
//                if ((direction == 'N' && nextDirection == 'E') ||
//                        (direction == 'E' && nextDirection == 'S') ||
//                        (direction == 'S' && nextDirection == 'W') ||
//                        (direction == 'W' && nextDirection == 'N')) {
//                    clockwise++;
//                } else if ((direction == 'N' && nextDirection == 'W') ||
//                        (direction == 'E' && nextDirection == 'N') ||
//                        (direction == 'S' && nextDirection == 'E') ||
//                        (direction == 'W' && nextDirection == 'S')) {
//                    counterclockwise++;
//                }
//            }
//
//            if (clockwise > counterclockwise) {
//                return "CW";
//            } else {
//                return "CCW";
//            }
//        }
//    }

import java.util.Scanner;

public class clockwisefence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        for (int i = 0; i < N; i++) {
            String s = scanner.next();
            test(s);
        }
    }

    public static int angleFromDirection(char a) {
        if (a == 'E') return 0;
        if (a == 'N') return 90;
        if (a == 'W') return 180;
        if (a == 'S') return 270;
        return -1; // Invalid direction
    }

    public static int angleChange(char a, char b) {
        int theta1 = angleFromDirection(a);
        int theta2 = angleFromDirection(b);
        if (theta2 == (theta1 + 90) % 360) return 90;
        else if (theta2 == theta1) return 0;
        else if (theta2 == (theta1 + 270) % 360) return -90;
        else throw new IllegalArgumentException("Fence should not backtrack on itself");
    }

    public static void test(String s) {
        int totalChange = 0;
        for (int i = 0; i < s.length(); i++) {
            totalChange += angleChange(s.charAt(i), s.charAt((i + 1) % s.length()));
        }
        if (totalChange == 360) System.out.println("CCW");
        else System.out.println("CW");
    }
}

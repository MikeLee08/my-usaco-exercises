import java.util.ArrayList;
import java.util.Scanner;

public class evenmoreoddphotos {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int N = input.nextInt();
//        int[] numbers = new int[N];
//        for (int i = 0; i < N; i++) {
//            numbers[i] = input.nextInt();
//        }
//
//        int answer = 0;
//        ArrayList<Integer> odd = new ArrayList<>();
//        ArrayList<Integer> even = new ArrayList<>();
//        for (int i = 0; i < N; i++) {
//            if (numbers[i] % 2 == 0) {
//                even.add((int) numbers[i]);
//            } else {
//                odd.add((int) numbers[i]);
//            }
//        }
//
//        if (odd.isEmpty()) {
//            answer++;
//            System.out.println(answer);
//        } else {
//            if (odd.size() > even.size()) {
//                answer = odd.size()/2 + even.size();
//                System.out.println(answer);
//            } else {
//                answer = odd.size() * 2 + 1;
//                System.out.println(answer);
//            }
//        }
            int O = 0, E = 0, N, x;
            Scanner sc = new Scanner(System.in);
            N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                x = sc.nextInt();
                if (x % 2 == 0) E++; else O++;
            }
            while (O > E) { O = O - 2; E++; }
            if (E > O + 1) E = O + 1;
            System.out.println(E + O);
        }
}

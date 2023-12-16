import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class blist {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File file = new File("blist.in");
        Scanner scanner = new Scanner(file);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("blist.out")));

        ArrayList<Integer> buckets = new ArrayList<>();

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int si = scanner.nextInt();
            int ti = scanner.nextInt();
            int bi = scanner.nextInt();


            for (int j = si - 1; j < ti; j++) {
                for (int k = buckets.size(); k <= j; k++) {
                    buckets.add(0);
                }       //增长数组，防止索引过大

                int b = bi + buckets.get(j);
                buckets.set(j, b);
            }

        }
        int ans = Collections.max(buckets);
        pw.println(ans);
        pw.close();
    }
}

import java.io.*;
import java.util.Scanner;

public class mixmilk {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File file = new File("mixmilk.in");
        Scanner scanner = new Scanner(file);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));

        int[] capacities = new int[3];
        int[] milkAmounts = new int[3];


        for (int i = 0; i < 3; i++) {
            capacities[i] = scanner.nextInt();
            milkAmounts[i] = scanner.nextInt();
        }

        for (int i = 0; i < 100; i++) {
            int from = i % 3;
            int to = (i + 1) % 3;

            int pour = Math.min(milkAmounts[from], capacities[to] - milkAmounts[to]);

            milkAmounts[from] -= pour;
            milkAmounts[to] += pour;
        }

        for (int i = 0; i < 3; i++) {
            pw.println(milkAmounts[i]);
        }
        pw.close();
    }
}
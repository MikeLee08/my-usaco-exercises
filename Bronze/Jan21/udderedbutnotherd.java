import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class udderedbutnotherd {
    public static void main(String[] args) {

        ArrayList<String> cowphabet = new ArrayList<>();
        ArrayList<String> word = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        for (char c : line1.toCharArray()) {
            cowphabet.add(String.valueOf(c));
        }

        for (char c : line2.toCharArray()) {
            word.add(String.valueOf(c));
        }

        int capital = 0;
        ArrayList<String> copylist = new ArrayList<>();

        if (!(capital == word.size())) {
            for (int i = 0; i < word.size(); i++) {
                copylist.addAll(cowphabet);

                for (int j = 0; j < cowphabet.size(); j++) {
                    if (Objects.equals(word.get(i), cowphabet.get(j))) {
                        capital++;
                        int intValue = Integer.parseInt(cowphabet.get(j));
                        intValue -= 32;
                        copylist.set(j, Integer.toString(intValue));

                    }

                    StringBuilder resultBuilder = new StringBuilder();
                    for (String item : copylist) {
                        resultBuilder.append(item);
                    }
                    String result = resultBuilder.toString();
                    System.out.println(result);
                }

            }
        }
    }
}
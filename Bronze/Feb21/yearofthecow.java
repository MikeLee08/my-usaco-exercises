import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class yearofthecow {

        public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    int N = scanner.nextInt();
                    scanner.nextLine(); // 消耗换行符

                    Map<String, Integer> zodiacMap = new HashMap<>();
                    zodiacMap.put("Ox", 0);
                    zodiacMap.put("Tiger", 1);
                    zodiacMap.put("Rabbit", 2);
                    zodiacMap.put("Dragon", 3);
                    zodiacMap.put("Snake", 4);
                    zodiacMap.put("Horse", 5);
                    zodiacMap.put("Goat", 6);
                    zodiacMap.put("Monkey", 7);
                    zodiacMap.put("Rooster", 8);
                    zodiacMap.put("Dog", 9);
                    zodiacMap.put("Pig", 10);
                    zodiacMap.put("Rat", 11);

                    int bessieYear = 0; // Bessie的出生年份

                    for (int i = 0; i < N; i++) {
                        String[] input = scanner.nextLine().split(" ");
                        String cowName = input[0];
                        String relation = input[3];
                        String otherCow = input[7];
                        String zodiac = input[4];

                        int otherCowYear = bessieYear;

                        // 根据关系计算其他奶牛的出生年份
                        if (relation.equals("previous")) {
                            otherCowYear = (otherCowYear - 12 + zodiacMap.get(zodiac)) % 12;
                        } else if (relation.equals("next")) {
                            otherCowYear = (otherCowYear + 12 + zodiacMap.get(zodiac)) % 12;
                        }

                        // 更新Bessie的出生年份
                        if (cowName.equals("Bessie")) {
                            bessieYear = otherCowYear;
                        }
                    }

                    // 计算Bessie和Elsie的出生年份之间相差的年数
                    int elsieYear = (bessieYear + 12) % 12;
                    int diff = (elsieYear - bessieYear + 12) % 12;

                    System.out.println(diff);
                }
            }

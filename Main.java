import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> wordCount = new HashMap<>();
        System.out.print("Print string: ");
        String str = scanner.nextLine();
        String[] words = str.split("\\W+");
        for (String word : words) {
            if (!word.isEmpty()) {
                word = word.toLowerCase();
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        System.out.println("Count words:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

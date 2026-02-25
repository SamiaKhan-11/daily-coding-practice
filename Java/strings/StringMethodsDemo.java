public class StringMethodsDemo {
    public static void main(String[] args) {

        String s = "   Hello Java Programming   ";

        // 1. length()
        System.out.println("Length: " + s.length());

        // 2. trim()
        String trimmed = s.trim();
        System.out.println("After trim: " + trimmed);

        // 3. toUpperCase() & toLowerCase()
        System.out.println("Uppercase: " + trimmed.toUpperCase());
        System.out.println("Lowercase: " + trimmed.toLowerCase());

        // 4. charAt()
        System.out.println("Character at index 1: " + trimmed.charAt(1));

        // 5. substring()
        System.out.println("Substring (6,10): " + trimmed.substring(6, 10));

        // 6. contains()
        System.out.println("Contains 'Java'? " + trimmed.contains("Java"));

        // 7. indexOf()
        System.out.println("Index of 'Java': " + trimmed.indexOf("Java"));

        // 8. replace()
        String replaced = trimmed.replace("Java", "Python");
        System.out.println("After replace: " + replaced);

        // 9. equals()
        String another = "Hello Java Programming";
        System.out.println("Equals check: " + trimmed.equals(another));

        // 10. compareTo()
        System.out.println("CompareTo result: " + trimmed.compareTo(another));

        // 11. concat()
        String concatStr = trimmed.concat(" Language");
        System.out.println("After concat: " + concatStr);

        // 12. isEmpty()
        String emptyStr = "";
        System.out.println("Is empty? " + emptyStr.isEmpty());

        // 13. valueOf()
    
        int number = 100;
        String numStr = String.valueOf(number);
        System.out.println("ValueOf: " + numStr);

        // 14. split()
        String sentence = "Java is fun";
        String[] words = sentence.split(" ");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 15. toCharArray()
        char[] chars = trimmed.toCharArray();
        System.out.println("Characters in string:");
        for (char c : chars) {
            System.out.print(c + " ");
        }

        // 16. lastIndexOf()
        System.out.println("\nLast index of 'a': " + trimmed.lastIndexOf('a'));

        // 17. startsWith() & endsWith()
        System.out.println("Starts with 'Hello'? " + trimmed.startsWith("Hello"));

        // 18. repeat()
        String repeated = trimmed.repeat(2);
        System.out.println("Repeated string: " + repeated);

        // 19. strip()
        String stripped = s.strip();
        System.out.println("After strip: '" + stripped  + "'");


    }
}

public class StringManipulation {
    public static void main(String[] args) {
        String s = "Hello World!";
        
        // Length of the string
        int length = s.length();
        System.out.println("Length: " + length);
        
        // Convert to upper case
        String upper = s.toUpperCase();
        System.out.println("Upper case: " + upper);
        
        // Convert to lower case
        String lower = s.toLowerCase();
        System.out.println("Lower case: " + lower);
        
        // Substring
        String substring = s.substring(6);
        System.out.println("Substring: " + substring);
        
        // Replace
        String replaced = s.replace("World", "Java");
        System.out.println("Replaced: " + replaced);
        
        // Concatenate
        String concatenated = s.concat(" How are you?");
        System.out.println("Concatenated: " + concatenated);
        
        // Trim leading and trailing spaces
        String trimmed = "   Java Programming    ".trim();
        System.out.println("Trimmed: " + trimmed);
        
        // Split into array of strings
        String[] words = s.split(" ");
        System.out.println("Words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}


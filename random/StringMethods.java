public class StringMethods {
    public static void main(String[] args) {

        String str1 = "My name is Shivam";
        String str2 = "Gupta";

        // 1. length() - Returns the length of the string (number of characters).
        System.out.println(str1.length()); // Output: 17 (since "My name is Shivam" has 17 characters)

        // 2. charAt(int index) - Returns the character at the specified index.
        System.out.println(str1.charAt(0)); // Output: 'M' (the first character of str1)

        // 3. indexOf(String str) - Returns the index of the first occurrence of the
        // specified substring.
        System.out.println(str1.indexOf("am")); // Output: 3 (The substring "am" starts at index 3 in "My name")

        // 4. lastIndexOf(String str) - Returns the index of the last occurrence of the
        // specified substring.
        System.out.println(str1.lastIndexOf("am")); // Output: 12 (Last occurrence of "am" in "Shivam")

        // 5. substring(int start, int end) - Extracts a substring starting from 'start'
        // (inclusive) to 'end' (exclusive).
        System.out.println(str1.substring(0, 5)); // Output: "My na" (Extracts "My na" from the beginning)

        // 6. toUpperCase() - Converts all characters in the string to uppercase.
        System.out.println(str1.toUpperCase()); // Output: "MY NAME IS SHIVAM"

        // 7. toLowerCase() - Converts all characters in the string to lowercase.
        System.out.println(str1.toLowerCase()); // Output: "my name is shivam"

        // 8. replace(CharSequence old, CharSequence new) - Replaces all occurrences of
        // 'old' with 'new'.
        System.out.println(str1.replace("am", "is")); // Output: "My is is Shivis"

        // 9. trim() - Removes any leading or trailing whitespace characters from the
        // string.
        System.out.println(str1.trim()); // Output: "My name is Shivam" (no leading or trailing whitespace here, but
                                         // useful in general)

        // 10. concat(String str) - Concatenates the specified string to the end of the
        // original string.
        System.out.println(str1.concat(str2)); // Output: "My name is ShivamGupta"

        // 11. contains(CharSequence sequence) - Checks if the string contains the
        // specified sequence of characters.
        System.out.println(str1.contains("am")); // Output: true (since "am" is part of the string)

        // 12. equals(Object obj) - Compares two strings for equality (case-sensitive).
        System.out.println(str1.equals(str2)); // Output: false (the strings are different)

        // 13. equalsIgnoreCase(String str) - Compares two strings for equality (ignores
        // case).
        System.out.println(str1.equalsIgnoreCase(str2)); // Output: false (ignores case but still strings are different)

        // 14. compareTo(String anotherString) - Compares two strings lexicographically.
        System.out.println(str1.compareTo(str2)); // Output: Positive value (since "My name is Shivam" is
                                                  // lexicographically greater than "Gupta")

        // 15. isEmpty() - Returns true if the string is empty (i.e., length is 0).
        System.out.println(str1.isEmpty()); // Output: false (since str1 is not empty)

        // 16. isBlank() - Returns true if the string is empty or contains only
        // whitespace characters.
        System.out.println(str1.isBlank()); // Output: false (str1 has non-whitespace characters)

        // 17. startsWith(String prefix) - Checks if the string starts with the
        // specified prefix.
        System.out.println(str1.startsWith(str2)); // Output: false (str1 does not start with "Gupta")

        // 18. endsWith(String suffix) - Checks if the string ends with the specified
        // suffix.
        System.out.println(str1.endsWith(str2)); // Output: false (str1 does not end with "Gupta")

        // 19. split(String regex) - Splits the string into an array of substrings based
        // on the specified regular expression (here, space).
        String arr[] = str1.split(" "); // Splits str1 into words based on spaces
        for (String s : arr) {
            System.out.println(s);
        }

        // 20. toCharArray() - Converts the string into a character array.
        char arr1[] = str2.toCharArray(); // Converts "Gupta" into a character array ['G', 'u', 'p', 't', 'a']
        for (char c : arr1) {
            System.out.println(c);
        }
    }
}

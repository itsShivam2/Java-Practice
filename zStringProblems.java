public class zStringProblems {

    // 1. Check Palindrome
    public static void isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                System.out.println("Not Palindrome");
                return;
            } else {
                start++;
                end--;
            }
        }
        System.out.println("Palindrome");
    }

    // 2. Count vowels, consonants and white spaces
    public static void countAlphabets(String s) {
        String str = s.toLowerCase();
        int strlen = s.length();
        int vowels = 0, consonants = 0, whitespaces = 0;
        for (int i = 0; i < strlen; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            else if (ch == ' ')
                whitespaces++;
            else if (ch >= 'a' && ch <= 'z')
                consonants++;
            else
                continue;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Whitespaces: " + whitespaces);
    }

    // 3. Convert Character to ASCII value
    public static void convertToASCII(char c) {
        System.out.println((int) c);
    }

    // 4. Remove vowels
    public static void removeVowels(String s) {
        int strlen = s.length();
        String str = "";
        for (int i = 0; i < strlen; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U')
                continue;
            else
                str += ch;
        }
        System.out.println(str);
    }

    // 5. Remove vowel at position
    public static void removeVowelAtPosition(String s, int pos) {
        String str = s.substring(0, pos) + s.substring(pos + 1, s.length());
        System.out.println(str);
    }

    // 6. Remove white spaces
    public static void removeSpaces(String s) {
        int strlen = s.length();
        String str = "";
        for (int i = 0; i < strlen; i++) {
            char ch = s.charAt(i);
            if (ch == ' ')
                continue;
            else
                str += ch;
        }
        System.out.println(str);
        ;
    }

    // 7. Remove special characters
    public static void removeSpecialCharacters(String s) {
        int strlen = s.length();
        String str = "";
        for (int i = 0; i < strlen; i++) {
            char ch = s.charAt(i);
            if (ch == ' ' || (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))
                str += ch;
            else
                continue;
        }
        System.out.println(str);
        ;
    }

    // 8. Reverse a string
    public static void reverseString(String s) {
        int strlen = s.length();
        String str = "";
        for (int i = strlen - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            str += ch;
        }
        System.out.println(str);
    }

    

    public static void main(String args[]) {
        isPalindrome("abcba");
        countAlphabets("My name is Shivam");
        convertToASCII('z');
        removeVowels("My name is Shivam");
        removeVowelAtPosition("My name is Shivam", 4);
        removeSpaces("My name is Shivam");
        removeSpecialCharacters("My na&me is @Shivam");
        reverseString("My name is Shivam");
    }
}


// 9. Remove brackets from an algebraic expression
// 10 Capitalize first and last character of each word
// 11 Calculate frequency of characters in a string
// 12 Find Non-repeating characters of a String
// 13 Check if two strings are anagram of each other

// 14 Count common sub-sequence in two strings

// 15 Check if two strings match where one string contains wildcard characters

// 16 Return maximum occurring character in the input string

// 17 Remove all duplicates from the input string.
// 18 Print all the duplicates in the input string.
// 19 Remove characters from first string present in the second string
// 20 Change every letter with the next lexicographic alphabet in the given
// string
// 21 Write a program to find the largest word in a given string.
// 22 Write a program to sort characters in a string
// 23 Count number of words in a given string
// 24 Write a program to find a word in a given string which has the highest
// number of repeated letters
// 25 Change case of each character in a string
// 26 Concatenate one string to another
// 27 Write a program to find a substring within a string. If found display its
// starting position
// 28 Reverse words in a string
// 29. Sum of numbers in a string
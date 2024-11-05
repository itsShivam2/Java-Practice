import java.util.*;

public class zTCSIPA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // String str = "My Name is Shivam Gupta";
        // lowerCharacters(str);

        // // 2
        // System.out.println("Enter start and end: ");
        // int start = sc.nextInt();
        // int end = sc.nextInt();
        // countSum(start, end);

        // sc.nextLine();

        // // 3
        // System.out.println("Enter string and substring: ");
        // String str1 = sc.next();
        // String substr = sc.next();
        // checkReverseString(str1, substr);

        // sc.nextLine();

        // // 4
        // System.out.println("Enter the string: ");
        // String str2 = sc.nextLine();
        // noWords(str2);

        // 5
        // System.out.println("Enter the string: ");
        // String str3 = sc.nextLine();
        // reverseStringWords(str3);

        // 6
        // System.out.println("Enter the string: ");
        // String str4 = sc.nextLine();
        // countSpaces(str4);

        // 7
        // System.out.println("Enter the array: ");
        // int arr[] = new int[sc.nextInt()];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // sc.nextLine();
        // System.out.println("Enter start and end: ");
        // int start = sc.nextInt();
        // sc.nextLine();
        // int end = sc.nextInt();
        // sc.nextLine();
        // average(arr, start, end);

        // 8
        // System.out.println("Enter the array: ");
        // int arr1[] = new int[sc.nextInt()];
        // for (int i = 0; i < arr1.length; i++) {
        // arr1[i] = sc.nextInt();
        // }
        // sc.nextLine();
        // System.out.println("Enter start and end: ");
        // int start1 = sc.nextInt();
        // sc.nextLine();
        // int end1 = sc.nextInt();
        // sc.nextLine();
        // averageIndices(arr1, start1, end1);

        // 9
        // System.out.println("Enter the string: ");
        // String str5 = sc.nextLine();
        // charAtOddIndices(str5);

        // 10
        // System.out.println("Enter the string: ");
        // String str6 = sc.nextLine();
        // firstLetters(str6);

        // 11
        // System.out.println("Enter the string: ");
        // String str7 = sc.nextLine();
        // largestWord(str7);

        // 12
        // System.out.println("Enter the string: ");
        // String str8 = sc.nextLine();
        // lastLetters(str8);

        // 13
        // System.out.println("Enter the number: ");
        // int n = sc.nextInt();
        // evenDigits(n);

        // 14
        // System.out.println("Enter the string: ");
        // String str9 = sc.nextLine();
        // System.out.println("Enter the character: ");
        // char ch = sc.nextLine().charAt(0);
        // removeChar(str9, ch);

        // 15
        // System.out.println("Enter the string: ");
        // String str10 = sc.nextLine();
        // reverseString(str10);

        // 16
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        isPerfect(n);

        sc.close();
    }

    // 1. Find the number of lowercase characters in a string
    public static void lowerCharacters(String s) {
        int strlen = s.length();
        int cnt = 0;
        for (int i = 0; i < strlen; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' & ch <= 'z')
                cnt++;
        }
        System.out.println(cnt);

        // Alternative
        int count = 0;
        for(int i=0; i<strlen; i++)
        {
            if (Character.isLowerCase(s.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }

    // 2. Between a given range count and sum of numbers divisible by 3
    public static void countSum(int start, int end) {
        int cnt = 0, sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                cnt++;
                sum += i;
            }
        }
        System.out.println(cnt + " " + sum);
    }

    // 3. If a string contains a particular substring, reverse and print the last 3
    // characters of the string
    public static void checkReverseString(String str, String substr) {
        int strlen = str.length();
        if (strlen < substr.length()) {
            System.out.println("Not possible");
            return;
        }
        if (str.contains(substr)) {
            for (int i = strlen - 1; i >= strlen - 3; i--) {
                char ch = str.charAt(i);
                System.out.print(ch);
            }
        } else
            System.out.println("Not possible");

        System.out.println("");

    }

    // 4. Find the number of words in a string
    public static void noWords(String s) {
        int strlen = s.length();
        int cnt = 1;
        for (int i = 0; i < strlen; i++) {
            if (s.charAt(i) == ' ') {
                cnt++;
            }
        }
        System.out.println(cnt);

        // Alternative
        String str[] = s.split(" ");
        System.out.println(str.length);
    }

    // 5. Reverse words in a string
    public static void reverseStringWords(String s) {
        String str[] = s.split(" ");
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i] != "") // to handle multiple spaces
            {
                System.out.print(str[i] + " ");
            }
        }
    }

    // 6. Count the number of spaces in a string, if gretaer than or equal to 3 then
    // print the count otherwise print NAN
    public static void countSpaces(String s) {
        int strlen = s.length();
        int count = 0;
        for (int i = 0; i < strlen; i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        if (count >= 3)
            System.out.println(count);
        else
            System.out.println("NAN");

        // Alternative
        String str[] = s.split(" ");
        if (str.length >= 3)
            System.out.println(str.length);
        else
            System.out.println("NAN");
    }

    // 7. Find the average of numbers of a array between two numbers
    public static void average(int arr[], int start, int end) {
        double sum = 0;
        int nums = 0;
        int arrlen = arr.length;
        for (int i = 0; i < arrlen; i++) {
            if (arr[i] >= start && arr[i] <= end) {
                sum += arr[i];
                nums++;
            }
        }
        double avg = sum / nums;
        System.out.println(sum + " " + nums);
        System.out.println("Average = " + avg);
    }

    // 8. FInd the average of numbers of a array between two indices
    public static void averageIndices(int arr[], int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        System.out.println("Average = " + sum / (end - start + 1));
    }

    // 9. FInd characters of a string at odd indices
    public static void charAtOddIndices(String s) {
        int strlen = s.length();
        String str = "";
        for (int i = 0; i < strlen; i++) {
            if (i % 2 != 0) {
                System.out.println(s.charAt(i));
                str += s.charAt(i);
            }
        }
        System.out.println(str);
    }

    // 10. Find first letter of each word in a string
    public static void firstLetters(String s) {
        int strlen = s.length();
        int cnt = 0;
        for (int i = 0; i < strlen; i++) {
            if (cnt == 0) {
                if (s.charAt(i) != ' ') {
                    System.out.print(s.charAt(i));
                    cnt++;
                }
            } else if (s.charAt(i) == ' ') {
                cnt = 0;
            }
        }

        // Alternative
        String str[] = s.split(" ");
        for (String word : str) {
            if (!word.isEmpty())
                System.out.print(word.charAt(0));
        }
    }

    // 11. Find the largest word in a string
    public static void largestWord(String s) {
        int strlen = s.length();
        int count = 0;
        int largest = 0;
        String word = "";
        String largeWord = "";
        for (int i = 0; i < strlen; i++) {
            if (s.charAt(i) != ' ') {
                count++;
                word = word + s.charAt(i);
            } else {
                if (count > largest) {
                    largest = count;
                    largeWord = word;
                }
                word = "";
                count = 0;
            }
        }
        if (count > largest) {
            largest = count;
            largeWord = word;
        }
        System.out.println(largeWord);

        // Alternative
        String str[] = s.split(" ");
        String largestWord = str[0];
        for (int i = 1; i < str.length; i++) {
            if (str[i].length() > largestWord.length()) {
                largestWord = str[i];
            }
        }
        System.out.println(largestWord);
    }

    // 12. Find the last letters of each word in a string
    public static void lastLetters(String s) {

        int strlen = s.length();
        for (int i = 0; i < strlen - 1; i++) {
            if (s.charAt(i) != ' ' && s.charAt(i + 1) == ' ') {
                System.out.print(s.charAt(i) + " ");
            }
        }
        System.out.print(s.charAt(strlen - 1));

        // Alternative
        String str[] = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > 1)
                System.out.print(str[i].charAt(str[i].length() - 1) + " ");
        }
    }

    // 13. Find the number of even digits in a number
    public static void evenDigits(int num) {
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0)
                count++;
            num /= 10;
        }
        System.out.println(count);
    }

    // 14. Remove given character from a string
    public static void removeChar(String s, char ch) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ch)
                str += s.charAt(i);
        }
        System.out.println(str);

        // Alternative
        String str1 = s.replaceAll(String.valueOf(ch), "");
        System.out.println(str1);
    }

    // 15. Reverse a string
    public static void reverseString(String s) {
        for (int i = s.length() - 1; i >= 0; i--)
            System.out.print(s.charAt(i));
    }

    // 16. Check if number is perfect
    public static void isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }
        if (sum == num)
            System.out.println("Perfect");
        else
            System.out.println("Not perfect");
    }


    // 17. Find the index of a character in a string
    // 18. Find the number of lowercase characters in a string
    // 19. Find the number of duplicate characters in a string, ignore them and print the rest
    // 20. Find the number of characters and spaces in a string
    // 21. Print the last character of every word in a string, ignore spaces and digits
    // 22. Print number of spaces in a string, if greater than 3, print count else nan 
    // 23. Print all vowels in a string as it is, which are present at index 0
    // 24. Find characters of a string at odd indices
    // 25. Calculate sum of digits of a number, if sum%3==0, print true else print false
    // 26. Find largest word in a string, if two words have same length print first
    // 27. Find the first non repeating character in a string
    // 28. Find the number of even digits in a number
    // 29. Reverse a number
    // 30. Reverse a string, print all characters in lowercase
    // 31. Print smallest vowel in a string
    // 32. First palindrome in an array of words
    // 33. 




















































}

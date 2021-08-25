import java.util.*;

public class MariusComanWeek2Homework {
    public static void main(String[] args) {
        week2_1();
        week2_2();
        week2_3();
        week2_4();
    }

    static void week2_1() {
        //1. Given two strings, check if the strings are equal.
        String s1 = "Marius";
        String s2 = "Test";
        System.out.println("Are the strings equal? " + (s1.equals(s2)));

        //After that, concatenate them into one single string
        String s3 = s1.concat(s2);
        System.out.println("The concat string is: " + (s3));
    }

    static void week2_2() {
//2. Given a one word string, return true if the string is a palindrome
        String s4 = "madam";
        StringBuffer buffer = new StringBuffer(s4);
        buffer.reverse();
        String data = buffer.toString();
        if (s4.equals(data)) {
            System.out.println("The word <madam> is palindrome.");
        } else {
            System.out.println("The word <madam> is not palindrome.");
        }
    }

    static void week2_3() {
//3. Create an empty string, an empty array of strings, and a list of strings with random upper and lowercase letters
        String emptyString = "";
        String[] emptyArray = {};
        List<String> list = new ArrayList<String>();
        list.add("Artes");
        list.add("PjdUx");
        list.add("xgRtl");
        list.add("Ethgs");

//3.a. Iterate the list.
        for (String randomstrings : list)
            System.out.println("The random strings are: " + randomstrings);

//3.i. If the word starts with a vowel, make it all lowercase and append it to the empty string
        for (int i = 0; i < list.size(); i++) {
            if (startWithVowel(list.get(i))) {
                emptyString = emptyString.concat(list.get(i).toLowerCase());
            }

            //ii. If the word starts with a consonant, make it all uppercase and add it to the empty array
            else {
                String[] newArray = new String[emptyArray.length + 1];
                for (int j = 0; j < emptyArray.length; j++) {
                    newArray[j] = emptyArray[j];
                }
                newArray[newArray.length - 1] = list.get(i).toUpperCase();
                emptyArray = newArray;
            }

            if (list.get(i).toLowerCase().contains("x") || list.get(i).length() < 3) {
                System.out.println(list.get(i) + " skipped");
                list.set(i, "skipped");
            }
        }

        System.out.println("The string is now: " + emptyString);
        System.out.println("The new array is: " + Arrays.toString(emptyArray));
        System.out.println("The new list is: " + list.toString());
    }

    static void week2_4() {
        // 4. Create an empty map that will contain Name and Email as key-value pairs
        Map<String,String> nameEmailMap = new HashMap<>();
        //4.a Add a couple of K-V entries
        nameEmailMap.put("Marius","marius.coman@softvision.com");
        nameEmailMap.put("test","blabla@blabla.com");
        nameEmailMap.put("music","music@music.com");

        // 4b. Get the size of the map
        System.out.println("The Map size is: " + nameEmailMap.size());

        //4c. Check that map contains a specific name
        System.out.println("The map contains Marius: " + nameEmailMap.containsKey("Marius"));

        //4d. Get the email that contains a specific name
        System.out.println("The email for Marius is: " + nameEmailMap.get("Marius"));

        //4e. Remove an entry
        nameEmailMap.remove("test");
        System.out.println("The new map is: " + nameEmailMap);

        //4f. Sort the map by key
        Map<String,String> sortedEmailMap = new TreeMap<>();
        sortedEmailMap.putAll(nameEmailMap);
        System.out.println("The sorted Map is: " + sortedEmailMap);
    }

    static boolean startWithVowel(String word) {
        switch (word.charAt(0)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}

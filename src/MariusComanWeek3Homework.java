import java.util.*;

public class MariusComanWeek3Homework {
    public static void main(String[] args) {
        System.out.println("######Homework week 1: ######");
        week1();
        System.out.println("######Homework week 2: ######");
        week2();

    }

    public static void week1() {
        //4. Define and print on separate lines the following data types, using random values:
        //Primitive:
        // boolean:
        boolean A1 = true;
        System.out.println("Boolean value is: " + A1);

        //char:
        char letter = 'A';
        System.out.println("The letter is: " + letter);

        //int:
        int A2 = 33333;
        System.out.println("int value is: " + A2);

        //long:
        long B = 66666L;
        System.out.println("long value is: " + B);

        //double:
        double C = 33.4;
        System.out.println("double value is: " + C);

        //Non-primitive:
        //String:
        String name = "Marius";
        System.out.println("My name is: " + name);

        //Array
        int a[]={3,33,333};
        for (int i=0;i<a.length;i++)
            System.out.println("My array is: " + a[i]);

        //5. Define some integer variables. Perform the operations below and print the result
        //Integer variables:
        int X = 10;
        int Y = 33;
        int Z = 100;

        //increment it using the unary operator:
        System.out.println("The value is: " + ++X);

        //perform some random arithmetic operations using the arithmetic operators:
        System.out.println("The result is: " + (Y+Z));

        //compare two variables using the comparison operator:
        System.out.println("IS Z bigger than Y? " + (Z>Y));

        //6. Define two integer variables, a and b
        int A3 = 3;
        int B1 = 10;

        //Using an if-else statement, compare the values
        if (A3>B1){
            System.out.println("3 is larger than 10");
        }else if (B1>A3){
            System.out.println("10 is larger than 3");
        }else if (A3==B1){
            System.out.println("3 is equal to 10");
        }

        //7. Define a number array of 10 elements, using random values from range 1 to 100, which needs to include number 15;
        //a. Using a for loop, print the values of every element on separate lines. If an element has value 15, skip printing this value.
        int r[]={1,3,7,15,25,33,39,40,66,100,};
        for (int i=0;i<r.length;i++){
            if (r[i]==15){
                continue;
            }
            System.out.println("My array is: " + r[i]);
        }
    }

    public static void week2() {
        //1. Given two strings, check if the strings are equal.
        String s1 = "Marius";
        String s2 = "Test";
        System.out.println("Are the strings equal? " + (s1.equals(s2)));

        //After that, concatenate them into one single string
        String s3 = s1.concat(s2);
        System.out.println("The concat string is: " + (s3));

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

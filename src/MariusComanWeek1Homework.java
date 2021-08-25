public class MariusComanWeek1Homework {
    public static void main(String[] args) {
        week1_4();
        week1_5();
        week1_6();
        week1_7();
    }

    static void week1_4() {
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
        int a[] = {3, 33, 333};
        for (int i = 0; i < a.length; i++)
            System.out.println("My array is: " + a[i]);
    }

    static void week1_5() {
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
    }

    static void week1_6() {
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
    }

    static void week1_7() {
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
}

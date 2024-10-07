import java.util.*;
import java.io.*;
import java.nio.*;

import java.lang.Math;  //Example - 02

public class Main {
    public static void main(String[] args) throws IOException {

        //Example - 01
        System.out.println("Example - 01:");
        System.out.println("I am Learning Java Language.");

        //Example - 02
        System.out.println("Example - 02:");
        System.out.println("How to Import Library.");

        //Example - 03
        System.out.println("Example - 03:");
        System.out.println("How to Comment Lines.");

        //Example - 04
        System.out.println("Example - 04:");
        int rollNo;
        double amountDue;
        char section;

        //Example - 05
        System.out.println("Example - 05:");
        System.out.println("Integer to Double : " + (double)(15/2));
        System.out.println("Floating to Integer : " + (int)(7.9));

        //Example - 06
        System.out.println("Example - 06:");
        String data = "Sunny Day";
        System.out.println(data);

        //Example - 07
        System.out.println("Example - 07:");
        System.out.println("5.0 + 3.5 : " + (5.0 + 3.5));
        System.out.println("3.0 + 9.4 : " + (3.0 + 9.4));

        //Example - 08
        System.out.println("Example - 08:");
        String formatString = "Ali Haider";
        String argumentList = "UET, Lahore";
        System.out.printf(formatString);
        System.out.printf("Hello there!");
        System.out.printf(formatString, argumentList);
        int centimeter = 5;
        System.out.printf("There are %.2f inches in %d centimeters. %n", centimeter/2.54, centimeter);

        //Example - 09
        System.out.println("Example - 09:");

        Scanner input = new Scanner(System.in);
        String name;
        int roll_No;
        char Section;
        double cgpa;

        System.out.print("Enter Your Name : ");
        name = input.next();
        System.out.print("Enter Your Roll No. : ");
        roll_No = input.nextInt();
        System.out.print("Enter Your Section : ");
        Section = input.next().charAt(0);
        System.out.print("Enter Your CGPA : ");
        cgpa = input.nextDouble();


        System.out.println("Name : "+name);
        System.out.println("Roll No : "+roll_No);
        System.out.println("Section : "+Section);
        System.out.println("CGPA : "+cgpa);

        //Example - 10
        System.out.println("Example - 10:");

        //File Handling

       File file = new File("employee.txt");

       if(!file.exists()){
           file.createNewFile();
       }

       Scanner inFile = new Scanner(new FileReader("employee.txt"));
       FileWriter outFile = new FileWriter("employee.txt");

       outFile.write("Ali\n");
       outFile.close();

       while (inFile.hasNext()){
           System.out.println(inFile.nextLine());
       }
       inFile.close();

       //Example - 11
        System.out.println("Example - 11:");

        char grade = 'A';
        if(cgpa < 2.00)
        {
            grade = 'F';
        }
        System.out.println("You Got Grade : " + grade);

        //Example - 12
        System.out.println("Example - 12:");
        if(Section == 'A')
        {
            System.out.println("This Section Is Learning Java.");
        }
        else {
            System.out.println("This Section Is Learning C++");
        }

        //Example - 13
        System.out.println("Example - 13:");
        double temp;
        System.out.print("Enter Temperature : ");
        temp = input.nextDouble();

        if(temp>=50)
            if(temp>=80)
                System.out.println("Good Day for Swimming.");
            else
                System.out.println("Good Day for golfing.");
        else
            System.out.println("Good Day for Playing Tennis.");

        //Example - 14
        System.out.println("Example - 14:");

        switch (grade){
            case 'A':
                System.out.println("This is A grade.");
                break;
            case 'B':
                System.out.println("This is B grade.");
                break;
            case 'C':
                System.out.println("This is C grade.");
                break;
            case 'D':
                System.out.println("This is D grade.");
                break;
            case 'F':
                System.out.println("This is F grade.");
                break;
            default:
                System.out.println("The Grade is Invalid.");

        }

        //Example - 15
        System.out.println("Example - 15:");

        int i = 0;

        while (i<20)
        {
            System.out.print(i + " ");
            i = i+5;
        }

        //Example - 16
        System.out.println("Example - 16:");

        final int SENTINEL = -999;
        int num = 0;
        int sum = 0;
        while(num != SENTINEL)
        {
            sum = sum+num;
            num = num-50;
        }

        System.out.println(("Sum : "+sum));

        //Example - 17
        System.out.println("Example - 17:");

        boolean done;
        done = false;
        int guess;
        int num1 = 58;
        while(!done)
        {
            System.out.print("Enter an Integer greater than or equal to 0 and less than and equal to 100 : ");
            guess = input.nextInt();

            if(guess == num1)
            {
                System.out.println("You Have Guessed the accurate Number.");
                done = true;
            }
        }

        //Example - 18
        System.out.println("Example - 18:");

        int j =0 ;
        do {
            System.out.print(j + " ");
            j=j+5;
        }
        while (j<20);

        //Example - 19
        System.out.println("Example - 19:");

        for( j =0 ; j<=20 ; j+=5)
        {
            System.out.print(j + " ");
        }

        //Example - 20
        System.out.println("Example - 20:");

        int[] array = new int[5];

        for (i=0; i<5 ; i++)
        {
            System.out.print("Enter the Value for Index "+ i + " : ");
            array[i] = input.nextInt();
        }

        System.out.println(array);

        //Example - 21
        System.out.println("Example - 21:");

        int row = 2;
        int column = 3;

        int[][] arr = new int[row][column];

        //Example - 22
        System.out.println("Example - 22:");

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.add(1, "Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0));
        System.out.println(cars);
        System.out.println(cars);
        System.out.println(cars);
        for (i = 0; i < cars.size(); i++)
        {
            System.out.println(cars.get(i));
        }

        //Example - 23
        System.out.println("Example - 23:");

        LinkedList<String> car = new LinkedList<String>(); cars.add("Volvo");
        car.add("BMW");
        car.add("Ford");
        car.add("Mazda");
        car.addFirst("Mazda"); System.out.println(cars);
        car.addLast("BMW"); System.out.println(cars);
        car.removeFirst(); System.out.println(cars);
        car.removeLast(); System.out.println(cars);
        System.out.println(car.getFirst());
        System.out.println(car.getLast());

        //Example - 24
        System.out.println("Example - 24:");

        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Alice", 123456789);
        phoneBook.put("Bob", 987654321);
        phoneBook.put("Charlie", 555666777);
        System.out.println("Phone Book: " + phoneBook);
        if (phoneBook.containsKey("Alice")) {
        }
        phoneBook.get("Bob");
        System.out.println("Alice's number is in the phone book.");
        if (phoneBook.containsValue(555666777)) {
        }
        System.out.println("Phone number 555666777 is in the phone book.");
        if (phoneBook.containsValue(555666777)) {
        }
        System.out.println("Phone number 555666777 is in the phone book.");
        System.out.println("After removing Charlie: " +phoneBook);
        System.out.println("Size of Phone Book: " + phoneBook.size());
        for (String key : phoneBook.keySet())
        {
            System.out.println("Name:" + key + " Phone: " + phoneBook.get(key));
        }
        phoneBook.clear();
        System.out.println("Is the Phone Book empty?" + phoneBook.isEmpty());

        //Example - 25
        System.out.println("Example - 25:");


        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple");
        System.out.println("Fruits: " + fruits);
        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the HashSet.");
        }
        else {
            System.out.println("Banana is not in the HashSet.");
        }
        System.out.println("After removing Mango: " + fruits);
        System.out.println("Size of HashSet: "+fruits.size());
        System.out.println("Is the HashSet empty?" + fruits.isEmpty());

    }
}
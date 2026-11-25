import java.util.Scanner;

public class Main {

    // Method to Validate Marks
    public static double getValidMark(Scanner input, int markNumber) {

        double mark;

        while (true) {

            System.out.print("Enter Mark " + markNumber + ": ");

            mark = input.nextDouble();

            if (mark >= 0 && mark <= 100) {

                return mark;

            } else {

                System.out.println(
                    "Error! Mark must be between 0 and 100. Try again."
                );
            }
        }
    }


    // Main Method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Display Project Information
        Student.displayProjectInfo();


        // Input Student Information
        System.out.println("\n===== ENTER STUDENT INFORMATION =====");

        System.out.print("Enter Registration Number: ");
        String regNumber = input.nextLine();

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Student Age: ");
        int age = input.nextInt();


        // Input and Validate Marks
        System.out.println("\n===== ENTER STUDENT MARKS =====");

        double mark1 = getValidMark(input, 1);
        double mark2 = getValidMark(input, 2);
        double mark3 = getValidMark(input, 3);


        // Create Student Object
        Student student1 = new Student(
            regNumber,
            name,
            age,
            mark1,
            mark2,
            mark3
        );


        // Display Student Information
        student1.displayInformation();


        // Close Scanner
        input.close();
    }
}


package QUIZ.Stu_qz;

public class Student {

    // Private Attributes
    private String registrationNumber;
    private String name;
    private int age;
    private double mark1;
    private double mark2;
    private double mark3;


    // Display Project Information
    public static void displayProjectInfo() {

        System.out.println("\n======================================");
        System.out.println("       STUDENT MANAGEMENT SYSTEM");
        System.out.println("======================================");

        System.out.println("\nProject Prepared By:");
        System.out.println("Name: Mohamed Abdelslam");
        System.out.println("Reg Number: 202510441");
        System.out.println("Course: Introduction to Java Programming");


        // Topics Learned and Applied
        System.out.println("\n===== TOPICS LEARNED AND APPLIED =====");

        System.out.println("1- Variables and Data Types");
        System.out.println("2- User Input using Scanner");
        System.out.println("3- Classes and Objects");
        System.out.println("4- Parameterized Constructors");
        System.out.println("5- Encapsulation");
        System.out.println("6- Access Modifiers (Private and Public)");
        System.out.println("7- Getters and Setters");
        System.out.println("8- Methods and Parameters");
        System.out.println("9- If and Else Statements");
        System.out.println("10- Logical Operators");
        System.out.println("11- While Loops");
        System.out.println("12- Basic Arithmetic Operations");
        System.out.println("13- Return Values");
        System.out.println("14- Input Validation");
        System.out.println("15- String and Numeric Data Types");
        System.out.println("16- Object Creation and Initialization");
        System.out.println("17- Method Calling");
        System.out.println("18- Formatted Output using printf");
        System.out.println("19- The this Keyword");


        // Learning Resources
        System.out.println("\n===== LEARNING RESOURCES =====");

        System.out.println("\n1- Telusko - Java Tutorial");
        System.out.println("YouTube:");
        System.out.println("https://www.youtube.com/playlist?list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5");

        System.out.println("\n2- W3Schools - Java Tutorial");
        System.out.println("https://www.w3schools.com/java/default.asp");

        System.out.println("\n======================================");
    }


    // Parameterized Constructor
    public Student(String registrationNumber, String name, int age,
                   double mark1, double mark2, double mark3) {

        this.registrationNumber = registrationNumber;
        this.name = name;
        this.age = age;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }


    // Getters and Setters

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public double getMark1() {
        return mark1;
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }


    public double getMark2() {
        return mark2;
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2;
    }


    public double getMark3() {
        return mark3;
    }

    public void setMark3(double mark3) {
        this.mark3 = mark3;
    }


    // Calculate Average
    public double calculateAverage() {

        return (mark1 + mark2 + mark3) / 3;
    }


    // Get Academic Status
    public String getStatus() {

        if (calculateAverage() >= 50) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }


    // Display Student Information
    public void displayInformation() {

        System.out.println("\n===== STUDENT INFORMATION =====");

        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);

        System.out.printf("Average: %.2f%n", calculateAverage());

        System.out.println("Status: " + getStatus());

        System.out.println("===============================");
    }
}

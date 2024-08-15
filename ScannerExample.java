import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Print statement
        System.out.print("Enter Name: ");

        // User input
        String name = sc.nextLine();    // Used to read line

        // Print statement
        System.out.print("Enter Roll Number: ");

        // User input
        int RollNo = sc.nextInt();    // Used to read Integer

        // Print statement
        System.out.print("Enter Marks: ");

        // User input
        double Marks = sc.nextDouble();  // Used to read Double

        // Print statement
        System.out.print("Enter Grade: ");

        // User input
        char Grade = sc.next().charAt(0);   // Used to read single character

        System.out.printf("%n");


        // Print the inputs
        System.out.println("Name : " + name);
        System.out.println("Roll Number : "  + RollNo);
        System.out.println("Marks : " + Marks);
        System.out.println("Grade : " + Grade);

        sc.close();

    }
    
}

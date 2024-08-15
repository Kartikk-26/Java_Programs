import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int roll = scanner.nextInt();

        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        if (name.equals("Kartik") && roll == 25) {
            if (marks > 35) {
                System.out.println("MSD is the KING");
            } 
            else {
                System.out.println("Hardik Is King");
            }
        }

        scanner.close();
    }
}

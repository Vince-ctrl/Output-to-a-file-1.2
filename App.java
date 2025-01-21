//importing all the important dependencies
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class App {
    public static void main(String[] args) throws Exception {
       //creating all the required objects
        Scanner input = new Scanner(System.in);
        File student = new File("Student.txt");
        FileWriter writer = new FileWriter("Student.txt");
        //creating all the necessary variables
        String fullName = "e";
        int grade = 0;
        String school = "e";
        //creating the file
        if (student.createNewFile()) {
            System.out.println("File created: " + student.getName());
        } else {
            System.out.println("File already exists");
        }
        // try/catch block to catch any potential errors
        try {
            System.out.println("please enter your full name");
            fullName = input.nextLine();
            System.out.println("please enter your school grade in numbers");
            grade = input.nextInt();
            input.nextLine();
            System.out.println("please enter the name of your school");
            school = input.nextLine();
        } catch (Exception e) {
            System.err.println("there was an error with your input, try again?");
            e.printStackTrace();
        }
        //write to the file
        String firstName = fullName.split(" ")[0];
        String lastName = fullName.split(" ")[1];
        writer.write(firstName + "\r\n");
        writer.write(lastName + "\r\n");
        writer.write(Integer.toString(grade) + "\r\n");
        writer.write(school);
        //close the objects no longer in use
        writer.close();
        input.close();
    }
}

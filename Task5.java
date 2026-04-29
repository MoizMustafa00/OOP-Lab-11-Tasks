package Lab11_Tasks;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("C:\\Users\\MOIZ\\OneDrive\\Desktop\\Confidential.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("File Created!");
            }
            else {
                System.out.println("File Already Exists!");
            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Enter Your Designation:");
        String designation = sc.nextLine();

        //Initially Setting to False
        file.setReadable(false);
        file.setWritable(false);
        file.setExecutable(false);

        if(designation.equalsIgnoreCase("Faculty")) {
            file.setReadable(true);
            file.setWritable(true);
            file.setExecutable(true);
        }
        else if(designation.equalsIgnoreCase("Student")) {
            file.setReadable(true);
            file.setWritable(false);
            file.setExecutable(false);
        }
        else {
            System.out.println("Invalid Designation!");
        }

        System.out.println("Access Rights Status:");
        System.out.println("Can Read: " + file.canRead());
        System.out.println("Can Write: " + file.canWrite());
        System.out.println("Can Execute: " + file.canExecute());
    }
}

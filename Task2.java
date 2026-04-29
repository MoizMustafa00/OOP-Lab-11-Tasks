package Lab11_Tasks;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("C:\\Users\\MOIZ\\OneDrive\\Desktop\\Student.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("File Created!");
            }
            else {
                System.out.println("File Already Exists!");
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write("Student Full Name: Moiz Mustafa\n");
            bw.write("Student ID: 25K-3040\n");
            bw.newLine();
            bw.close();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

        ArrayList<String> registeredCourse = new ArrayList<>();
        int pfLab = 0;
        int pfTheory = 0;
        int creditHrs = 0;
        System.out.println("Enter Marks For PF Lab:");
        pfLab = sc.nextInt();
        System.out.println("Enter Marks For PF Theory:");
        pfTheory = sc.nextInt();
        System.out.println("Enter the Number of Courses you have Already Registered:");
        creditHrs = sc.nextInt() * 3;

        if(pfLab >= 50 && pfTheory >= 50) {
            if(creditHrs + 6 <= 15) {
                registeredCourse.add("OOP Lab");
                registeredCourse.add("OOP Theory");
                creditHrs += 6;
                System.out.println("OOP Lab and OOP Theory Added!");
            }
            else {
                System.out.println("OOP Courses cannot be Added (Exceeding 15 Credit Hours)!");
            }
        }
        else {
            System.out.println("You Need to Clear Both PF Lab and PF Theory!");
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write("PF Lab Marks: " + pfLab);
            bw.newLine();
            bw.write("PF Theory Marks: " + pfTheory);
            bw.newLine();

            bw.write("Total Credit Hours: " + creditHrs);
            bw.newLine();
            bw.write("Registered Courses:");
            bw.newLine();

            for(int i=0; i<registeredCourse.size(); i++) {
                bw.write("Course " + (i+1) + ": " + registeredCourse.get(i));
                bw.newLine();
            }
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader(file));
            String buffer = br.readLine();
            while(buffer != null) {
                System.out.println(buffer);
                buffer = br.readLine();
            }
            br.close();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

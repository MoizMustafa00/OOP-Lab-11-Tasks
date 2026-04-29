package Lab11_Tasks;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> elements = new ArrayList<>();

        for(int i=0; i<5; i++) {
            System.out.println("Enter Element " + (i+1) + ": ");
            elements.add(sc.nextLine());
        }

        File file = new File("C:\\Users\\MOIZ\\OneDrive\\Desktop\\Task1.txt");
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

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for(int i=0; i<5; i++) {
                bw.write(elements.get(i));
                bw.newLine();
            }
            bw.close();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String buffer = br.readLine();
            while(buffer!= null) {
                System.out.println(buffer);
                buffer = br.readLine();
            }
            br.close();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

        if(file.delete()) {
                System.out.println("File Deleted!");
        }
        else {
                System.out.println("File Not Deleted!");
        }

        sc.close();
    }
}

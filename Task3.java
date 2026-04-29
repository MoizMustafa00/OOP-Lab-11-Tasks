package Lab11_Tasks;

import java.util.Scanner;

public class Task3 <U, P> {
    U username;
    P password;

    public Task3(U username, P password) {
        this.username = username;
        this.password = password;
    }

    public void validateLogin(U username, P password) {
        if(this.username.equals(username) && this.password.equals(password)) {
            System.out.println("You Have Successfully Logged In!");
        }
        else {
            System.out.println("Login Failed, Terminating the Program!");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task3<String, String> account = new Task3<>("MoizMustafa", "Moiz123");

        String username;
        String password;
        System.out.println("Enter Username:");
        username = sc.nextLine();
        System.out.println("Enter Password:");
        password = sc.nextLine();

        account.validateLogin(username, password);
    }
}

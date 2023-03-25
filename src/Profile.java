import java.util.Scanner;

public class Profile {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name,dep, mobile;

        System.out.println("Enter Your name:");
        name = sc.nextLine();
        System.out.println("Enter Your dep:");
        dep = sc.nextLine();
        System.out.println("Enter Your mobile:");
        mobile = sc.nextLine();

        System.out.println("Youer information:");
        System.out.println("name:"+ name);
        System.out.println("mobile:"+ mobile);
        System.out.println("dep:"+ dep);
    }
}

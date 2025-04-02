import java.util.Scanner;
public class loop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scanner.nextInt();
        for(int i=0;i<=n; i++){
            System.out.println(i);
        }
     scanner.close();   
}
}
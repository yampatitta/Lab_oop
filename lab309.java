import java.util.*;
public class lab309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a numbr : ");
        int num = sc.nextInt();
        for (int i=1; i<=num; i++) {
            if (i%5 == 0) {
                System.out.print("/");
            } else {
                System.out.print("|");
            }
        }
    }
}

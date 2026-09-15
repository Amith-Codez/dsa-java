import java.util.Scanner;
public class Watermelon {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        System.out.println((a>2&&a%2==0)?"YES":"NO");
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int san=scanner.nextInt();
        int san2= (int) Math.sqrt(san);
        int san3= (int) Math.pow(san2,2);
        if(san!=san3){
            throw new Error();
        }else{
            System.out.println("квадрат");
        }
    }
}
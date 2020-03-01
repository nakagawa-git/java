import java.util.Scanner;

class Mondai4_21{

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("左上直角の三角形を表示します。");
        System.out.print("段数：");
        int n = stdIn.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 0 ;j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }
}
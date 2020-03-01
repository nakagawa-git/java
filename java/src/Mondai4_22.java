import java.util.Scanner;

class Mondai4_19{

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("n段目のピラミッドを表示します。");
        System.out.print("段数：");
        int n = stdIn.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i-1)*2+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
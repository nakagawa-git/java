import java.util.Random;
import java.util.Scanner;

class Mondai4_27{

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        int no = rand.nextInt(100);

        System.out.println("数当てゲーム開始！！");
        System.out.println("0~99の数を当ててください。");

        System.out.print("入力できる回数を入れてください。");
        int num = stdIn.nextInt();

        int x;
        int y=0;
        do{
            System.out.print("いくつかな：");
            x = stdIn.nextInt();

            if(x > no){
                System.out.println("もっと小さな数だよ。");
            }else if(x < no){
                System.out.println("もっと大きな数だよ。");
            }

            if(y > num){
                break;
            }
            y=y+1;
            System.out.println(y);
        }while(x != no);

        System.out.println("正解です。");
        
    }
}
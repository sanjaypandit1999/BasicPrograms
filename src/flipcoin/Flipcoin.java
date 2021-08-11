package flipcoin;

import java.util.Scanner;
public class Flipcoin {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the num of flip coin- ");
        int num = sc.nextInt();
        int Head = 0;
        int Tail = 0;
        for (int i=0;i<num;i++){
            double flip =Math.random();
            System.out.println(flip);
            if (flip < 0.5){
                System.out.println("it's head");
                Head++;
            }
            else {
                System.out.println("it's Tail");
                Tail++;
            }
        }
        System.out.println("number of heads- "  + Head);
        System.out.println("number of tails-" +Tail);
        int headPercentage = (Head * 100 / num);
        int tailPercentage = (Tail * 100 / num);
        System.out.println("The percentage of Heads-" +headPercentage);
        System.out.println("The percentage of Tails-" +tailPercentage);
    }
}

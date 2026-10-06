//package src.javaProject;
import java.util.Scanner;

public class JavaProject{
    public static void main(String[] args){
        //Mini Project
        Scanner sc = new Scanner(System.in);
        int myNum = (int)(Math.random()*100);
        //Disclaimer!!
        System.out.println("If you want the answer and want to come out of the game type (-1) in the {Guess My Number}");

        int userNum = 0;
        do{
            System.out.print("Guess My Number(1-100)!:");
            userNum = sc.nextInt();

            // Condition
            if(userNum == myNum){
                System.out.println("WOOHOO .. CORRECT NUMBER!!!");
                break;
            }
            else if(userNum>myNum){
                System.out.println("Your Number is Large!");
            }
            else {
                System.out.println("Your Number is Small!");
            }
        }while(userNum >= 0);

//        System.out.print("My Number was:");
//        System.out.println(myNum);
        //or
        System.out.println("My Number Was:"+myNum+"!!");
    }
}
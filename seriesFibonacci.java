import java.util.Scanner;
public class seriesFibonacci{
    public static void main(String[] args){
        int count, num1 = 1, num2 = 1;
        System.out.println("Enter the term you want to get the Fibonacci series: ");
        Scanner userinput = new Scanner(System.in);
        count = userinput.nextInt();
        userinput.close();
        System.out.print("Fibonacci series of "+count+" numbers: ");
        int i = 1;
        while(i <= count){
          System.out.print(num1+" ");
          int PrevTwo = num1 + num2;
          num1 = num2;
          num2 = PrevTwo;
          i++;
        }
    }
}

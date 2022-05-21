/*
a Java program to find the average of food eaten by monkeys in a given number of days
*/
import java.util.Arrays;
import java.util.Scanner;

/**
 * average_food_eaten_by_monkeys
 */
public class average_food_eaten_by_monkeys {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//allows entry of data from the user
        System.out.print("Enter the number of monkeys");
        int row= scanner.nextInt();
        System.out.print("Enter the number of days");
        int column= scanner.nextInt();
        int [][] monkey = new int[row][column] ;//creation of 2D array 
        int sum=0;
        for(int i=0;i<row;i++){
            System.out.println("monkey"+i+1);
            for(int j=0;j<column;j++){
                System.out.println("enter for day "+(j+1));
                monkey[i][j]=scanner.nextInt();
                sum+=monkey[i][j];
            }
            }
        System.out.println(Arrays.deepToString(monkey));//displaying the input data
        System.out.println("The average is:"+(sum/row));//finding the average
    }
}
import java.util.*;
public class EvenNumbers{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int count = 0;

    System.out.println("First 10 even numbers are - ");

    for(int i=2;count!=10;i++){
        if(i%2==0){
            System.out.println(i+" ");
            count++;
        }
    }
}
}
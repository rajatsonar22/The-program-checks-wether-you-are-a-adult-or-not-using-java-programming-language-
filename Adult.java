import java.util.*;
public class Adult{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.print("It checks wether you are adult or not according to the input you have given you are :");

        if(age > 18){
        System.out.println("You are an ADULT");
        } 
        else{
            System.out.println("You are not an ADULT");
        }
    }
}
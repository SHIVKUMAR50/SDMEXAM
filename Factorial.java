import java.util.Scanner;
public class Factorial {
    public static int factorial(int n){
        int product=1;
        if (n == 0 || n==1 ){
            return 1 ;
        }
        else{   
            for(int i=2;i<=n;++i){
                product=product*i;
    }
return product;}}


    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
       System.out.println("Enter the number to get the factorial");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println("The factorial of the number is " + factorial(n));

    }}
import java.util.*;
import java.lang.*;
class Function{                                      

    double f (double x) {                                              
       return 3*Math.pow(x,2);
    }

    double IntSimpson(double a, double b,int n){
        double x = ((b-a)/6)*(f(a)+4*f((a+b)/2)+f(b));
        return x;
    } 
}  


class Main{                                                    

    public static void main(String args[]){
       Function function;                                   
       function = new Function();
        Scanner sc = new Scanner(System.in);
       double a = sc.nextDouble() ;                                           
       double b = sc.nextDouble() ;
       int n = sc.nextInt() ;
       double result = function.IntSimpson(a,b,n);

       System.out.println("Integral is: " + result);        
    }
}
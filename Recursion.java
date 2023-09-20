import java.util.Scanner;
public class Recursion {
    static void printInc(int n){
        if(n==1){
            System.out.println(1); 
            return;           
        }
        
        printInc(n-1);
        System.out.println(n);
    }
    static void printDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }
    //finding factorial
    static int fact(int n){
        if(n==0){
            return 1;
        }
        
        int ans=n*fact(n-1);

return ans;
    }
    static int fib(int n){

        //Base case
        if(n==0 || n==1){
            return n;
        }
        //Sub problem
        int fnm_1=fib(n-1);
        int fnm_2=fib(n-2);
        //self work
        return fnm_1+fnm_2;
    
    
    }
    static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
       return isSorted(arr, i+1);
    }
    static int firstOccurance(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
       // int n=10;
       // System.out.println("increasing n Natrul number");

        // printInc(n);
        //   System.out.println("Decreasing  n Natrul number");
        // printDec(n);

        // for(int i=0; i<=10; i++){
        //     System.out.println(fib(i));
        // }
        int arr[]={1,2,3,4,5};
        
        
        //isSorted(arr, 0);
        //System.out.println(isSorted(arr, 0));
        System.out.println(firstOccurance(arr, 3, 0));
        
    }
    
}

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        String N = s.nextLine();
        
        int size = N.length();
        char[] arr = new char[size];
        
        for(int i = 0; i < N.length(); i++){
            arr[i] = N.charAt(i);
        }
        
        Arrays.sort(arr);
        
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }
    }
}

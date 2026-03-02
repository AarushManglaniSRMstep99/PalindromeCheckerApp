/*
* @author Aarush Manglani
* @version 2.0
*
 */
import java.util.*;
public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        String a =input.nextLine();
        String rev="";
        for(int i=a.length()-1;i>-1;i--){
            rev+= a.charAt(i);
        }
        System.out.print("Is it a Palindrome? : ");
        if(a.equals(rev)){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}


public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args){
        String a ="madam";
        int b = 0;
        String rev="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==a.charAt(a.length()-i-1)){
                b=0;
            }
            else{
                b=1;
                break;
            }
        }
        System.out.print("Is it a Palindrome? : ");
        if(b==0){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}

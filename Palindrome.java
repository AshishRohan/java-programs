import java.util.*;
public class Palindrome    
{    
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        String string = sc.nextLine();    
        boolean flag = true;    
        string = string.toLowerCase();   
        for(int i = 0; i < string.length()/2; i++){    
            if(string.charAt(i) != string.charAt(string.length()-i-1)){    
                flag = false;    
                break;    
            }    
        }    
        if(flag)    
            System.out.println("Given string is palindrome");    
        else    
            System.out.println("Given string is not a palindrome");    
    }    
}    
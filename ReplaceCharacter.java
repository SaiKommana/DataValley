import java.util.*;
import java.lang.*;
public class ReplaceCharacter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input string:");
        String in=sc.nextLine();
        System.out.println("Enter the index number of the character that you want to replace:");
        int index=sc.nextInt();
        System.out.println("Enter the character to replace the char in the given index number");
        char ch=sc.next().charAt(0);
        System.out.println("The new string is "+replace(in,index,ch));
    }
    public static String replace(String s,int i,char ch){
        char[] arr=s.toCharArray();
        arr[i]=ch;
        return String.valueOf(arr);
    }
}
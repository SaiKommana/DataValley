import java.lang.*;
import java.util.*;
public class VowelsAndConsonents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input string:");
        String in=sc.nextLine();
        int v_count=0;
        int c_count=0;
        String inp=in.toLowerCase();
        for(int i=0;i<inp.length();i++){
            int ch=inp.charAt(i)-'a';
            if(ch==0 || ch==4 ||ch==8 ||ch==14 ||ch==20){
                v_count+=1;
            }
            else if(ch>0&&ch<=26 ){
                c_count+=1;
            }
        }
        System.out.println("There are "+v_count+" vowels and "+c_count+" consonents in "+in);
    }
    
}
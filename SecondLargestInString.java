/*Print the second largest word in the given sentence, without using arrays or strings
 Eg: I work in Madurai
 o/p = work */
import java.util.Scanner;

public class SecondLargestInString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter string: ");
        String str=scanner.nextLine();
        String[] words=str.split(" ");
        String first="";
        String second="";
        int len=0;
        
        for(String word:words){
            len=word.length();
            if(len>first.length()){
                second=first;
                first=word;}
        
        else if(len>second.length() && len<first.length()){
                second=word;
            }
        }
        System.out.println("Second largest word: " + second);
    }
}

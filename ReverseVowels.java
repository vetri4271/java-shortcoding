/*Question 2: Reverse Only the Vowels in a String

Given a string s, reverse only all the vowels in the string and return the resulting string.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lowercase and uppercase, more than once.

Example 1
Input:
s = "hello"

Output:
"holle"

Example 2
Input:
s = "zoho corporation"

Output:
"zohi carporotoon"

Explanation:
Only the vowels are reversed, while all consonants, spaces, and other characters remain in their original positions.*/


public class ReverseVowels {
    public static void main(String[] args) {
        String s="zoho corporation";
        char[] arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        char temp;
        while(left<right){
            if("aeiouAEIOU".indexOf(arr[left]) != -1){
                if("aeiouAEIOU".indexOf(arr[right]) != -1){
                    temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                    left++;
                    right--;
                }
                else{
                    right--;
                }
            }
            else{
                left++;
            }
        }
        System.out.println(new String(arr));
    }
}

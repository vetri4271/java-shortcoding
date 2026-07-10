/*
Print the encrypted message by shifting every alphabet and number by the given positions in the forward circular direction.

Alphabets should wrap around:
z → a
Z → A
Digits should also wrap around:
9 → 0
Spaces and special characters should remain unchanged in the encrypted message.
Sample Input 1
Zoho
4
Sample Output 1
dsls
Sample Input 2
Wake me early at 5 a.m
3
Sample Output 2
zdnh ph hduob dw 8 d.p
*/

import java.util.Scanner;

public class EncryptMessage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String message = sc.nextLine();
        int shift = sc.nextInt();

        StringBuilder result = new StringBuilder();

        for (char ch : message.toCharArray()) {

            // Lowercase letters
            if (ch >= 'a' && ch <= 'z') {
                char c = (char) ('a' + (ch - 'a' + shift) % 26);
                result.append(c);
            }
            // Uppercase letters
            else if (ch >= 'A' && ch <= 'Z') {
                char c = (char) ('a' + (ch - 'A' + shift) % 26);
                result.append(c);
            }

            // Digits
            else if (ch >= '0' && ch <= '9') {
                char c = (char) ('0' + (ch - '0' + shift) % 10);
                result.append(c);
            }

            // Space or special characters
            else {
                result.append(ch);
            }
        }

        System.out.println(result);
        sc.close();
    }
}
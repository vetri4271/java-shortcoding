/*Question - 2
String decode
i/p = 2ab3c o/p = aabccc
i/p = 2(ab)c3d o/p = ababcddd*/
public class Stringdecode {
    public static void main(String[] args) {

        String input = "2(ab)c3d";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {

                int count = ch - '0';

                // Case 1: digit followed by a group
                if (input.charAt(i + 1) == '(') {

                    i += 2; // Skip digit and '('

                    StringBuilder group = new StringBuilder();

                    while (input.charAt(i) != ')') {
                        group.append(input.charAt(i));
                        i++;
                    }

                    for (int j = 0; j < count; j++) {
                        result.append(group);
                    }
                }

                // Case 2: digit followed by a single character
                else {

                    char next = input.charAt(i + 1);

                    for (int j = 0; j < count; j++) {
                        result.append(next);
                    }

                    i++; // Skip the repeated character
                }
            }

            // Normal character
            else if (Character.isLetter(ch)) {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}

/* 
y
LowerCase 

T
UpperCase

8
Invalid
*/

import java.util.Scanner;

public class CharInputUpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        System.out.println(ch);

        if (ch >= 97 && ch <= 122) {
            System.out.println("LowerCase");
        } else if (ch >= 65 && ch <= 90) {
            System.out.println("UpperCase");
        } else {
            System.out.println("Invalid Character");
        }
    }

}

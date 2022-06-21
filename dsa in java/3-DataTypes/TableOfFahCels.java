
/* 
print Table of Fahrenheit to celsius
0       -17
20      -6
40      4
60      15
80      26
100     37
120     48
140     60
160     71
180     82
200     93
220     104
240     115
260     126
280     137
300     148
 */

public class TableOfFahCels {

    public static void main(String[] args) {
        int fmin = 0;
        int fmax = 300;
        int fstep = 20;
        int fcurrent = fmin;

        while (fcurrent <= fmax) {
            int celsius = (int) ((5.0 / 9) * (fcurrent - 32));
            // conversion of double to integer was occurring so i explicitly converted
            // double to integer.

            System.out.println(fcurrent + "\t" + celsius);
            fcurrent = fcurrent + fstep;
        }
    }

}

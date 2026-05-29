// Last updated: 30/05/2026, 00:06:33
class Solution {
    public String addBinary(String a, String b) {
        // int aSize = a.length();
        // int bSize = b.length();

        // int carry = 0;
        // String result = "";
        // for (int i = ((aSize >= bSize) ? aSize : bSize) - 1; i >= 0; i--) {
        //     char bChar;
        //     if (aSize != bSize) {
        //         if (i < bSize)
        //             bChar = '0';
        //         else
        //             bChar = b.charAt(i - bSize);
        //     } else
        //         bChar = b.charAt(i);
        //     if (carry == 0) {
        //         if (a.charAt(i) == '1' && bChar == '1') {
        //             carry++;
        //             result = "0" + result;
        //         } else if ((a.charAt(i) == '0' && bChar == '1')
        //                 || (a.charAt(i) == '1' && bChar == '0')) {
        //             result = "1" + result;
        //         } else {
        //             result = "0" + result;
        //         }
        //     } else {
        //         if (a.charAt(i) == '1' && bChar == '1') {
        //             result = "1" + result;
        //         } else if ((a.charAt(i) == '0' && bChar == '1')
        //                 || (a.charAt(i) == '1' && bChar == '0')) {
        //             result = "0" + result;
        //         } else {
        //             result = "1" + result;
        //             carry--;
        //         }
        //     }
        //     System.out.println(result);
        // }
        // if (carry != 0)
        //     result = "1" + result;
        // return result;
        int i = a.length() - 1;
    int j = b.length() - 1;
    int carry = 0;

    StringBuilder sb = new StringBuilder();

    while (i >= 0 || j >= 0 || carry != 0) {
        int sum = carry;

        if (i >= 0) sum += a.charAt(i--) - '0';
        if (j >= 0) sum += b.charAt(j--) - '0';

        sb.append(sum % 2);
        carry = sum / 2;
    }

    return sb.reverse().toString();
    }
}
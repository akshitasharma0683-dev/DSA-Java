public class palindrome {
    public static void main(String[] args) {
        int x=101;
        boolean ans= isPalindrome(x);
        System.out.println(ans);
    }
}


    public static boolean isPalindrome(int x) {
        // Negative numbers and numbers ending with 0 (except 0)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // Even digits: x == reversedHalf
        // Odd digits: x == reversedHalf / 10
        return x == reversedHalf || x == reversedHalf / 10;
    }



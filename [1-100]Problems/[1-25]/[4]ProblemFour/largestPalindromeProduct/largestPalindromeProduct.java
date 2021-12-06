public class largestPalindromeProduct {
    public static void main(String[] args) {
        int iMax = -1;
        int p = 0;

        int iDigitNumMax = 999; // Used to represent a 3 digit number for the 3-digit * 3-digit palindrome (999 is the highest for a 3-digit 1000 would be 4-digit).
        int iDigitNumMin = 100; // Used to represent the lowest value for the digit number (100 is the lowest for a 3-digit number, 99 would be 2-digit).

        for(int i = iDigitNumMax; i >= iDigitNumMin; i--){ // For the solution to this task we require a value between 999 - 100.
            // We start at 999 decreasing each time we dont find a palindrome.
            if(iMax >= i*iDigitNumMax){
                break;
            }

            for(int j = iDigitNumMax; j >= i; j--){
                p = i*j;
                if (iMax < p && isPalindrome(p)){
                    iMax = p;
                }
            }

        }
        System.out.println("The largest palindrome is: " + iMax); // Prints the highest palindrome.
    }

    public static boolean isPalindrome(int p) {
        int iRev = 0; // Used to store the variable in reverse.
        int iX = p; // Stores the possible Palindrome.

        while(iX > 0){
            iRev = 10 * iRev + iX % 10;
            iX /= 10;
        }

        return p == iRev; // Returns True if P is the same as the reverse.
    }
}

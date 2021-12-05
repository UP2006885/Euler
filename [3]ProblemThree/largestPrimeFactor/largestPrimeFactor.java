public class largestPrimeFactor{
    public static void main(String[] args) {
        int iFactorOF = 32;

        for(int i = 1; i <= iFactorOF; i++){
            /* Simply a factor is a number in which can be devided with its factor parent, to create a whole number. 
            For example 2 is a factor of 8, because the result is 4. 3 is not a factor as the result would have a decimal value. */
            if((iFactorOF % i) == 0){
                System.out.println("A factor of " + iFactorOF + " is: " +i);
            }
        }

    }
}
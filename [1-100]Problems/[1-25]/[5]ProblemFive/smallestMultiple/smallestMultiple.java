public class smallestMultiple {
    public static void main(String[] args) {
        long iSmallestMultiple = 1000000000000000L; // Ignore.
        long iCountValue = 10000000000L;

        while(iCountValue != 1){
            if(iCountValue < iSmallestMultiple){ // This is run first as their is no point even running the count value if its highest than the smallest multiple as we dont want the highest.
                if(isEvenlyDivisible(iCountValue)){ // Returns TRUE if iCountValue is evenly divisible by 1-20.
                        System.out.println(iCountValue + ", Is the new smallest multiple evenly divisible between 1-20.");
                        iSmallestMultiple = iCountValue;
                }
            } 
            iCountValue--;
        }
    }

    public static boolean isEvenlyDivisible(long iVal){
        int iMax = 20;
        for(int i = 1; i <= iMax; i++){ // This loops through the amount of multiple times we require.
            if(iVal % i !=0){return false;} // If a remainder is outputted the method will instantly stop and return false.
        }


        return true; // This is only ever run if the iVal passes the for loop.
    }
}

public class largestPrimeFactor{
    public static void main(String[] args) {
        // I am using the long data type. (Use L after the variable to indicate it is a Long value.) This is because the problem requires me to compute a large value outside the maximum value size of an int.
        long iFactorOF = 600851475143L; 
        long iNewFactorOF = iFactorOF;
        long iLargestFactor = 0L;
        long counter = 2L; // Its not 1 or 0 because those are of none imporance with factors (0 and 1 would be factors we arent looking for those.)

        while(counter * counter <= iNewFactorOF){
            if (iNewFactorOF % counter == 0){
                iNewFactorOF = iNewFactorOF / counter;
                iLargestFactor = counter;
                System.out.println(counter);
            } else {
                counter++;
            }
        }
        if (iNewFactorOF > iLargestFactor) {
            iLargestFactor = iNewFactorOF;
        }    

        System.out.println("Largest Prime Factor: " + iLargestFactor);

        /* A prime number is a number that can only be divided by itself and 1 without remainders. 
        For example: 5 is a prime number as it can only be devised by 5 and 1.
                     4 is not as it can be devised by 2.
        */
    }
}
public class evenFibonacciNums {
    public static void main(String[] args) {
        // 1, 2. (1+2)3, then (2+3)5 then (5+3)8 etc.
        int iAmountOfTerms = 31; // Anymore than 31 terms goes over 4mil which is against the specifications of the task.
        int iCurrentTerm = 2;
        int iTempTerm = 0;
        int iPreviousTerm = 1;
        System.out.println(iPreviousTerm);

        
        int iTotalSum = 0; // Used to store total for the solution answer.

        for(int i = 0; i <iAmountOfTerms; i++){
            if((iCurrentTerm%2)==0){iTotalSum += iCurrentTerm;}// Checks if the iCurrentTerm is even if it is it adds it to the total.
            System.out.println(iCurrentTerm);

            iTempTerm = iCurrentTerm;
            iCurrentTerm += iPreviousTerm;
            iPreviousTerm = iTempTerm;

        }

        System.out.println("The sum of all even numbers of the Fibonacci Sequences under 4mil is: " + iTotalSum);
        

    }
}

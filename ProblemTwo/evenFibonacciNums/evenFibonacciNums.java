public class evenFibonacciNums {
    public static void main(String[] args) {
        // 1, 2. (1+2)3, then (2+3)5 then (5+3)8 etc.
        int iAmountOfTerms = 10;
        int iCurrentTerm = 2;
        int iTempTerm = 0;
        int iPreviousTerm = 1;

        for(int i = 0; i <iAmountOfTerms; i++){
            System.out.println(iPreviousTerm);
            System.out.println(iCurrentTerm);

            iTempTerm = iCurrentTerm;
            iCurrentTerm += iPreviousTerm;
            iPreviousTerm = iTempTerm;
        }
    }
}

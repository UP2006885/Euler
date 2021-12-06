public class sumSquareDifference {
    public static void main(String[] args) {
        int iNumOfNaturalNums = 100;
        int iPowers =0;
        int iSum = 0;

        for(int i = 1; i <= iNumOfNaturalNums; i++){
            iSum += i;
            iPowers += i*i;
        }

        System.out.println("Sum of numbers squared: "+iSum*iSum+" Sum Of squared nums: "+iPowers);
        System.out.println("Difference: "+ ((iSum*iSum) - iPowers));

    }
}

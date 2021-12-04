public class MultiplesOf3or5{
    public static void main(String[] args) {
        int iNumber = 10; // This is the maximum number for this problem.
        int iSum3 = 0;
        int iSum5 = 0;
        // 3/5. We must find all multiples of 3 and 5 inside this maximum number, and then sum them together.


        for(int i = 1; i < iNumber; i++){ // %3
            if((i % 3)== 0) {
                System.out.println(i + " Is a multiple of 3.");
                iSum3 = iSum3 + i;
            }
        } 

        for(int i = 1; i < iNumber; i++){ // %5
            if((i % 5)== 0) {
                System.out.println(i + " Is a multiple of 5.");
                iSum5 = iSum5 + i;
            }
        } 

        System.out.println("The total sum is: "+ (iSum3 + iSum5));


    }
}
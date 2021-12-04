public class MultiplesOf3or5{
    public static void main(String[] args) {
        int iNumber = 1000; // This is the maximum number for this problem.
        int total = 0;
        // 3/5. We must find all multiples of 3 and 5 inside this maximum number, and then sum them together.


        for(int i = 1; i < iNumber; i++){ // %3 || %5
           if(((i % 3) == 0) || ((i % 5) == 0)) {
                total += i;
           }
        } 
        System.out.println("The total sum is: "+ (total));


    }
}
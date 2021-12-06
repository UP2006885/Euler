public class oneThousandAndOnePrime {
    public static void main(String[] args) {
        int p = 2;
        int amountOfPrimes = 0;
        
        while(amountOfPrimes != 10001){
            if(checkPrime(p)){
                System.out.println("Prime["+(amountOfPrimes+1)+"]: "+ p);
                amountOfPrimes++;
            }
            p++;
        }    
    }

    public static boolean checkPrime(int p){
        for (int i = 2; i<= p/2; i++){
            if ((p % i) == 0){
                return false;   
            }
        }
        return true;

    }
}
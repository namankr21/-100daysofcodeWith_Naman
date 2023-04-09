public class day_9_Prime_In_Diagonal
{
    public static void main(String[] args) {
        int [][]arr = {{1,2,3},{5,6,7},{9,10,11}};
        System.out.println(diagonalPrime(arr)); 
    }
    public static int diagonalPrime(int[][] arr) {
        int n = arr.length;
        int max = 0;
        for(int i=0;i<arr.length;i++) 
        {
            int num = arr[i][i];
            int prime = checkPrime(num);
            // System.out.println(prime);
            max = Math.max(prime,max);
            num = arr[i][n - i - 1];
            prime = checkPrime(num);
            max = Math.max(prime,max);
        }
        return max;
    }
    public static int checkPrime(int n)
    {
        boolean isPrime = true;
        if (n <= 1) {
            return -1;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) 
        {
                if (n % i == 0) 
                {
                    isPrime = false;
                    break;
                }
            }
        if(isPrime) return n;
        else return -1;
    }
}

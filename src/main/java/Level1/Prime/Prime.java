package Level1.Prime;
// optimized solution from geeksforgeeks
public class Prime {

    // "Instead of checking till n, we can check till √n because a larger factor of n must be
    // a multiple of smaller factor that has been already checked."

    public boolean isPrime(int n) {
        // Corner case
        if (n <= 1) return false;

        // Check from 2 to square root of n
        for (int i = 2; i*i <= n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}

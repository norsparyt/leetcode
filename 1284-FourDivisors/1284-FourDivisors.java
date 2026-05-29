// Last updated: 30/05/2026, 00:04:15
class Solution {
    public int sumFourDivisors(int[] nums) {
        //number theory says - A number has exactly 4 divisors only in two cases:
        // 1.	n = p³ (cube of a prime)
        // divisors → {1, p, p², p³}
        // 2.	n = p × q (product of two distinct primes)
        // divisors → {1, p, q, p×q}

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            //case 1
            int n = nums[i];
            int c = (int) Math.round(Math.cbrt(n));
            if (c * c * c == n && isPrime(c)) {
                sum = sum + 1 + c + c * c + n;
                continue;
            }
            //case 2
            for (int k = 2; k * k <= n; k++) {
                if (n % k == 0) {
                    int two = n / k;
                    if (two != k && isPrime(two) && isPrime(k)) {
                        sum += 1 + two + k + n;
                        break;
                    }
                }
            }
        }
        return sum;
    }

    boolean isPrime(int x) {
        if (x < 2)
            return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
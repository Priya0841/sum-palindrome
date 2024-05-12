class Solution {
     static long reverse(long n) {
        long reversed = 0;
        while (n > 0) {
            long digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    // Function to check if a number is palindrome
    static boolean isPalindrome(long n) {
        long original = n;
        long reversed = reverse(n);
        return original == reversed;
    }

    // Function to find the palindrome number by adding the reverse of the given number
    static long isSumPalindrome(long n) {
        int iterations = 0;
        while (iterations <= 5) {
            if (isPalindrome(n)) {
                return n;
            }
            long reversed = reverse(n);
            n = n + reversed;
            iterations++;
        }
        return -1;
    }
}

Inside the isSumPalindrome method,
we check if the number n is a palindrome using the isPalindrome method. 
If it is, we return n as it's already a palindrome.
If n is not a palindrome, we reverse n and add it to n (n = n + reversed).
We repeat this process until n becomes a palindrome or until the number of iterations reaches 5.

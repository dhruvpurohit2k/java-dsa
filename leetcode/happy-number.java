//First we make the number a single digit number. only digits 1 and 7 are happy number.   
class Solution {
    public boolean isHappy(int n) {
        int sum,digit;
        while (n > 9) {
            sum = 0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            n = sum;
        }
        if (n == 1 || n == 7)
            return true;
        else
            return false;
    }
}

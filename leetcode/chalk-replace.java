//The trick is to first calculate the number total number of chalks used by students. Then take mod of the current k and total number of chalk in the iteration to reduce the number iterations.
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int total = 0;
        for (int i = 0; i < chalk.length; i++) {
            k -= chalk[i];
            if (k < 0)
                return i;
            else
                total += chalk[i];
        }
        k = k % total;
        for (int i = 0; i < chalk.length; i++) {
            k -= chalk[i];
            if (k < 0)
                return i;
        }
        return -1;
    }
}

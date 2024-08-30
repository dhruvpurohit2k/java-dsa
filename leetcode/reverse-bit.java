//The trick is to get the each bit out of the passed number. To do that we create a variable which has its bit set to 1 except the first one. The we use the or operator on the passed number and our max number. If the max number has all its bits set to one the we add one to the result else we do nothing. we then right shift the passed number and left shift the result at the start of the loop. We do this 32 times since int has 32 bits.
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        int max = 0xfffffffe;
        int temp;
        int count = 1;
        while (count <= 32) {
            result = result << 1;
            temp = max | n;
            if (temp == 0xffffffff)
                result += 1;
            n = n >> 1;
            count++;
        }
        return result;
    }
}

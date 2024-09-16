//The trick is realise that if we begin with stones that a multiple of 3 then no matter what we pick the other player can either always bring the number of stones down to a multiple of 4 and eventually take the last stone.And in a similar way if we start off with not a multiple of 4 we can bring it down to a multiple of 4 and thus win.
class Solution {
    public boolean canWinNim(int n) {
        return n%4!=0;
    }
}

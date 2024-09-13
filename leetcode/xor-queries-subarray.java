The trick is to precalculate the xor values. We iteratively XOR the values present in the given array, i.e 0 and 1 then their result with 2 and then its result with 3 and so on. When the left is 0 we simply return the value at right. else we XOR right and left-1, since the when we XOR left -1 we add back the value that were XORED before left -1.
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] output = new int[queries.length];
        int[] refer = new int[arr.length];
        int num = 0;
        refer[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            num = arr[i];
            refer[i] = num ^ refer[i - 1];
        }
        int count = 0;
        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];
            if (left == 0) {
                output[count++] = refer[right];
            } else {
                output[count++] = refer[left - 1] ^ refer[right];
            }

        }
        return output;
    }
}

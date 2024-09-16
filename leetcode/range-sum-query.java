class NumArray {
    int[] numArray;
    int[] sums;

    public NumArray(int[] nums) {
        int n = nums.length;
        this.numArray = nums;
        this.sums = new int[n];
        this.sums[0] = this.numArray[0];
        for(int i = 1; i<n;i++){
            this.sums[i] = this.sums[i-1] + this.numArray[i];
        }
    }

    public int sumRange(int left, int right) {
        int sum = this.sums[right];
        int i = 0;
        while(i<left){
            sum-=this.numArray[i++];
        }
        return sum;
    }
}

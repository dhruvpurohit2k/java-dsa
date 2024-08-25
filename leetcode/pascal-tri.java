class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for(int i = 1; i<numRows;i++){
            result.add(new ArrayList<>());
            int numCells = i+1;
            result.get(i).add(1);
            for(int j = 0,k = j+1;j<numCells-2;j++,k++){
                result.get(i).add(result.get(i-1).get(j)+result.get(i-1).get(k));
            }
            result.get(i).add(1);
        }
        return result;
    }
}

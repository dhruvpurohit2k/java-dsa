
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> currentRow;
        currentRow = new ArrayList<>();
        currentRow.add(1);
        if (rowIndex == 0) {
            return currentRow;
        }
        List<Integer> previousRow;
        for(int i = 1; i<=rowIndex; i++){
            previousRow = currentRow;
            currentRow = new ArrayList<>();
            currentRow.add(1);
            for(int j = 0,k=j+1;k<previousRow.size();j++,k++){
                currentRow.add(previousRow.get(j) + previousRow.get(k));
            }
            currentRow.add(1);
        }
        return currentRow;

    }
}

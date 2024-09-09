//The trick is to lap around the matrix and keep track of the outer rows and columns that are being filled
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                result[i][j] = -1;
            }
        }
        int toprow = 0, leftcol = 0,bottomrow = m-1,rightcol = n-1;
        while(head!=null){
            for(int col = leftcol;col<=rightcol&&head!=null;col++){
                result[toprow][col] = head.val;
                head = head.next;
            }
            toprow++;
            for(int row = toprow;row<=bottomrow&&head!=null;row++){
                result[row][rightcol] = head.val;
                head = head.next;
            }
            rightcol--;
            for(int col = rightcol;col>=leftcol&&head!=null;col--){
                result[bottomrow][col] = head.val;
                head = head.next;
            }
            bottomrow--;
            for(int row = bottomrow;row>=toprow&&head!=null;row--){
                result[row][leftcol] = head.val;
                head = head.next;
            }
            leftcol++;
        }
        return result;
    }
}

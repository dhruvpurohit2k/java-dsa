/* Given n pairs of parenthese, write a fucntion to generate all combinations of
 * well-formed parenthese;
 * */
class Solution {
  public List<String> generateParenthesis(int n) {
    List<String> result = new ArrayList<>();
    List<String> tempString = new ArrayList<>();
    backtrack(n, 0, 0, tempString, result);
    return result;
  }

  void backtrack(int n, int leftCount, int rightCount,
                 List<String> currentString, List<String> resultString) {
    if (leftCount >= n && rightCount == n) {
      String listToString = String.join("", currentString);
      resultString.add(listToString);
    }

    if (leftCount < n) {
      currentString.add("(");
      backtrack(n, leftCount + 1, rightCount, currentString, resultString);
      currentString.remove(currentString.size() - 1);
    }

    if (rightCount < leftCount) {
      currentString.add(")");
      backtrack(n, leftCount, rightCount + 1, currentString, resultString);
      currentString.remove(currentString.size() - 1);
    }
  }
}

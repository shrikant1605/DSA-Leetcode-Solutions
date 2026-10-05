class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int score = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(score);
                score = 0;
            } else {
                int inside = score;
                score = stack.pop() + Math.max(2 * inside, 1);
            }
        }

        return score;
    }
}
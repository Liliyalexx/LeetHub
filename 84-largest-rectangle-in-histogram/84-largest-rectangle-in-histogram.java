// public class Solution {
//     public int largestRectangleArea(int[] heights) {
//         Deque<Integer> stack = new ArrayDeque<>();
//         stack.push(-1);
//         int length = heights.length;
//         int maxArea = 0;
//         for (int i = 0; i < length; i++) {
//             while ((stack.peek() != -1)
//                     && (heights[stack.peek()] >= heights[i])) {
//                 int currentHeight = heights[stack.pop()];
//                 int currentWidth = i - stack.peek() - 1;
//                 maxArea = Math.max(maxArea, currentHeight * currentWidth);
//             }
//             stack.push(i);
//         }
//         while (stack.peek() != -1) {
//             int currentHeight = heights[stack.pop()];
//             int currentWidth = length - stack.peek() - 1;
//             maxArea = Math.max(maxArea, currentHeight * currentWidth);
//         }
//         return maxArea;
//     }
// }


class Solution {
    public int largestRectangleArea(int[] heights) {

        int arraySize =  heights.length;
        int[] left = new int[arraySize];
        int[] right = new int[arraySize];
        Stack<Integer> stack = new Stack<>();

        for (int i =0; i < arraySize; i++) {
            if (stack.isEmpty()) {
                left[i] = 0;
            } else {
                while (!stack.empty() && heights[stack.peek()] >= heights[i]) {
                    stack.pop();
                }
                left[i] = stack.empty() ? 0 : stack.peek() + 1;
            }
            stack.push(i);
        }

        stack.clear();

        for (int i = arraySize-1; i >= 0; i--) {
            if (stack.empty()) {
                right[i] = arraySize - 1;
            } else {
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                    stack.pop();
                }
                right[i] = stack.isEmpty() ? arraySize - 1 : stack.peek() - 1;
            }
            stack.push(i);
        }

        int maxArea = 0;
        for (int i =0; i < arraySize; i++) {
            int area = heights[i] * (right[i] - left[i] + 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

}
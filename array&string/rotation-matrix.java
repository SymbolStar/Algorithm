class Matrix {

  /*
   * 给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
   * 
   * 不占用额外内存空间能否做到？
   * 
   *  
   * 
   * 示例 1:
   * 
   * 给定 matrix = [ [1,2,3], [4,5,6], [7,8,9] ],
   * 
   * 原地旋转输入矩阵，使其变为: [ [7,4,1], [8,5,2], [9,6,3] ] 示例 2:
   * 
   * 给定 matrix = [ [ 5, 1, 9,11], [ 2, 4, 8,10], [13, 3, 6, 7], [15,14,12,16] ],
   * 
   * 原地旋转输入矩阵，使其变为: [ [15,13, 2, 5], [14, 3, 4, 1], [12, 6, 8, 9], [16, 7,10,11] ]
   * 
   * Java
   * 
   * 
   * 
   * 作者：力扣 (LeetCode)
   * 链接：https://leetcode-cn.com/leetbook/read/array-and-string/clpgd/
   * 来源：力扣（LeetCode） 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
   * 
   */

  public static void main(String[] args) {
    int[][] testCase1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[][] testCase2 = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
    Solution solution = new Solution();
    solution.rotate(testCase2);

    for (int i = 0; i < testCase2.length; i++) {
      for (int is : testCase2[i]) {
        System.out.print(is);
      }
      System.out.println(" ");
    }
  }

  static class Solution {
    public void rotate(int[][] matrix) {
      System.out.println(matrix.length);
      int length = matrix.length;
      for (int i = 0; i <= matrix.length / 2; i++) {
          for (int j = i; j <matrix.length-1-i; j++) {
            int x = matrix[i][j];
            matrix[i][j] = matrix[length-1-j][i];
            matrix[length - 1- j][i] = matrix[length-1  - i][length-1 - j];
            matrix[length-1 - i][length-1 - j] = matrix[j][length-1 - i];
            matrix[j][length-1 - i] = x;
          }
      }
    }
  }

}

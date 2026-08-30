class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=n-1;j>=0;j--){
                row.add(matrix[j][i]);
            }
            list.add(row);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = list.get(i).get(j);;
            }
        }
    }
}
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int result[] = new int[queries.length];
        for(int i = 0;i<queries.length;i++){
            int ind1 = queries[i][0];
            int ind2 = queries[i][1];
            int t = 0;
            for(int j = ind1;j<=ind2;j++){
                
                t ^= arr[j];
            }
           System.out.println(t);
                result[i] = t;
            
                
        }
         return result;
    }
}
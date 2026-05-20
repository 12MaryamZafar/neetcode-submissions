class Solution {
    public int maxArea(int[] heights) {
        //we need to calculate the area actually as H*W
        //smallest height from i and j is actually going to consider for
        //water storage.
        //j-i is actally the width.
        int res=0;
        for(int i=0; i<heights.length; i++){
            for(int j=i+1; j<heights.length; j++){
                res = Math.max(res, Math.min(heights[i] , heights[j]) * (j-i));

            }
        }
        return res;
    }
}

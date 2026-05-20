class Solution {
//this is for ascending order quick sort
    int partition(int[] nums, int st, int end){
        int idx=st-1;
        int pivot=nums[end];
        for(int j=st; j<end; j++){
            if(nums[j]<=pivot){
                idx++;
                swap(nums, j, idx);
            }
        }
        idx++;
        swap(nums, end, idx);
        return idx;
    }

    void swap(int[]nums , int j, int idx){
        int temp=nums[j];
        nums[j]=nums[idx];
        nums[idx] = temp;
    }
    void quickSort(int[]nums, int st, int end){

        if(st<end){
            int pivId= partition(nums, st, end);
            quickSort(nums, 0, pivId-1); //left half
            quickSort(nums, pivId+1, end);//right half

        }
    }
    public int[] sortArray(int[] nums) {
    
        quickSort(nums, 0, nums.length-1);
        return nums;
    }
}
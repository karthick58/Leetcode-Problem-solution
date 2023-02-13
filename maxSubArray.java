public int maxSubArray(int[] nums) {
    int max_sum = Integer.MIN_VALUE ; 
    int curr_sum = 0 ; 
    for(int elem : nums){
        curr_sum+=elem;
        max_sum = Math.max(max_sum ,curr_sum);
        if(curr_sum <0){
            curr_sum =0 ;
        }
    }
    return max_sum ;
}

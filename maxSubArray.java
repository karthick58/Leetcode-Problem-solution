class Solution {
    public int maxSubArray(int[] arr) {
        int max_ending_here=0;
    int max_so_far=0;
    int start =0;
    int end=0;


    for(int i=0;i< arr.length;i++){
        max_ending_here=max_ending_here+arr[i];
        if(max_ending_here<0)
        {
            start=i+1; //Every time it goes negative start from next index
            max_ending_here=0;
        }
        else 
            end =i; //As long as its positive keep updating the end

        if(max_so_far<max_ending_here){
            max_so_far=max_ending_here;
        }

    }
    return max_so_far;
}

}
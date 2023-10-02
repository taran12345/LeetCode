class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j=0, sum=0, ans=Integer.MAX_VALUE, flag=1;
        for(int i=0; i<nums.length; i++){
            sum= sum + nums[i];
            while(sum>=target){
                ans = Math.min((i-j+1),ans);
                sum=sum-nums[j];
                j++;
                flag =0;
            }
        }
        if(flag==1) return 0;
        else return ans;
    }
}
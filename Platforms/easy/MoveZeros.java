/*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
Accepted
676,258
Submissions
1,189,609
Seen this question in a real interview before?

Yes

No
Contributor
jianchao-li
*/
class Solution {
    public void moveZeroes(int[] nums) {
       
        int count=0;
        int point=0;
        int temp;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                count++;
                
        }
        for(int j=0;j<count;j++){
            for(int i=0;i<nums.length-1-j;i++){
          if(nums[i]==0){
                    nums[i]=nums[i+1];
                    nums[i+1]=0;
                    
                }
        }
            
        }
        
        
    }
}
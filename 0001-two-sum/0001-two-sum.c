/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int i=0,j=0;
    //int p=returnSize;
    *returnSize=2;
        int *c=malloc((*returnSize) * sizeof(int));
    for(i=0;i<numsSize;i++)
     {for(j=i+1;j<numsSize;j++)
         {
        if(nums[i]+nums[j]==target)
        {
           c[0]=i;
           c[1]=j;
           
           break;
        }
    }    }
    
    return c;
}
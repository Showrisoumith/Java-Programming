int maxProduct(int* nums, int numsSize) {
    int max1=nums[0];
    int p;
    for(int i=0;i<numsSize;i++){
if(nums[i]>=max1){
max1=nums[i];
p=i;
}
    }
    int max=0;
    for(int i=0;i<numsSize;i++){
if(nums[i]>=max && nums[i]<=max1 && i!=p)
max=nums[i];
    }
     int z=((max1-1)*(max-1));
    return z;
}
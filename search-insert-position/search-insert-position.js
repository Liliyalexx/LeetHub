/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */

nums = [1,3,5,6]
target = 0
var searchInsert = function(nums, target) {
    for(var i=0; i<nums.length; i++){
        if(target<nums[i] || target ===nums[i]){
        return i;
        }
    }
    return nums.length;
    
};
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
    var actual;
    var i;
    res = [];
    for (let i = 0; i < nums.length; i++){
       actual = Math.abs(nums[i])-1;
        if (nums[actual]>0)
            nums [actual] *=-1;
        }
    for (i = 0; i<nums.length; i++){
        if(nums[i] >0)
            res.push(i+1);
    }
    return res
    
};
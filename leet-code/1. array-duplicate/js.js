/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicateJs = function (nums) {
  return nums.length > new Set(nums).size;
};

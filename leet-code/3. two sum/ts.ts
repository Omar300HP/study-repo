function twoSum(nums: number[], target: number): number[] {
  const valueIndexMap: Map<number, number> = new Map();
  let answer: number[] = [];
  for (let i = 0; i < nums.length; i++) {
    const current = target - nums[i];
    if (valueIndexMap.has(current)) {
      answer = [valueIndexMap.get(current)!, i];
      break;
    }

    valueIndexMap.set(nums[i], i);
  }
  return answer;
}

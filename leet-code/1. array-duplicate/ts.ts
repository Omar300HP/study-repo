function containsDuplicate(nums: number[]): boolean {
  const itemsCount = {};
  let isDuplicate = false;
  for (const i of nums) {
    if (itemsCount[i]) {
      isDuplicate = true;
      break;
    }
    itemsCount[i] = 1;
  }
  return isDuplicate;
}

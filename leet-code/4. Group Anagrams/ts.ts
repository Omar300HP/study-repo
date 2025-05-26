function groupAnagrams(strs: string[]): string[][] {
  const wordsMap = new Map<string, string[]>();

  for (let word of strs) {
    const lettersCount = new Array(26).fill(0);
    console.log(word);
    for (let letter of word) {
      console.log({
        "letter.charCodeAt(0) - 'a'.charCodeAt(0)":
          letter.charCodeAt(0) - "a".charCodeAt(0),
        letter,
        lettersCount,
      });

      const index = letter.charCodeAt(0) - "a".charCodeAt(0);
      lettersCount[index] = lettersCount[index] + 1;
    }

    wordsMap.set(lettersCount.toString(), [
      ...(wordsMap.get(lettersCount.toString()) || []),
      word,
    ]);
  }
  console.log([...wordsMap.values()]);
  return [...wordsMap.values()];
}

const minDeletions = (s) =>
  s
    .split("") // convert string to array
    .reduce( // reduce the array to a table of letter frequencies
      (table, char) => (table[char.charCodeAt() - "a".charCodeAt()]++, table),
      Array(26).fill(0)
    )
    .sort((a, b) => b - a) // sort the array of frequencies to find unique values easily
    .reduce((deletions, freq, index, table) => {
      // Start from index 1
      if (index === 0) return deletions;

      const prevFreq = table[index - 1];

      if (freq > 0 && freq >= prevFreq) {
        // We can only delete letters, no adding (i.e. frequency can either stay the same or decrease)
        // Therefore, to guarantee uniqueness of every element in the array,
        // it is sufficient to ensure that, for every tuple of elements [b, a], b - 1 >= a
        // So, we iterate through the array, and, for each tuple [b, a], a := min(a, b - 1)
        // For each iteration, the deletion count is increased by (a - min(a, b - 1))
        // In other words, we are turning a DECREASING sequence to a STRICTLY DECREASING sequence, which, trivially,
        // renders all the members of the sequence unique.
        const uniqueValueLowerThanPrev = Math.max(prevFreq - 1, 0);
        deletions += freq - uniqueValueLowerThanPrev;
        table[index] = uniqueValueLowerThanPrev;
      }

      return deletions;
    }, 0);
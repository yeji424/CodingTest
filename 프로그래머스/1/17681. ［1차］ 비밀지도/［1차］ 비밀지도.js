function solution(n, arr1, arr2) {
  const answer = [];

  arr1.forEach((num, i) => {
    const merged = num | arr2[i];
    const binary = merged.toString(2).padStart(n, '0');
    const line = binary.replace(/1/g, '#').replace(/0/g, ' ');
    answer.push(line);
  });

  return answer;
}

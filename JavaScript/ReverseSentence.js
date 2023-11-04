function reverseWords(str)
  {
    return str.split(' ').map(word => word.split('').reverse().join('')).join(' ');
  }
  
  const sentence = 'This is a sunny day';
  const reversedSentence = reverseWords(sentence);
  
  console.log(reversedSentence); 
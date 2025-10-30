# Instructions  

Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except ifs first char does not need to match exactly.  On a match, return the front of the string, or otherwise return the empty string.  So, with the sting "hippo" the word "hi" returns "hi" and "xip" returns "hip".  The word will be at least lenght 1.

  ## Test Cases
  1. startWord("hippo", "hi") -> "hi"
  2. startWord("hippo", "xip") -> "hip"
  3. startWord("hippo", "i") -> "h"


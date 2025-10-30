# Instructions  

Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yeilds "lloHe".  The substring may overlap itself, so "Hi" yields "".  Otherwise, return the original string unchanged.

  ## Test Cases
  1. without2("HelloHe") -> "lloHe"
  2. without2("HelloHi") -> "HelloHi"
  3. without2("Hi") -> ""


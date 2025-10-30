# Instructions  

	The web is built with HTML strings like "<i>Yay</i>" which draws Yay as
	italic text. In this example, the "i" tag makes <i> and </i> which 
	surround the word "Yay". Given tag and word strings, create the HTML 
	string with tags around the word, e.g. "<i>Yay</i>".

  ## Test Cases
  1. makeTags("i", "Yay") -> "<i\>Yay</i\>"
  2. makeTags("i", "Hello") -> "<i\>Hello</i\>"
  3. makeTags("cite", "Yay") -> "<cite\>Yay</cite\>"

import java.util.regex.*;

/**
 * CodingBat.com activity from String1
 */

public class StartWord
{
  public static String startWord(String str, String word)
  {
    Matcher matcher = Pattern.compile(".?" + word.substring(1)).matcher(str); 
    return matcher.find() ? matcher.group() : "";
  }
}  
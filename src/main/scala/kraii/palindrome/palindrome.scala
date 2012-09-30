package kraii

package object palindrome {
  def longestPalindrome(text: String): String = {
    if (text.isEmpty()) ""
    else if (text == text.trim.reverse) text
    else longestOf(longestPalindrome(text.tail), longestPalindrome(text.reverse.tail))
  }

  private def longestOf(s1: String, s2: String): String = {
    if (s1.length() >= s2.length) s1
    else s2
  }
}
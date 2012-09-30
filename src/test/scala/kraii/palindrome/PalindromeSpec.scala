package kraii.palindrome

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class PalindromeSpec extends FlatSpec with ShouldMatchers {
  "longestPalindrome" should "give empty string for empty string" in {
    longestPalindrome("") should equal("")
  }

  it should "give a or b for ab" in {
    longestPalindrome("ab") should (equal("a") or equal("b"))
  }

  it should "give racecar for racecar" in {
    longestPalindrome("racecar") should equal("racecar")
  }

  it should "give racecar for racecarcat" in {
    longestPalindrome("racecarcat") should equal("racecar")
  }

  it should "should not include whitespace" in {
    longestPalindrome(" racecar ") should equal("racecar")
  }
}
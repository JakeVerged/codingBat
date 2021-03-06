package my.codingbat.solutions.functional1;

/*
*
Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
copies3(["24", "a", ""]) → ["242424", "aaa", ""]
copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]

Refer:
https://codingbat.com/prob/p181634
*/

public class Copies {
    
    public List<String> copies3(List<String> strings) {
        return strings.stream().map(i->i+i+i).collect(Collectors.toList());
      }
}

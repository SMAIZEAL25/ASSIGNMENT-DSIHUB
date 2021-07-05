//Code to remove vowels.....
public var String removeVowels(String S) {
  StringBuilder sb = new StringBuilder();  
  for(char s: S.toCharArray()) {
    if(s != 'a' && s != 'e' && s != 'i' && s !='o' && s != 'u') {
      sb.append(s);  
    }
  }
  return sb.toString();
}

fun removeVowels(S: String): String {
  val vowels = setOf('a', 'e', 'i', 'o', 'u')
  return S.filter { it !in vowels }
}

fun removeVowels(S: String): String {
  val vowels = setOf('a', 'e', 'i', 'o', 'u')
  return S.filterNot { it in vowels }
}



///ANOTHER LINE OF CODE ON THE SAME ASSIGNMENT

var s = "DO YOU LOVE TO FUCK ADABE AM TALKING TO YOU"
println(s)
s = s.toLowerCase()

// counters initialization
var vowelCount = 0
var consonantCount = 0

// definition of character groups
val vowels = "aeiou"
val consonants = "bcdfghjklmnpqrstvwxyz"

// main loop
for (c in s) {
        if (vowels.contains(c)) {
                vowelCount++
        } else if (consonants.contains(c)) {
                consonantCount++
        }
}

println("Vowels: $vowelCount")
println("Consonants: $consonantCount")
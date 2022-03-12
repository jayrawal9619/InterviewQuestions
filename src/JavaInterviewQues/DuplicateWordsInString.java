package JavaInterviewQues;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {


	// Hey Java is Java best language is java
	// java : 3
	// is : 2
	
	public static void main(String[] args) {
		FindDuplicateWords("Hey Java is/Java/best/is/best/is/best/language/is/Java");
	}

	public static void FindDuplicateWords(String sentence) {
		
		// Split:
		String words[]= sentence.split("/");
		
//		System.out.println(sentence);
		
		// Logic of code using HashMap:
		
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		// to check each word in given array
		
		for(String word:words) {
			
//			System.out.println(word);
			
			//if word is present
			if(wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word)+1);
			} else {
				wordCount.put(word, 1);
			}
		}
			
		//extracting all the keys of map -- wordCount:
		Set<String> wordsInString = wordCount.keySet();
		
		//System.out.println(wordsInString);
		
		//loop through all the words in wordCount:
		for(String word:wordsInString) {
			if(wordCount.get(word)>1) {
				System.out.println(word + " : "+ wordCount.get(word));
				
			}
			
		}
	
	}
	
}

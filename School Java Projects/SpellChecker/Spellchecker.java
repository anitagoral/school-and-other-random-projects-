import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpellChecker1 { 
	public static void main(String[] args) {
		
		String wordList = "hello \n" + "Goodbye \n" + "Random \n";
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word = scanner.nextLine();
			
		Pattern pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(wordList);
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Word spelled correctly");
	    } else if (!matchFound) {
	    	 final Pattern myPattern = Pattern.compile(word,Pattern.CASE_INSENSITIVE);
	    	 Matcher m = myPattern.matcher(wordList);
	    	 int i = 0;
	    	 while (m.find()) {
	    	     wordList = m.replaceFirst(String.valueOf(++i));
	    	     m = myPattern.matcher(wordList);
	    	 }
	    	 System.out.println("Word spelled incorrectly");
	    	 System.out.println("Did you mean \n" + wordList);
	    	 }
	     }
	    }


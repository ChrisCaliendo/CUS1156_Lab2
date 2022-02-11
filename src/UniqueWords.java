/* Project: Lab2 Git
* Class: UniqueWords.java
* Author: Christian Caliendo
* Date: February 11, 2022
* This program uses a test case ArrayList to test a method that returns an integer count of how many unique 
* strings are contained in the ArrayList given as a parameter.
*/
import java.util.ArrayList;

public class UniqueWords {
	
	
	// ----------------------------------------------------------------------------------------------------------------
	
	 /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
	*/
	public static int countUnique(ArrayList<String> list){
		int count = 0;
		
		//list keeps track of unique entries
		ArrayList<String> uniqueList = new ArrayList<String>();
  
		for (int i = 0; i < list.size(); i++){
			
			//keeps track of if the word's uniqueness
			boolean isUnique = true; 
			
			//loop goes through unique word list for a duplicate entry, 
			for (int j = 0; j < uniqueList.size(); j++){
				
				//if a duplicate is found its marked as not unique and the loop stops
				if(list.get(i).equals(uniqueList.get(j))) {
					isUnique = false;
					break;
				}
				
			}
			
			//if entry is still considered unique, the count is increased and the entry is added to list
			if(isUnique==true) {
				count++;
				uniqueList.add(list.get(i));
			}
		}
		
		return count;
	}
	
	// ------------------------------------------------------------------------------------------------------------------

	public static void main(String[] args){
	ArrayList <String> words = new ArrayList<>();
  	words.add("apple");
  	words.add("orange");
  	words.add("blackboard");
  	words.add("apple");
  	words.add("orange");
  	words.add("sun");
  	words.add("moon");

  	int unique = countUnique(words);
  	System.out.println(words + " has " + unique + " unique words");
	}
	
	// ------------------------------------------------------------------------------------------------------------------

}

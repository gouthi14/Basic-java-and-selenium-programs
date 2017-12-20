package arrays;

import java.util.Arrays;
import java.util.List;

public class Distance_bt_Words {

	public static void main(String[] args) {
	    final String strWords = "goutham going to india in december";
	    final String word1 = "goutham";
	    final String word2 = "december";

	    
	    final String strOnlyWords = strWords.replace(",", "").replace(".", "");

	    final List<String> words = Arrays.asList(strOnlyWords.split(" "));
	    final int index1 = words.indexOf(word1);
	    final int index2 = words.indexOf(word2);
	    int distance = -1;

	  
	    if (index1 != -1 && index2 != - 1) {
	        distance = index2 - index1;
	    }

	    System.out.println(distance);
	}}

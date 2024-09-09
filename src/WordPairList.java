import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs; //declaring a variable (all pairs) - Type array list

    public WordPairList(String[] words) { //constructor
        allPairs = new ArrayList<>(); //initialising the variable
        for(int i = 0; i< words.length; i++){ // for every first word in the pair
            for (int j = i+1; j< words.length; j++){ // for every second word in the pair
                allPairs.add(new WordPair(words[i],words[j]));
            }
        }
    }

    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    public int numMatches() {
        int count = 0;
        for(int i = 0; i< allPairs.size(); i++){
            if(allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond())){
                count++;
            }
        }
        return count;
    }
}

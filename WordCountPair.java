public class WordCountPair {

	// Instance Variables
	private String word;
	private int count;

	public WordCountPair(String word, int count) {
		this.word = word;
		this.count = count;
	}

	public string getWord() { return word; }
	public int getCount() { return count; }
	public void incrCount() { count = count + 1; }
}

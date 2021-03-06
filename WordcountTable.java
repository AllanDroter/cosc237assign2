public class WordcountTable {
   
  	// Instance Variables
	private WordCountPair[] words_counts;
	private int current;
	
	// Constructor
	//---------------------------------------------------------------------------
   	// Creates a word count table of specified size.
   //---------------------------------------------------------------------------
	public WordcountTable(int size) {
		word_counts = new WordCountPair[size];
		current = 0;
	}

	// Operators
	
	public void add(String word)
  	//---------------------------------------------------------------------------
  	// If word not in table, then adds WordCountPair to table for word.
	// Otherwise, increments the word count for the word in table.
  	//---------------------------------------------------------------------------
   	{  }
	
	
	// Iterator Methods

	// These iterator methods hasNext, nextWord and reset are used by the client
	// code to iterate over all of the WordCountPair objects in the wordcount table
 	// one-by-one (much like the hasNext and next methods of the Scanner class).
	//
	// Instance variable current is reserved for use by these methods only 
	// (not to be used by any other methods).
	
	public boolean hasNext()
  	//---------------------------------------------------------------------------
  	// Resets true if there is another WordCountPair to iterate over in the table.
	// Otherwise, returns false.
  	//---------------------------------------------------------------------------
  	{ }
	
	public WordCountPair nextWordCountPair()
  	//---------------------------------------------------------------------------
  	// Returns the next WordCountPair object in the wordcount table.
  	//---------------------------------------------------------------------------
  	{ }
	
	public void reset()
  	//---------------------------------------------------------------------------
  	// Resets to first WordCountPair of the table for iterating over.
  	//---------------------------------------------------------------------------
  	{  
		current = 0;
	}

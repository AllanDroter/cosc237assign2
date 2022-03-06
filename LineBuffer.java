public class LineBuffer {
   
    // Instance Variables
	String line;
	int current_char;
	
	// Constructor
	//---------------------------------------------------------------------------
    // Initializes a newly created LineBuffer object to contain the line of
	// text passed, with the current character set to 0.
    //---------------------------------------------------------------------------
	public LineBuffer(String line) {
		this.line = line;
		current_char = 0;
	}

	// Operators
	
	public boolean endOfBuffer()
    //---------------------------------------------------------------------------
    // Returns true if current character of line buffer is at the end of the
	// buffer, otherwise, returns false.
    //---------------------------------------------------------------------------
    {  }
	
	public String scanWord()
    //---------------------------------------------------------------------------
    // Returns the next word scanner in the line buffer. 
    //---------------------------------------------------------------------------
    {  }
	
	
	// Private Supporting Methods
	
	private boolean isLetter() 
    //---------------------------------------------------------------------------
    // Returns true if current character of buffer is between 'a' ... 'z' or
	// 'A' ... 'Z', otherwise, returns false.
    //---------------------------------------------------------------------------
    {  }
	
}
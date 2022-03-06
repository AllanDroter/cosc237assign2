//===========================================================================
// WORD COUNT PROGRAM (Object-Oriented Design)
//===========================================================================
// This program will input any text file and output a table of word counts
// containing each word in the document and the number of times that each
// word appears. Maximum number of words is 500.
//---------------------------------------------------------------------------
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {

        // Variable Declarations
        // -- keyboard input
        Scanner keyboard_input = new Scanner(System.in);

        // -- file input   
        boolean file_found = false; 
        String file_name;
        Scanner file_input;    
        
        // -- create word count table
        WordcountTable word_count_table = new WordcountTable(500);

        // File Processing
        // -- open file
        while(!file_found) {
          try {
                // get file name
                System.out.println("Enter file name (including .txt): ");
                file_name = keyboard_input.nextLine();

                // -- open file for reading
                file_input = new Scanner(new File(file_name));
                file_found = true;
          }
          catch(FileNotFoundException e) {
                System.out.println("File " + file_name + " not found.");
                System.out.println("Please re-enter");
          }
        }
           
        // -- process file
        processFile(word_count_table, file_input);

        // -- display word counts
        displayTable(word_count_table);
    }


    // Supporting Methods

    public static LineBuffer readLine(Scanner in_file)
    //---------------------------------------------------------------------------
    // Reads next line of in_file and returns a newly constructed LineBuffer
	// object for the line read.
    //---------------------------------------------------------------------------
    {  }

    public static void displayTable(WordcountTable word_table)
    //---------------------------------------------------------------------------
    // Displays each word and the corresponding word count of the words in
	// word_table.
	//
	// NOTE: This method uses the iterator methods of the WordcountTable class.
    //---------------------------------------------------------------------------
    {  }

    public static void processFile(WordcountTable word_table, Scanner in_file)
    //---------------------------------------------------------------------------
    // Reads the lines of text in in_file, scans each line for the individual
	// words in the line, and updates word_table for each word found.
	//
	// NOTE: For each line read, a new LineBuffer object should be created and
	//       scanned.
    //---------------------------------------------------------------------------
    {  }

    public static boolean endOfFile(Scanner in_file)
    //---------------------------------------------------------------------------
    // Returns true if at end of file in_file, otherwise, returns false.
    //--------------------------------------------------------------------------
    {  }

}
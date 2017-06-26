import java.util.Collections;


public class PageThree {

    private static void fixedWidthLines(int max ){

        for (int i = 1; i <= max; i++) {
        
            String one = String.join( "", Collections.nCopies(max - i, ".") );

            String two = String.join( "", Collections.nCopies(i, "" + i) );

            System.out.println(one + two);

        }
        
	}
	
    public static void main(String[] args) {

	
    	// How would you rewrite this for the nth number instead of ending at 5?
    	// Remove 5 from the control structure and define it as a variable. 
    	// Now 5 can be adjusted to any number to create a variation of the
    	// same pattern. 
    	
    	
    	fixedWidthLines(5);
    	
    	//fixedWidthLines(9);


    }
}

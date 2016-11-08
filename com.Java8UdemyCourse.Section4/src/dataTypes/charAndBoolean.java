package dataTypes;

public class charAndBoolean {

	public static void main(String[] args) {
		/**
		 * The format '\u00A9' is UNICODE format and char data type
		 * supports it. When given that unicode characters in source code,
		 * it automatically reads it and prints out the actual char.
		 */
        char myChar = '\u00A9';
        System.out.println("Unicode output " + myChar);
        
        char myChar2 = '\u00AE';
        System.out.println("Unicode output " + myChar);
	}

}

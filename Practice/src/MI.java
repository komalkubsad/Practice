
public class MI {
	public static void main(String[] args) {
		char fi = 'K';
		char mi = 'P';
		char li = 'K';
		
		System.out.println( + fi + mi + li); // with data type 'char' 'K', 'P', 'K' are stored with their underlying ASCI values and the '+' operator is treated as a arithmetic add and hence the results in a number 230 
		System.out.println("Initials : " + fi + mi + li); // with the label "Initials : " before the '+' is now treated as a concatenate operator because of the string "Initials" and hence the result is KPK.
	}

}

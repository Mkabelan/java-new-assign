package assignmenttt;

public class FifthVowelsandConsonants {
	public static void main(String[] args) {
		
	boolean vowel = false;
	String name = "Mkabelan";
	
	for (int j = 0; j <name .length(); j++) {
		char ch = name.charAt(j);
		
		if (ch == 'a'|| ch == 'e' || ch =='i'|| ch == 'o'|| ch =='u') {
			
			vowel = true;
			
		} else {
			vowel  = false;

		}
	}
	if (vowel) {
		
	} else {

	}

}
}
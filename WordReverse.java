package info.com;

public class WordReverse {
 
	public static void main(String args[]) {
		String text = "Sample example to check";
		String reverseText = reverseString(text);
		System.out.println(reverseText);
	}

	public static String reverseString(String text) {
		String reverseText = "";
		String[] textArray = text.split(" ");
		for (int index = 0; index < textArray.length; index++) {
			for (int k = textArray[index].length()-1; k >= 0; k--) {
				reverseText = reverseText + textArray[index].charAt(k);
			}
			reverseText = reverseText + " ";
		}
		return reverseText;
	}
	
}

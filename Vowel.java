import java.util.*;

class Vowel{

	public static void main(String[] args) {
		
	
	char vowelCheck;

	Scanner sc = new Scanner(System.in);

	System.out.println(" Enter a character to check Vowel");
	vowelCheck=sc.next().charAt(0);

	if(vowelCheck == 'a' )
	{
		System.out.println("The character is Vowel");
	}else if (vowelCheck == 'e') {
		System.out.println("The character is Vowel");
	}else if (vowelCheck == 'i') {
		System.out.println("The character is Vowel");
	}else if (vowelCheck == 'o') {
		System.out.println("The character is Vowel");
	}else if (vowelCheck == 'u') {
		System.out.println("The character is Vowel");
	}else
	{
		System.out.println("The character is consonant");
	}

}}
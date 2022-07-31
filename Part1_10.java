/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : Implement Caesar Cipher.*/

public class Part1_10 {
	
	public static String Encrypt(String text, int shift)
	{
		String encryptedText="";
		int length = text.length();
		//This is because the alphabet only has 26 characters.
		if(shift > 26)
			shift = shift % 26;
		
		else if(shift < 0)
			shift = (shift % 26) + 26;
		
		for (int i = 0; i < length; i++)
		{	//shifting the characters based on there ASCI value if they are upper case of lower case.
			char ch = text.charAt(i);
			if (Character.isLetter(ch))
			{
				if(Character.isUpperCase(ch)) 
				{	//If the value end up being out of bound of the ASCI values for the alphabets than going back to the ASCI value for the first alphabet.
					char c = (char)(ch + shift);
					if(c > 'Z')
						encryptedText = encryptedText+(char)(ch - (26 - shift));
					
					else
						encryptedText = encryptedText+c;
				}
				
				else if (Character.isLowerCase(ch))
				{	//Same as before just for the lower case character's alphabet's ASCI value.
					char c = (char)(ch + shift);
					if(c > 'z')
						encryptedText += (char)(ch - (26 - shift));
					
					else
						encryptedText = encryptedText+ c;
				}
				
			}
			
			else 
				encryptedText = encryptedText+ch;
			
		}
		
		return encryptedText;
	}
	// The whole process is same just doing the reverse steps for the shift value to decrypt the message.
	public static String decrypt(String text, int shift)
	{
		String decryptedText="";
		int length = text.length();
		
		if(shift > 26)
			shift = shift % 26;
		
		else if(shift < 0)
			shift = (shift % 26) + 26;
		
		for (int i = 0; i < length; i++)
		{
			char ch = text.charAt(i);
			if (Character.isLetter(ch))
			{
				if(Character.isUpperCase(ch)) 
				{
					char c = (char)(ch - shift);
					if(c < 'A')
						decryptedText = decryptedText+(char)(ch + (26 - shift));
					
					else
						decryptedText = decryptedText+c;
				}
				
				else if (Character.isLowerCase(ch))
				{
					char c = (char)(ch - shift);
					if(c < 'a')
						decryptedText = decryptedText+(char)(ch + (26 - shift));
					
					else
						decryptedText = decryptedText+ c;
				}
				
			}
			
			else 
				decryptedText = decryptedText+ch;
			
		}
		
		return decryptedText;
	}
	public static void main(String[] args) {
		//taking the main massage that is to be encrypted.		
		String text = "This is a message.";
		//taking the value of the shift to be applied to each character.
		//and printing the encrypted text.
		System.out.println("The encrypted Text is :"+Encrypt(text,3));
		//taking the encrypted message to decrypte it.		
		String text1 = Encrypt(text,3);
		//taking the value of the shift to be applied to each character.
		//printing the decreapted message.
		System.out.println("The decreapted Message is :"+decrypt(text1, 3));
	}

}

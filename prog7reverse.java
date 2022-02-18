// Java Program to reverse the letters present in the given String.

public class prog7reverse
{
   public void reverseString(String str)
   {
	String[] words = str.split(" ");
	String reversedString = "";
	for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
           String reverseWord = "";
           for (int j = word.length()-1; j >= 0; j--) 
	       {

		     reverseWord = reverseWord + word.charAt(j);
	       }
	   reversedString = reversedString + reverseWord + " ";
	}
	System.out.println(str);
	System.out.println(reversedString);
   }
   public static void main(String[] args) 
   {
	prog7reverse obj = new prog7reverse();
	obj.reverseString("My name is Mounika");
	obj.reverseString("I am from Andhrapradesh");
   }
}

import java.util.*;

public class ISpyChallenge2
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		String str;
		int counter = 0;
		
		System.out.print("Enter a string: ");
		str = console.nextLine();
		
		char arr[] = str.toCharArray();
		
		int index = arr.length;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == arr[index - 1])
			{
				counter++;
			}
			index--;
		}
		
		if(counter == arr.length)
		{
			System.out.print("Is a palindrome");
		}
		else
		{
			System.out.print("Is not a palindrome");
		}
		
	}
}
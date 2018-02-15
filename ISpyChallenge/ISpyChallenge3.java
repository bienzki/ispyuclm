import java.util.*;

public class ISpyChallenge3
{
	public static void main(String[] args)
	{
		int counter = 0;
		
		for(int a = 0; a <= 2; a++)
		{
			for(int b = 0; b <= 4; b++)
			{
				for(int c = 0; c <= 10; c++)
				{
					for(int d = 0; d <= 20; d++)
					{
						for(int e = 0; e <= 40; e++)
						{
							for(int f = 0; f <= 100; e++)
							{
								for(int g = 0; g <= 200; g++)
								{
									if(((1 * g) + (2 * f) + (5 * e) + (10 * d) + (20 * c) + (50 * b) + (100 * a)) == 200)
									{
										counter++;
									}
								}
							}
						}
					}
				}
			}
		}
		
		System.out.print("There are " + counter + " different ways a 2 pounds can be made with the said coins.");
		
		
	}
}
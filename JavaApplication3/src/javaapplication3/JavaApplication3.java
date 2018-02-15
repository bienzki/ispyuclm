/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Admin
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int p1 = 1, p2 = 2, p5 = 5, p10 = 10, p20 = 20, p50 = 50, p100 = 100, p200 = 200;
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
									if(((p1 * g) + (p2 * f) + (p5 * e) + (p10 * d) + (p20 * c) + (p50 * b) + (p100 * a)) == 200)
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

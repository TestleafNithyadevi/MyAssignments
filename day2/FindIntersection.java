package week1.day2;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		
		int numberarray1 [] = {3,2,11,4,6,7};
		int numberarray2 [] = {1,2,8,4,9,7};
		int matchingvaluesarray [] = new int[6];
		
		Arrays.sort(numberarray1);
		Arrays.sort(numberarray2);
		
		int len1 = numberarray1.length;
		int len2 = numberarray2.length;
		
		for (int i=0;i<len1;i++) 
		{
			
			for (int j=0;j<len2;j++) 
			{
				
				if(numberarray1[i] == numberarray2[j])
					matchingvaluesarray [i] = numberarray1[i];	
			}
		
		}
		
	for (int i=0;i<matchingvaluesarray.length;i++)
	{
			System.out.println(matchingvaluesarray[i]);
	}
	
	}
		
}


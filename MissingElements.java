package week1day1assesment;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,7,6,8};
		//int length = arr.length;
		Arrays.sort(arr);
		for(int i = 1; i<arr.length; i++)
			if ((i+1) != arr [i] )
			{
				System.out.println("Missing Element =" + (i+1));
				break;		
			}
		
	}

}

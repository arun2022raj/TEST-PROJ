import java.util.Arrays;

public class ComEle
{
	public static void main(String[] args)
	{
		int[] arr={34,343,534,24,23,4,43,4};
		int[] arr2={343,24,9,1,3,8,2,4,5};
		for (int i:arr)
		{
				for (int j:arr2)
				{
					if (i==j)
					{
						
						System.out.println(i);
					}
				}
		}
	}

}

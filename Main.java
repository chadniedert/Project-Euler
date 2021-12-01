import java.util.ArrayList;

public class Main 
{
  public static void main(String[] args) 
	{
		
    ArrayList<String> allBinList = new ArrayList<String>();

		int rowsPlusCols = 4;
		int count = 0;

		for (int i = 0; i < 16; i++)
		{
			String numString = Integer.toBinaryString(i);
			if (numString.length() < 4)
			{
				int numZeros = 4 - numString.length();
				String zeroString = "";
				for (int j = 0; j < numZeros; j++)
				{
					zeroString += "0";
				}
				numString = zeroString + numString;
			}
			allBinList.add(numString);
		}

		for (String x : allBinList)
		{
			int count0 = 0;
			int count1 = 0;

			for (int i = 0; i < x.length(); i++)
			{
				if (x.substring(i,i+1).equals("0"))
				{
					count0++;
				}
				else
				{
					count1++;
				}
			}

			if (count0 == count1)
			{
				count++;
			}
		}
		
		/* prints each item in allBinList
		for (String x : allBinList)
		{
			System.out.println(x);
		}
		*/

		System.out.println("# of lattice paths >>> " + count);

	}
}
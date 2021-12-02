import java.util.ArrayList;

public class Main 
{
  public static void main(String[] args) 
	{
		ArrayList<String> first20List = new ArrayList<String>();
    //ArrayList<String> allBinList = new ArrayList<String>();

		int count = 0;

		// length 20 (not 40)
		for (int i = 0; i < 1048576; i++)
		{
			String numString = Integer.toBinaryString(i);
			if (numString.length() < 20)
			{
				int numZeros = 20 - numString.length();
				String zeroString = "";
				for (int j = 0; j < numZeros; j++)
				{
					zeroString += "0";
				}
				numString = zeroString + numString;
			}
			first20List.add(numString);
		}

		ArrayList<Integer> countsOf1List = new ArrayList<Integer>(21);

		// initializes countsOf1List with 21 (0-20) zeros
		for (int i = 0; i < 21; i++)
		{
			countsOf1List.add(0);
		}


		for (String a : first20List)
		{
			int count1 = 0;
			for (int i = 0; i < a.length(); i++)
			{
				if (a.substring(i, i + 1).equals("1"))
				{
					count1++;
				}	
			}
			int incrNum = countsOf1List.get(count1) + 1;
			countsOf1List.set(count1, incrNum);
			//System.out.println("Index: " + count1 + " increased and is now " + incrNum);
			System.out.println("Completed for a = " + a);
		}

		System.out.println(countsOf1List);
/*
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
		} */

		// System.out.println("# of lattice paths >>> " + count);

	}
}
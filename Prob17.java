import java.util.*;

public class Prob17
{
	public static void main(String[] args)
	{
		ArrayList<String> singleDigList = new ArrayList<String>(Arrays.asList("", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));
		ArrayList<String> tenTo19List = new ArrayList<String>(Arrays.asList("ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"));
		ArrayList<String> twentyThirtyEtcList = new ArrayList<String>(Arrays.asList("twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"));

		ArrayList<String> twentyTo99List = new ArrayList<String>();
		ArrayList<String> oneTo99List = new ArrayList<String>();
		ArrayList<String> finalList = new ArrayList<String>();

		// add 1-9 to oneTo99List
		for (String num : singleDigList)
		{
			oneTo99List.add(num);
		}

		// add 10-19 to oneTo99List
		for (String num : tenTo19List)
		{
			oneTo99List.add(num);
		}

		// make list of values for 20-99
		for (String frontNum : twentyThirtyEtcList)
		{
			for (String backNum : singleDigList)
			{
				String str = frontNum + backNum;
				twentyTo99List.add(str);
			}
		}

		// add 20-99 to oneTo99List
		for (String num : twentyTo99List)
		{
			oneTo99List.add(num);
		}

		// add 1-99 to finalList
		for (int i = 1; i < oneTo99List.size(); i++)
		{
			finalList.add(oneTo99List.get(i));
		}

		// add 100-999 to finalList
		for (int i = 1; i < singleDigList.size(); i++)
		{
			for (String secondHalf : oneTo99List)
			{
				String str = "";
				if (secondHalf.equals(""))
				{
					str = singleDigList.get(i) + "hundred";
				}
				else
				{
					str = singleDigList.get(i) + "hundredand" + secondHalf;
				}
				finalList.add(str);	
			}
		}

		// add 1000 to finalList
		finalList.add("onethousand");

		System.out.println("finalList: " + finalList);
		System.out.println("length of finalList: " + finalList.size());



	}
}
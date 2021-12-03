import java.util.*;

public class Prob17
{
	public static void main(String[] args)
	{
		ArrayList<String> singleDigList = new ArrayList<String>(Arrays.asList("", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));
		ArrayList<String> tenTo19List = new ArrayList<String>(Arrays.asList("ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"));
		ArrayList<String> twentyThirtyEtcList = new ArrayList<String>(Arrays.asList("twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"));

		ArrayList<String> twentyTo99List = new ArrayList<String>();
		ArrayList<String> bigList = new ArrayList<String>();

		// add 1-9 to bigList, except for first ""
		for (int i = 1; i < singleDigList.size(); i++)
		{
			bigList.add(singleDigList.get(i));
		}

		// add 10-19 to bigList
		for (String num : tenTo19List)
		{
			bigList.add(num);
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

		// add 20-99 to bigList
		for (String num : twentyTo99List)
		{
			bigList.add(num);
		}

		System.out.println("bigList: " + bigList);

	}
}
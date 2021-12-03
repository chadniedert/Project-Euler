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

		// add 100-999 to finalList
		for (String singleNum : singleDigList)
		{
			for (String secondHalf : oneTo99List)
			{
				String str = "";
				if (secondHalf.equals(""))
				{
					str = singleNum + "hundred";
				}
				else
				{
					str = singleNum + "hundredand" + secondHalf;
				}
				finalList.add(str);	
			}
		}

		// add 1000 to finalList
		finalList.add("onethousand");

		// remove "" from index 0
		finalList.remove(0);

		System.out.println("finalList: " + finalList);



	}
}
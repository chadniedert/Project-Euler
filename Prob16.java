import java.math.BigInteger;

public class Prob16
{
	public static void main(String[] args)
	{
		// find value of 2^1000
		BigInteger theNum = new BigInteger("1");
		for (int i = 1; i <= 1000; i++)
		{
			theNum = theNum.multiply(BigInteger.valueOf(2));
		}
		//System.out.println(theNum);

		// find the sum of the digits
		BigInteger sum = new BigInteger("0");
		String theNumStr = theNum.toString();
		for (int i = 0; i < theNumStr.length(); i++)
		{
			BigInteger addend = new BigInteger(theNumStr.substring(i, i+1));
			sum = sum.add(addend);
		}
		System.out.println("Sum: " + sum);
	}
}
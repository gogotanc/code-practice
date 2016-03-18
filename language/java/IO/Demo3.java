/*
import java.io.*;

public class Demo2{
	public static void main(String[] args) throws Exception{

	}
}
*/
import java.util.*;

public class Demo3{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int sum = 0;

		String str = in.nextLine();
		String[] highs = str.split(" ");

		for(String s : highs)
		{
			int i = Integer.parseInt(s);
			sum += f(i);
		}

		System.out.println(sum);

	}

	public static int f(int h)
	{
		return 2*h;
	}
}
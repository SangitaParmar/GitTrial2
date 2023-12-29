import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		
		char small[]= {'a','b','c','d','e'};
		System.out.println(Arrays.toString(small));
		for (char x : small)
		{
			System.out.println(x + "-" +(int)x);
		}
		
		char caps[]= {'A','B','C','D','E'};
		System.out.println(Arrays.toString(caps));
		for (char c : caps)
		{
			System.out.println(c+ "-" +(int)c);
		}

		char num[]= {'0','1','2','3','4'};
		System.out.println(Arrays.toString(num));
		for (char d : num)
		{
			System.out.println(d+ "-" +(int)d);
		}
		
		ArrayList<String> months= new ArrayList<String>();
		months.add("Jan");
		months.add("Feb");
		months.add("Mar");
		months.add("Apr");
		System.out.println(months);
		System.out.println("_________________");
		
		for(int i=0; i<months.size();i++) {
			//System.out.println("size of array = "+ months.size());
			System.out.println("Elements of array = " +i + "-" + months.get(i));
		}
		System.out.println("_________________");
		int p=0;
		for(String e : months)
		{
			System.out.println(p+ "-" +e);
			p++;
		}
		
		
	}
}


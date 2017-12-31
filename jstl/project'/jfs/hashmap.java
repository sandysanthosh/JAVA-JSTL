import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class hashmap {


	public static void main(String[] args) {
	
		
		String a="sany panyd";
		Pattern p=Pattern.compile("sany");
		Matcher m=p.matcher(a);
		if(m.find())
		{
		System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	  
	  
		
		
	}
}
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public  class demo {

	/**
	 * @param args
	 * @return 
	 */
	public static void main(String[] args) {
	
		List animal=new ArrayList();
		animal.add("lion");
		animal.add("tiger");
		animal.add("meat");
		animal.add("goad");
		
		Iterator animalitIterator=animal.iterator();
		
		while(animalitIterator.hasNext())	
		{
			System.out.println(animalitIterator.next());
		//	System.out.println(animalitIterator.);
			
		}
		System.out.println("\n");
		for(Iterator<String> animals=animal.iterator();animals.hasNext();)
		{
			String s=animals.next();
			if(s.equals("tiger"))
			{
				animals.remove();
			
			}
			else
			{
				System.out.println(s);
			}
		}
	}
	

}

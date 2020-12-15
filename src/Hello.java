
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Hello {

	
	public void testLambda() {
		//(a, b) -> {return System.out.println(a+b)};
	}
	
	public Integer romanToInt(String string)
	{
		
		Map<String, Integer> romanToIntMap=new HashMap();
		romanToIntMap.put("I", 1);
		romanToIntMap.put("II", 2);
		romanToIntMap.put("III", 3);
		romanToIntMap.put("IV", 4);
		romanToIntMap.put("V", 5);
		romanToIntMap.put("VI", 6);
		romanToIntMap.put("VII", 7);
		romanToIntMap.put("VIII", 8);
		romanToIntMap.put("IX", 9);
		romanToIntMap.put("X", 10);
		romanToIntMap.put("L", 50);
		romanToIntMap.put("C", 100);
		romanToIntMap.put("D", 500);
		romanToIntMap.put("M", 1000);
		Integer valueAtReturn=null;
		
		
		for(Entry<String, Integer> entry:romanToIntMap.entrySet())
		{
			for(int i=0;i<string.length();i++)
			{
				char value=string.charAt(i);
				if(entry.getKey().equals(Character.toString(value)))
				{
					valueAtReturn = generateInt(valueAtReturn, entry);
					
				}
			}
			
		}
		
		
		return valueAtReturn;
		
	}

	private Integer generateInt(Integer valueAtReturn, Entry<String, Integer> entry) {
		
		return (Integer) (valueAtReturn!=null ?valueAtReturn+=entry.getValue():entry.getValue());
	}
	
}

/**
 * 
 */
package Geektrust.Problems1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class Person {
		String Name;
		String Sex;
		int Level;
		HashMap<Person, String> map = new HashMap<>(); 
		
		//Constructor to set the details of an object/person
		Person(String name,String sex, int level)
		{
			Name = name;
			Sex = sex;
			Level = level;
		}
		
		//Method to get the level of the object.
		public int getPeronLevel()
		{
			return this.Level;
		}
		
		//Method to get the name of the object.
		public String getPersonName()
		{
			return this.Name;
		}
		
		//Method to get the sex of the object.
		public boolean getSex()
		{
			if(Sex.equals("Female"))
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		
		//Method to add relation. Added in the Wife/Mother object with a reference to the other object.
		public void SetRelationship(Person Related, String Relation)
		{
			map.put(Related,Relation);
		}
		
		//Method to get if two objects share a relation
		public String getRelationship(Person Related)
		{
			if(map.containsKey(Related))
			{
				return map.get(Related);
				
			}
			return null;
		}
		
		//Method to get the Husband value. This is stored in Wife object.
		public Person getSpouse()
		{
			for(HashMap.Entry<Person, String> entry : map.entrySet())
			{
				if(entry.getValue().equals("Spouse"))
				{
					return entry.getKey();
				}
			}
			return null;
		}
		
		//If All is set to 1: All siblings data is stored in Mother object.Passes input as sibling and returns rest of siblings
		//If All is set to 0: All siblings data is stored in Mother object.Checks the mother for sibling
		public ArrayList<Person> getSiblings(Person Sibling, int All)
		{
			ArrayList<Person> Key = new ArrayList<Person>();
			int j= 0;		
			Person i;
			Iterator<Person> itr = map.keySet().iterator();
			if(All == 1)
			{
		        while (itr.hasNext()) {
		        	i = itr.next();
		        	if(map.get(i).equals("Child") && i != Sibling)
		        	{
		        		Key.add(i);
		        		j++;
		        	}	
		        }
				return Key;
			}
			else
			{
		        while (itr.hasNext()) {
		        	i = itr.next();
		        	if(map.get(i).equals("Child") && i == Sibling)
		        	{
		        		Key.add(i);

		        	}	
		        }
				return Key;
			}

		
		}

		//Get all sibling data stored in Mother object.
		public ArrayList<Person> getAllSiblings( )
		{
			ArrayList<Person> Key = new ArrayList<Person>();
			int j= 0;		
			Person i;
	        Iterator<Person> itr = map.keySet().iterator();
	        while (itr.hasNext()) {
	        	i = itr.next();
	        	if(map.get(i).equals("Child"))
	        	{
	        		Key.add(i);
	        		j++;
	        	}	
	        }
	        return Key;
		}
		
		  @Override
		  public String toString() {
		    return this.Name;
		  }
}

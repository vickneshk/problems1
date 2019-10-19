package Geektrust.Problems1;

import java.util.ArrayList;


public class App 
{
	//Method to get unique number of person
	public static int getUniqueNumber(Person Family[],String name)
	{
		int size = GetSize(Family);
        for (int i = 0 ;i < size ;i++ )
        { 
        	if(Family[i].getPersonName().equals(name))
        	{
        		return i;
        	}
        	
        }
		return -1;
	}
	
	public static Person getPerson(ArrayList<Person> family,String person)
	{
		for(Person i : family)
		{
			if(i.getPersonName().equals(person))
			{
				return i;
			}
		}
		return null;
		
	}
	
	//Method to load initial data
	public static ArrayList<Person> LoadInitialData(ArrayList<Person> family)
	{
		//Inserting Family members
		//Inserting Family members
        family.add(new Person("King Shah","Male",1));
		family.add(new Person("Queen Anga", "Female", 1));
        family.add(new Person("Chit", "Male", 2));
        family.add(new Person("Amba", "Female", 2));
        family.add(new Person("Ish", "Male", 2));
        family.add(new Person("Vich", "Male", 2));
        family.add(new Person("Lika", "Female", 2));
        family.add(new Person("Aras", "Male", 2));
        family.add(new Person("Chitra", "Female", 2));
        family.add(new Person("Satya", "Female", 2));
        family.add(new Person("Vyan", "Male", 2));
        family.add(new Person("Dritha", "Female", 3));
        family.add(new Person("Jaya", "Male", 3));
        family.add(new Person("Tritha", "Female", 3));
        family.add(new Person("Vritha", "Male", 3));
        family.add(new Person("Vila", "Female", 3));
        family.add(new Person("Chika", "Female", 3));
        family.add(new Person("Arit", "Male", 3));
        family.add(new Person("Jnki", "Female", 3));
        family.add(new Person("Ahit", "Male", 3));
        family.add(new Person("Satvy", "Female", 3));
        family.add(new Person("Asva", "Male", 3));
        family.add(new Person("Krpi", "Female", 3));
        family.add(new Person("Vyas", "Male", 3));
        family.add(new Person("Atya", "Female", 3));
        family.add(new Person("Yodhan", "Male", 4));
        family.add(new Person("Laki", "Male", 4));
        family.add(new Person("Lavnya", "Female", 4));
        family.add(new Person("Vasa", "Male", 4));
        family.add(new Person("Kriya", "Male", 4));
        family.add(new Person("Krithi", "Female", 4));
        
		//Queen Anga
        getPerson(family, "Queen Anga").SetRelationship(getPerson(family, "King Shah"), "Spouse");
        getPerson(family, "Queen Anga").SetRelationship(getPerson(family, "Chit"),"Child");
        getPerson(family, "Queen Anga").SetRelationship(getPerson(family, "Ish"),"Child");
        getPerson(family, "Queen Anga").SetRelationship(getPerson(family, "Vich"),"Child");
        getPerson(family, "Queen Anga").SetRelationship(getPerson(family, "Aras"),"Child");
        getPerson(family, "Queen Anga").SetRelationship(getPerson(family, "Satya"),"Child");
        
		//Dritha
        getPerson(family, "Dritha").SetRelationship(getPerson(family, "Jaya"),"Spouse");
		getPerson(family, "Dritha").SetRelationship(getPerson(family, "Yodhan"),"Child");
		
        //Amba
        getPerson(family, "Amba").SetRelationship(getPerson(family, "Chit"),"Spouse");
        getPerson(family, "Amba").SetRelationship(getPerson(family, "Dritha"),"Child");
        getPerson(family, "Amba").SetRelationship(getPerson(family, "Tritha"),"Child");
        getPerson(family, "Amba").SetRelationship(getPerson(family, "Vritha"),"Child");
		
		//Lika
        getPerson(family, "Lika").SetRelationship(getPerson(family, "Vich"),"Spouse");
		getPerson(family, "Lika").SetRelationship(getPerson(family, "Vila"),"Child");
		getPerson(family, "Lika").SetRelationship(getPerson(family, "Chika"),"Child");
		
		//Chitra
        getPerson(family, "Chitra").SetRelationship(getPerson(family, "Aras"),"Spouse");
		getPerson(family, "Chitra").SetRelationship(getPerson(family, "Jnki"),"Child");
		getPerson(family, "Chitra").SetRelationship(getPerson(family, "Ahit"),"Child");
		
		//Jnki
        getPerson(family, "Jnki").SetRelationship(getPerson(family, "Arit"),"Spouse");
		getPerson(family, "Jnki").SetRelationship(getPerson(family, "Laki"),"Child");
		getPerson(family, "Jnki").SetRelationship(getPerson(family, "Lavnya"),"Child");
		
		
		//Satya
        getPerson(family, "Satya").SetRelationship(getPerson(family, "Vyan"),"Spouse");
		getPerson(family, "Satya").SetRelationship(getPerson(family, "Asva"),"Child");
		getPerson(family, "Satya").SetRelationship(getPerson(family, "Vyas"),"Child");
		getPerson(family, "Satya").SetRelationship(getPerson(family, "Atya"),"Child");
		
		//Satvy
        getPerson(family, "Satvy").SetRelationship(getPerson(family, "Asva"),"Spouse");
		getPerson(family, "Satvy").SetRelationship(getPerson(family, "Vasa"),"Child");
		
		//Krpi
        getPerson(family, "Krpi").SetRelationship(getPerson(family, "Vyas"),"Spouse");
		getPerson(family, "Krpi").SetRelationship(getPerson(family, "Kriya"),"Child");
		getPerson(family, "Krpi").SetRelationship(getPerson(family, "Krithi"),"Child");
		return family;
	}
	
	//Method to set Relationship 
	public static ArrayList<Person> SetRelationShip(ArrayList<Person> family,Person person, String Name, String Relation)
	{
		;
		family.get(family.indexOf(person)).SetRelationship(family.get(family.indexOf(FindPerson(family,Name))), Relation);
		return family;
	}
	
	//Part of method adding new child
	public static ArrayList<Person> SetPersonDetail(ArrayList<Person> family,String Name, String Sex, int Level)
	{
		//Inserting Family member
        family.add(new Person(Name,Sex,Level));
        return family;
	}
	
	//Method to handle the input ADD_CHILD
	public static ArrayList<Person> AddChild(ArrayList<Person> family,Person person, String Name , String Sex ,int Level)
	{
		family = SetPersonDetail(family,Name,Sex,Level);
		family = SetRelationShip(family,person,Name,"Child");
		return family;
	}
	
	//Method to find the person with name	
	public static Person FindPerson(ArrayList<Person> family,String Name)
	{
		for(Person i : family)
		{
			if (i.toString().equals(Name))
			{
				return i;
			}
		}
		return null;
	}

	
	//Method to get the length of persons
	public static int GetSize (Person Family[])
	{
		int i = 0;
		for (i = 0; i< Family.length; i++)
		{
			try
			{
				Family[i].getPersonName();
			}
			catch(NullPointerException e)
			{
				return i;
			}
			
		}
		return i;
	}
	
	//Method to return the Mother
	public static Person getMother(ArrayList<Person> family,Person Child)
	{
		Person Mother = null;
		for (Person itr : family)
		{
			if(!itr.getSiblings(Child,0).isEmpty())
			{
				Mother = itr;
			}
		}
		return Mother;
	}
	
	//Method to handle the GET_RELATION input

	public static String GetRelation(ArrayList<Person> family,Person person, String Relation)
	{
		String Relative = null;
		Person Mother;
		Person Mother1;
		Person Father;
		Person Wife;
		Person Husband;
		ArrayList<Person> Siblings;
		ArrayList<Person> SexSiblings;
		ArrayList<Person> Result = new ArrayList<Person>();
		//number = getUniqueNumber(family,person);
		
		if(Relation.equals("Paternal-Uncle"))
		{
			Father = getMother(family,person).getSpouse();
			Siblings = getMother(family,Father).getSiblings(Father, 1);
			SexSiblings = getSiblingsSex(family,Siblings,"Male");
			if(SexSiblings.isEmpty())
			{
				System.out.println("NONE");
			}
			else
			{
				printArray(SexSiblings);
			}
		}
		else if (Relation.equals("Maternal-Uncle"))
		{
			Mother1 = getMother(family,person);
			Mother = getMother(family,Mother1);
			Siblings = Mother.getSiblings(Mother1,1);
			SexSiblings = getSiblingsSex(family,Siblings,"Male");
			if(SexSiblings.isEmpty())
			{
				System.out.println("NONE");
			}
			else
			{
				printArray(SexSiblings);
			}
		}
		else if (Relation.equals("Paternal-Aunt"))
		{
			Father = getMother(family,person).getSpouse();
			Mother = getMother(family,Father);
			Siblings = Mother.getSiblings(Father,1);
			SexSiblings = getSiblingsSex(family,Siblings,"Female");
			if(SexSiblings.isEmpty())
			{
				System.out.println("NONE");
			}
			else
			{
				printArray(SexSiblings);
			}
		}
		else if (Relation.equals("Maternal-Aunt"))
		{
			Mother1 = getMother(family,person);
			Mother = getMother(family,Mother1);
			Siblings = Mother.getSiblings(Mother1,1);
			SexSiblings = getSiblingsSex(family,Siblings,"Female");
			if(SexSiblings.isEmpty())
			{
				System.out.println("NONE");
			}
			else
			{
				printArray(SexSiblings);
			}
		}
		else if (Relation.equals("Sister-In-Law"))
		{
			if(person.getSex())
			{	
				//Female person's spouse's sisters
				Husband = person.getSpouse();
				if(Husband != null)
				{
					Mother = getMother(family,Husband);
					if(Mother.getSiblings(Husband,1) != null)
					{
						Siblings = Mother.getSiblings(Husband,1);
						SexSiblings = getSiblingsSex(family,Siblings,"Female");
						Result = SexSiblings;
					}
				}
				//Female person's siblings's wives
					Mother = getMother(family,person);
						if(Mother != null)
						{
							Siblings = Mother.getSiblings(person,1);
							SexSiblings = getSiblingsSex(family,Siblings,"Male");
							for(Person i : SexSiblings)
							{
								Wife = getWife(family,i);
								if(Wife != null)
								{
									Result.add(Wife);
								}
							
							}
						}
			}
			else
			{
				//Male person's spouse's sisters
				//System.out.println("Entered");
				Wife = getWife(family,person);
				if(Wife != null)
				{
					Mother = getMother(family,Wife);
					if(Mother !=null)
					{
						Siblings = Mother.getSiblings(Wife,1);
						SexSiblings = getSiblingsSex(family,Siblings,"Female");
						Result = SexSiblings;
					}
				}
				//Male person's siblings's wives
				Mother = getMother(family,person);
				if(Mother != null)
				{
					Siblings = Mother.getSiblings(person,1);
					SexSiblings = getSiblingsSex(family,Siblings,"Male");
					for(Person i : Siblings)
					{
						Wife = getWife(family,i);
						if(Wife != null)
						{
							Result.add(Wife);
						}
					}
				}
			}
			if(Result.isEmpty())
			{
				System.out.println("NONE");
			}
			else
			{
				printArray(Result);
			}
		}
		else if (Relation.equals("Brother-In-Law"))
		{
			if(person.getSex())
			{	
				Husband = person.getSpouse();
				if(Husband != null)
				{
					Mother = getMother(family,Husband);
					if(Mother.getSiblings(Husband,1) != null)
					{
						Siblings = Mother.getSiblings(Husband,1);
						SexSiblings = getSiblingsSex(family,Siblings,"Male");
						Result = SexSiblings;
					}
				}
					Mother = getMother(family,person);
						if(Mother != null)
						{
							Siblings = Mother.getSiblings(person,1);
							SexSiblings = getSiblingsSex(family,Siblings,"Female");
							for(Person i : SexSiblings)
							{
								Husband = i.getSpouse();
								if(Husband != null)
								{
									Result.add(Husband);
								}
							
							}
						}
			}
			else
			{
				Wife = getWife(family,person);
				if(Wife != null)
				{
					Mother = getMother(family,Wife);
					if(Mother != null)
					{
						if(Mother.getSiblings(Wife,1) != null)
						{
							Siblings = Mother.getSiblings(Wife,1);
							SexSiblings = getSiblingsSex(family,Siblings,"Male");
							Result = SexSiblings;
						}
					}
				}
				
				Mother = getMother(family,person);
				if(Mother != null)
				{
					Siblings = Mother.getSiblings(person,1);
					SexSiblings = getSiblingsSex(family,Siblings,"Female");
					for(Person i : Siblings)
					{
						Husband = i.getSpouse();
						if(Husband != null)
						{
							Result.add(Husband);
						}
					}
				}
			}
			if(Result.isEmpty())
			{
				System.out.println("NONE");
			}
			else
			{
				printArray(Result);
			}
		}
		else if (Relation.equals("Siblings"))
		{
			Mother = getMother(family,person);
			Siblings = Mother.getSiblings(person,1);
			if(Siblings.isEmpty())
			{
				System.out.println("NONE");
			}
			else
			{
				printArray(Siblings);
			}
		}
		else if(Relation.equals("Daughter"))
		{
			if(person.getSex())
			{
				Siblings = person.getAllSiblings();
				SexSiblings = getSiblingsSex(family,Siblings,"Female");
				if(SexSiblings.isEmpty())
				{
					System.out.println("NONE");
				}
				else
				{
					printArray(SexSiblings);
				}
				
			}
			else
			{
				Wife = getWife(family,person);
				Siblings = Wife.getAllSiblings();
				SexSiblings = getSiblingsSex(family,Siblings,"Female");
				if(SexSiblings.isEmpty())
				{
					System.out.println("NONE");
				}
				else
				{
					printArray(SexSiblings);
				}
			}
		}
		else if(Relation.equals("Son"))
		{
			if(person.getSex())
			{
				Siblings = person.getAllSiblings();
				SexSiblings = getSiblingsSex(family,Siblings,"Male");
				if(SexSiblings.isEmpty())
				{
					System.out.println("NONE");
				}
				else
				{
					printArray(SexSiblings);
				}
			}
			else
			{
				Wife = getWife(family,person);
				Siblings = Wife.getAllSiblings();
				SexSiblings = getSiblingsSex(family,Siblings,"Male");
				if(SexSiblings.isEmpty())
				{
					System.out.println("NONE");
				}
				else
				{
					printArray(SexSiblings);
				}
			}
		}
		
		return Relative;
	}
	
	//Method to return the wife of a person
	private static Person getWife(ArrayList<Person> family,Person person) {
		// TODO Auto-generated method stub

		for(Person i : family)
		{
			if(i.getSex())
			{
				if(i.getRelationship(person)!=null)
				{
					if(i.getRelationship(person).equals("Spouse")) {
						return i;	
					}
				}
			}
		}
		return null;
	}

	//Method to return Siblings of input sex
	private static ArrayList<Person> getSiblingsSex(ArrayList<Person> family, ArrayList<Person> siblings, String string) {
		// TODO Auto-generated method stub
    	ArrayList<Person> SexSiblings = new ArrayList<Person>();
    	if(string.equals("Female"))
    	{
        	for(Person i : siblings)
        	{
        		if(i.getSex())
        		{
        			SexSiblings.add(i);
        		}
        	}
    	}
    	else
    	{
        	for(Person i : siblings)
        	{
        		if(!i.getSex())
        		{
        			SexSiblings.add(i);
        		}
        	}
    	}
		return SexSiblings;
	}

	//Method to print the output
	private static void printArray(ArrayList<Person> siblings) {
		// TODO Auto-generated method stub
		if(siblings != null)
		{
			for (Person i : siblings)
			{
				System.out.print(i.getPersonName()+" ");
			}
			System.out.println();
		}
		else
		{
			System.out.println("NONE");
		}
	}

	//Main method
	public static void main( String args[] )
    {
    	String Input;
    	String Output;
    	String Words[];
        ArrayList<Person> Family = new ArrayList<Person>();
        
        //Inserting Family members and Setting Relationship Status
        Family = LoadInitialData(Family);
        

        	    	if(args[0].equals("ADD_CHILD"))
        	    	{
        	    		if(Family.contains(FindPerson(Family, args[1])))
        	    		{
            	    		if(Family.contains(FindPerson(Family, args[1])))
            	    				//[getUniqueNumber(Family,Words[1])].getSex())
            	    		{
            	    			Family = AddChild(Family,FindPerson(Family,args[1]),args[2],args[3], FindPerson(Family,args[1]).getPeronLevel()+1);
            	    			System.out.println("CHILD_ADDITION_SUCCEEDED");
            	    		}
            	    		else
            	    		{
            	    			System.out.println("CHILD_ADDITION_FAILED");
            	    		}
        	    		}
        	    		else
        	    		{
        	    			System.out.println("CHILD_ADDITION_FAILED");
        	    		}
        	    	}
        	    	
        	    	else if(args[0].equals("GET_RELATIONSHIP"))
        	    	{
        	    		//getUniqueNumber(Family,Words[1]) != -1)
        	    		if(FindPerson(Family, args[1]) != null)
        	    		{
        	    			Output = GetRelation(Family,FindPerson(Family, args[1]),args[2]);
        	    		}
        	    		else
        	    		{
        	    			System.out.println("PERSON_NOT_FOUND");
        	    		}
        	    	}
    }
}


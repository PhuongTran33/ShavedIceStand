/*
 * Name:	Phuong Tran,  Emmanuel Pikounis,  Johan Milele,  Tongwa Aka
 * Overview: set location and zipcode 
 * Input: N/A
 * Output: N/A
 * Variables: name, location
 */

public class IceStand {
	//Properties/Attributes

	private String name;
	private String location;

	//Setters or Mutators: setName, setLocation	
	public void setName (String nameAux)
	{
		name = nameAux;
		name = name.toUpperCase();
		name = name.concat(" SHAVED ICE");
	}

	public void setLocation (String zipCode)
	{
		if (zipCode.equals("21228"))
		{
			location = "Catonsville";
		}
		else if (zipCode.equals("21222"))
		{
			location = "Dundalk";
		}
		else if (zipCode.equals("21237"))
		{
			location = "Essex";
		}
		else 
		{
			location = "Baltimore";
		}
	}

	//Constructor
	public IceStand (String standName, String zipCode)
	{
		setName(standName);
		setLocation(zipCode);
	}
	//toString Method
	public String toString()
	{
		return "\n\t  " + name + "\n\t//////// ~ ~ ~ \\\\\\\\\\\\\\\\ \n" + "\t         " + location;
	}
}

package Module08._11ArrayLists;


/**
 * @author Christopher Pybus
 * @date Dec 11, 2011
 * @file CO2FromElectricity.java
 * @package Module8._10ArrayLists
 * 
 * @purpose 
 */

public class CO2FromWaste
{
	
	int people;
	boolean paper;
	boolean plastic;
	boolean glass;
	boolean  cans;
	int totalEmissions;
	double totalReductions;
	double netEmissions;
	/**
     * Default constructor to create an object from the CO2FromElectricity class.  
     */
	CO2FromWaste(int numPeople, boolean paper2, boolean plastic2, boolean glass2, boolean cans2) 
	{
		people = numPeople;
		paper = paper2;
		plastic = plastic2;
		glass = glass2;
		cans = cans2;
	}
	
	/**
     * A methods that calculates the total Emissions, given the amount of people.
     */
	public void calcTotalEmission()
	{
		int totalEmission = people * 1018;
		totalEmissions = totalEmission;
	}
	
	/**
     * A method that calculates the total reduction in emissions, given the number of people in family and what they recycle.=
     */
	public void calcTotalReduction() 
	{
		double totalReduction = 0;
		if(paper == true)
		{
			totalReduction = totalReduction + (people*184);
		}
		if(plastic == true)
		{
			totalReduction = totalReduction + (people*25.6);
		}
		if(glass == true)
		{
			totalReduction = totalReduction + (people*46.6);
		}
		if(cans == true)
		{
			totalReduction = totalReduction + (people*165.8);
		}
		totalReductions = totalReduction;
		
	}
	
	/**
     * A method that calculates the net emissions, given the total emissions and the total reductions. 
     */
    public void calcNetEmission()
	{
    	double netEmission = totalEmissions - totalReductions;
    	netEmissions = netEmission;
	}
    
    /**
     * A method that returns the total emissions
     * @return totalEmissions 
     */
    public int getTotalEmissions()
    {
    	return totalEmissions;
    }
    
    /**
     * A method that returns the total reductions
     * @return totalReductions 
     */
    public double getTotalReductions()
    {
    	return totalReductions;
    }
	
    /**
     * A method that returns the net emissions
     * @return netEmissions 
     */
    public double getNetEmissions()
    {
    	return netEmissions;
    }


}


package Module08._11ArrayLists;

import java.util.ArrayList;

/**
 * @author Christopher Pybus
 * @date Dec 11, 2011
 * @file C02FromElectricityMain.java
 * @package Module8._10ArrayLists
 * 
 * @purpose 
 */

public class C02FromWasteMain
{
	
	public static void main(String[] args)
	{
		ArrayList<CO2FromWaste> families = new ArrayList<CO2FromWaste>();
		families.add(new CO2FromWaste(1, true, true, true, true));
		families.add(new CO2FromWaste(3, true, false, true, true));
		families.add(new CO2FromWaste(4, false, false, false, false));
		families.add(new CO2FromWaste(1, true, true, true, true));
		families.add(new CO2FromWaste(1, true, true, true, false));
		families.add(new CO2FromWaste(3, false, true, false, true));
		
		CO2FromWaste dataRecord;
		
		for(int index = 0; index < families.size(); index++)
        {
            dataRecord = families.get(index);
            dataRecord.calcTotalEmission();
            dataRecord.calcTotalReduction();
            dataRecord.calcNetEmission();
        }
                
        //print table headings
        System.out.println("|       |        |          Household Waste Recycled         |             Pounds of CO2             |");
        System.out.println("|       |        |          |          |          |          |   Total    |    Total    |    Net     |");
        System.out.println("| Index | People |  Paper   | Plastic  |  Glass   |   Cans   |  Emission  |  Reduction  |  Emission  |");
        System.out.println("|=======|========|==========|==========|==========|==========|============|=============|============|");
        
        //call methods
        for(int index = 0; index < families.size(); index++)
        {
            dataRecord = families.get(index);
            
            System.out.printf("|   %-4d|    %-4d|   %-7b|   %-7b|   %-7b|   %-7b|    %-8d|    %-9.1f|   %-9.1f| \n", 
                      index, dataRecord.people, dataRecord.people, dataRecord.plastic, dataRecord.glass, dataRecord.cans, dataRecord.getTotalEmissions(), dataRecord.getTotalReductions(), dataRecord.getNetEmissions());

        }
        System.out.println("|=======|========|==========|==========|==========|==========|============|=============|============|");
	}
	
}

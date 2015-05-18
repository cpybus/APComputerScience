package Module08._12ChallangeProgram;


/**
 * @author Christopher Pybus
 * @date Dec 23, 2011
 * 
 * @purpose Purpose is to calculate total carbon dioxide footprint in a year given a multitude of variables. 
 */

public class CO2FootPrintTester
{
	
	public static void main(String[] args)
	{
		boolean[] fam1 = {true, true, false, false};
		boolean[] fam2 = {true, true, true, false};
		boolean[] fam3 = {false, true, false, false};
		boolean[] fam4 = {false, false, false, false};
		boolean[] fam5 = {false, true, true, false};
		CO2Footprint[] co2 = {
				new CO2Footprint(16354, 89.57, .1457, 4, fam1, 10),
				new CO2Footprint(17564, 95.37, .1457, 4, fam2, 15),
				new CO2Footprint(16493, 80.47, .1457, 4, fam3, 2),
				new CO2Footprint(15478, 48.37, .1457, 4, fam4, 21),
				new CO2Footprint(16483, 103.1, .1457, 4, fam5, 18)
				};
		System.out.println("                         Carbon Dioxide Footprint Calculator                         ");
		System.out.println("|       Pounds of CO2 Emmitted From       |  Lbs of CO2 Reduced From  |   Overall   |");
		System.out.println("|                                         |                           |     CO2     |");
		System.out.println("|     Gas     | Electricity |    Waste    |  Recycling  |  New Bulbs  |  Footprint  |");
		System.out.println("|=============|=============|=============|=============|=============|=============| ");
		
		for(int index = 0; index<co2.length; index++)
		{
			double CO2FromGas = co2[index].calcPoundsCO2FromGas();
			double CO2FromElectricity = co2[index].calcPoundsCO2FromElectricity();
			double CO2FromPeople = co2[index].calcPoundsCO2FromPeople();
			double CO2ReductionFromRecycling = co2[index].calcCO2ReductionFromRecycling();
			double CO2ReductionFromLight = co2[index].calcCO2ReductionFromBulbs();
			double netFootprint = co2[index].netFootprint();
			System.out.printf("|%12.2f |%12.2f |%12.2f |%12.2f |%12.2f |%12.2f | \n", CO2FromGas, CO2FromElectricity, CO2FromPeople, CO2ReductionFromRecycling, CO2ReductionFromLight, netFootprint);
		}
		
		

	
	}
	
}

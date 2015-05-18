package Module08._12ChallangeProgram;


/**
 * @author Christopher Pybus
 * @date Dec 23, 2011
 * 
 * @purpose Purpose is to calculate total carbon dioxide footprint in a year given a multitude of variables. 
 */


class CO2Footprint
{
	int annualGallons;
	Double avgElectricBill;
	Double avgElectricPrice;
	int numberPeople;
	boolean[] whatRecycled;
	int numLightBlubsReplaced;
	
	double CO2FromGas;
	double CO2FromElectricity;
	double CO2FromPeople;
	double CO2ReductionFromRecycling;
	double CO2ReductionFromLight;
	
	CO2Footprint(int annualGallons, Double avgElectricBill, Double avgElectricPrice, int numberPeople, boolean[] whatRecycled, int numLightBlubsReplaced )
	{
		this.annualGallons = annualGallons;
		this.avgElectricBill = avgElectricBill;
		this.avgElectricPrice = avgElectricPrice;
		this.numberPeople = numberPeople;
		this.whatRecycled = whatRecycled;
		this.numLightBlubsReplaced = numLightBlubsReplaced;
	}
	
	public double calcPoundsCO2FromGas()
	{
		double tons = (.00878 * annualGallons);
		double poundsCO2FromGas = 2204.62262 * tons;
		CO2FromGas = poundsCO2FromGas;
	    return poundsCO2FromGas;
	}
	
	public double calcPoundsCO2FromElectricity()
	{
		double emissions = (avgElectricBill/avgElectricPrice) * 1.37 * 12;
		CO2FromElectricity = emissions;
		return emissions;
	}
	
	public int calcPoundsCO2FromPeople()
	{
		int totalEmission = numberPeople * 1018;
		CO2FromPeople = totalEmission;
		return totalEmission;
	}
	
	public double calcCO2ReductionFromRecycling()
	{
		double totalReduction = 0;
		if(whatRecycled[0] == true)
		{
			totalReduction = totalReduction + (numberPeople*184);
		}
		if(whatRecycled[1] == true)
		{
			totalReduction = totalReduction + (numberPeople*25.6);
		}
		if(whatRecycled[2] == true)
		{
			totalReduction = totalReduction + (numberPeople*46.6);
		}
		if(whatRecycled[3] == true)
		{
			totalReduction = totalReduction + (numberPeople*165.8);
		}
		CO2ReductionFromRecycling = totalReduction;
		return totalReduction;
	}
	
	public double calcCO2ReductionFromBulbs()
	{
		double totalReduction = numLightBlubsReplaced * 1.37 * 73;
		CO2ReductionFromLight = totalReduction;
		return totalReduction;
	}
	
	public double netFootprint()
	{
		double netFootprint = CO2FromGas + CO2FromElectricity + 
				CO2FromPeople - CO2ReductionFromRecycling - 
				CO2ReductionFromLight;
		return netFootprint;
	}
}

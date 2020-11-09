import java.text.DecimalFormat;
public class RoachPopulation {

private double population;
	
public RoachPopulation(double initialPop) {
	
	DecimalFormat dformat = new DecimalFormat("0");
	population = initialPop;
	System.out.println("Initial Roach Population: " + dformat.format(population) + ".");

}	
public double breed() {
	
	population = population * 2;
	return population;
	
}

public double spray(double sprayPct) {
	
	population = population - (population * sprayPct);
	return population;
			
}

public double getRoaches() {
	
	return population;
	
}

}

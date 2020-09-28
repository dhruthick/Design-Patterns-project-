import java.util.*;

public class DistanceDetails {
	String general[]= {"meters","miles","inches","kilometers"
			,"feet","yards","nautical miles","furlongs"},astronomical[]= {
					"gigameters","light years","astronomical units","parsecs",
					"lunar distance","light hours"
			},atomic[]= {"micrometers","picometers","microinches",
					"angstrom","atomic units","electron radius"};
	double generalval[]= {1,1609.344,0.0254,1000,0.3048,0.9144,1852,201.168},
			astronomicalval[]= {1,9460730.47258,149.597870691,
			30856775.8128,0.384000098304,1079.2528488},
			atomicval[]= {354869043.8833,354.8690438833,9013673.714636,
					35486.90438833,18778.86243974,1};
	HashMap<String,Double> generalconversion,astroconversion,atomicconversion;
	DistanceDetails(){
		generalconversion=new HashMap<String,Double>();
		astroconversion=new HashMap<String,Double>();
		atomicconversion=new HashMap<String,Double>();
		for(int i=0;i<8;i++)
			generalconversion.put(general[i], generalval[i]);
		for(int i=0;i<6;i++) {
			astroconversion.put(astronomical[i], astronomicalval[i]);
			atomicconversion.put(atomic[i], atomicval[i]);
		}
	}
}

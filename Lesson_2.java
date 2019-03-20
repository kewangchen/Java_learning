

public class Lesson_2{
	/*
	 * Java Learning
	 */
	
	public static void main(String[] args) {

		// string
		String str="Kewang Chen";
		char arrary[] =new char[20];
		str.getChars(0,5,arrary,0);
		System.out.println(arrary[0]);

		// 2d arrary
		int kwArrary[][]= new int[6][2];
		kwArrary[0][0]=1;
		kwArrary[1][0]=2;
		kwArrary[2][0]=3;
		kwArrary[3][0]=4;
		kwArrary[4][0]=5;
		kwArrary[5][0]=6;
		kwArrary[0][1]=10;
		kwArrary[1][1]=20;
		kwArrary[2][1]=30;
		kwArrary[3][1]=40;
		kwArrary[4][1]=50;
		kwArrary[5][1]=60;
		//System.out.println(kwArrary[1][1]);
		for (int i=0; i<6; i++){
			System.out.println(kwArrary[i][0]+" "+kwArrary[i][1]);
		}

		Aircraft.wings=2;
		Aircraft boyin321= new Aircraft(4,140,54.6,9.5);
		Aircraft boyin450= new Aircraft(6,203,125.3,24.6);

		System.out.println("boyin321: "+boyin321.cruiseSpeed);
		boyin321.setPassenages(3);
		System.out.println("boyin321 new set passenges: "+boyin321.fuelCapacity);
		boyin450.setPassenages(15);
	    System.out.println("boyin321 new set passenges: "+boyin321.wings);
	    System.out.println("\nEndurance "+boyin450.calculateEndurance());
	    System.out.println("\nEndurance "+boyin450.fuelNeeded(2.5));


	}
}

class Aircraft {

	private int passengers; // number of people
	int cruiseSpeed;
	double fuelCapacity;
	double fuelBurnRate; //
	static int wings; 

	// Constructor! the same name of the class
	Aircraft(int p, int c, double fc, double fbr){
		this.passengers=p;
		this.cruiseSpeed=c;
		this.fuelCapacity=fc;
		this.fuelBurnRate=fbr;
	}
	public double calculateEndurance(){
		double endurance;
		endurance=this.fuelCapacity/this.fuelBurnRate;
		return endurance;
	}

	public double fuelNeeded(double time){

		return this.fuelBurnRate * time;
	}
	public void setPassenages(int p){
		if ((p>0) && (p<=10)){
			this.passengers=p;
		}else{
			System.out.println("Error in setting passages");
		}
	}

}
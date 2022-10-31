import java.io.*;
public class Course {

	public static void main(String ...args) throws IOException {

		Avion plane =new Avion("Rocket");
		Voiture car= new Voiture("Bolt");
		Bateau boat=new Bateau("Ship");
		
		
		Circuit road=new Circuit();
		
		plane.getCircuit(road);
		car.getCircuit(road);
		boat.getCircuit(road);
		
		Equipe squad=new Equipe("Equipe 1",plane);
		Equipe squad2=new Equipe("Equipe 2",car);
		Equipe squad3=new Equipe("Equipe 3",boat);
		
		/*plane.demarrer();
		car.demarrer();
		boat.demarrer();
		
		plane.start();
		car.start();
		boat.start();*/
		//Equipe squad=new Equipe("Musa",plane);
		//Equipe squad2=new Equipe("Sura",plane);
		
		
	
		
	}

}

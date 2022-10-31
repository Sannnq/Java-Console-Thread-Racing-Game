import java.util.List;

public class Avion extends Vehicule{
	
	Circuit road =new Circuit();
	int distance;
	String type="l'avion";
	//Equipe squad;
	
	Avion(String nom) {
		super(nom);
	}

	//Initialiser la distance parcouru à 0
	@Override
	public void demarrer(){
		this.distance=0;
		System.out.println("L'avion "+this.nom+" décolle!");
		
	}

	//initialiser puis parcourir une distance aléatoire
	@Override
	public void avancer(){
		int random=(int) Math.floor(Math.random() * 11);
		this.distance+=random;
		System.out.println("L'avion "+this.nom+" vole: "+this.distance+" km");
	}

	@Override
	public void arreter() {
		System.out.println("L'avion "+this.nom+" attérit");
		
	}

	
	public void getCircuit(Circuit road) {
		this.road=road;
	}
	
	@Override
	public void run() {
		super.run();
		int limite=(int)road.distance;
		System.out.println("Circuit de "+limite+" km!");
		while(this.distance<limite) {
			
			try {
				this.avancer();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		this.arreter();
	}

}

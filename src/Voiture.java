public class Voiture extends Vehicule {
	int distance; 
	public String type;
	private Circuit road=new Circuit();
	
	Voiture(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
		this.type="la voiture";
	}

	@Override
	public void demarrer() {
		this.distance=0;
		// TODO Auto-generated method stub
		System.out.println("La voiture "+this.nom+" démarre!");
	}

	@Override
	public void avancer() {
		// TODO Auto-generated method stub
		int random=(int) Math.floor(Math.random() * 11);
		this.distance+=random;
		System.out.println("La voiture "+this.nom+" roule "+this.distance+" km");
	}

	@Override
	public void arreter() {
		// TODO Auto-generated method stub
		System.out.println("La voiture "+this.nom+" se garre!");
	}
	
	public void getCircuit(Circuit road) {
		this.road=road;
	}
	
	@Override
	public void run() {
		super.run();
		// TODO Auto-generated method stub
		int limite=(int)road.distance;
		while(this.distance<limite) {
			
			try {
				this.avancer();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		this.arreter();
	}
	
	

}

import java.util.*;
public class Equipe{

	String name;
	Coureur personne=new Coureur();
	Circuit race = new Circuit();
	List<String> equipe = new ArrayList<String>();
	Vehicule vehicule;

	
//Nommer l'équipe à l'instanciation puis initialiser une équipe
	public Equipe(String name, Vehicule vehicule) {
		this.name=name;
		this.initEquipe();
		this.getEquipe();
		this.getIn(vehicule);
		this.vehicule=vehicule;
	}
	
//Initialise l'équipe entre 1 & 2 coureurs
public List<String> initEquipe(){
	int random =(int)(Math.random()*2)+1;
		
		for(int i=0;i<random;++i) {
			equipe.add(personne.getCoureur());
		}
		return equipe;
	}

//Affiche ne nom de l'equipe et le/les coureurs
public void getEquipe() {
	if(this.equipe.size()==1) {
		System.out.println("Equipe "+ this.name+" : "+this.equipe.get(0));
	}else {
		System.out.println("Equipe "+ this.name+" : "+this.equipe.get(0)+" & "+this.equipe.get(1));
	}
}

//Les coureurs montent dans leurs vehicules respectifs
public void getIn(Vehicule vehicule) {
	if(this.equipe.size()==1) {
		System.out.println(this.equipe.get(0)+ " monte dans "+vehicule.nom);
	}else {
		System.out.println(this.equipe.get(0)+" & "+this.equipe.get(1)+ " montent dans "+vehicule.nom);
	}
}

//Les coureurs sortent de leurs vehicules après arrêt de ce ernier
public void getOut(Vehicule vehicule) {
	if(this.equipe.size()==1) {
		System.out.println(this.equipe.get(0)+ " descend du vehicule "+vehicule.nom);
	}else {
		System.out.println(this.equipe.get(0)+" & "+this.equipe.get(1)+ " descendent du vehicule "+vehicule.nom);
	}
}
}

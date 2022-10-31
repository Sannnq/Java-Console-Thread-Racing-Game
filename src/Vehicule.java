import java.util.List;

public abstract class Vehicule extends Thread{
String nom;
String type;
 Vehicule(String nom) {
	this.nom=nom;
}
 /*Vehicule() {
		
	}*/
 
 @Override
 public void run() {
	 
 };
 
 public abstract void demarrer();
 public abstract void avancer();
 public abstract void arreter();
 
}

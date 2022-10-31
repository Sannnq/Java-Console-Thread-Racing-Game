import java.util.*;

public class Coureur {

	List<String> name=new ArrayList<String>();
	
	public Coureur(){
		 this.name.add("Scott");
		 this.name.add("David");
		 this.name.add("Ann");
		 this.name.add("Jade");
		 this.name.add("Alice");
		 this.name.add("Drew");
		 this.name.add("Chris");
	}
	
	public String getCoureur() {
		int random=(int)(Math.random() * this.name.size());
		return this.name.get(random);
	}
}

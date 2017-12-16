package bonnetZone;

import java.util.ArrayList;
import main.AbeilleApplication;

public class BonnetApplication implements AbeilleApplication {
	
	@Override
	public ArrayList<Abeille> getAbeilles() {return toutesLesAbeilles;}
	@Override
	public Ruche getRuche() {return ruche;}
	
	
	// ===== travailler ici ===== //
	
	@Override
	public void takeInput() {
		addAbeille();
	}
	
	private Ruche ruche;
	
	private ArrayList<Abeille> toutesLesAbeilles;
	private int id = 0;

	public BonnetApplication() {
		ruche = new Ruche();
		toutesLesAbeilles = new ArrayList<>();
		addAbeille();
	}
	
	private void addAbeille() {
		toutesLesAbeilles.add(new Abeille(++id, ruche));
	}
	
	public void run() {
		ruche.update();
		toutesLesAbeilles.forEach((a) -> a.update());
	}
}
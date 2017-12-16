package bonnetZone;

import java.util.ArrayList;
import main.ContientDesAbeilles;

public class BonnetApplication implements ContientDesAbeilles {
	
	private Ruche ruche;
	private ArrayList<Abeille> toutesLesAbeilles;
	@Override public ArrayList<Abeille> getAbeilles() {return toutesLesAbeilles;}
	@Override public Ruche getRuche() {return ruche;}
	
	// ============================================================== //
	// ===== 					corrigé							===== //
	// ============================================================== //
	
	@Override public void receiveInput() {
		addAbeille();
	}
	
	private int id = 0;

	public BonnetApplication() {
		ruche = new Ruche();
		toutesLesAbeilles = new ArrayList<>();
		addAbeille();
	}
	
	private void addAbeille() {
		toutesLesAbeilles.add(new Abeille(++id, ruche));
	}
	
	@Override public void run() {
		ruche.update();
		toutesLesAbeilles.forEach((a) -> a.update());
	}
}
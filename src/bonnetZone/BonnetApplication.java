package bonnetZone;

import java.util.ArrayList;
import main.ContientDesAbeilles;;

public class BonnetApplication implements ContientDesAbeilles {
	
	private ArrayList<Abeille> toutesLesAbeilles;
	private Ruche ruche;
	
	@Override public ArrayList<Abeille> getAbeilles()	{return toutesLesAbeilles;}
	@Override public Ruche getRuche()					{return ruche;}
	@Override public void receiveInput() {}
	
	// ============================================================== //
	// ===== Il n'y a rien à faire au dessus de cette ligne. 	===== //
	// ===== Tu es libre de mettre autant de code que tu veux ! ===== //
	// ============================================================== //
	
	public BonnetApplication() {
		// voici ton constructeur vide
		// pense bien à initialiser la liste d'abeilles !
	}
	
	@Override public void run() {
		// cette fonction sera appelée une fois par seconde.
		// tu fais ce que tu veux avec :D
	}
}
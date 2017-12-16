package bonnetZone;

import main.IDisplayable;

public class Abeille implements IDisplayable {

	private String colour = "0xCC0000";
	@Override public String getColour() {return colour;}
	@Override public int getId() {return id;}
	@Override public String getName() {return name;}
	@Override public String getStatus() {return status;}
	
	
	// ===== travailler ici ===== //
	
	public static final int MAX_MIEL = 8;
	
	private int id;
	private String name;
	private String status;
	
	private Ruche ruche;
	private Fleur fleur;
	private int miel = 0;
	
	public Abeille(int id, Ruche r) {
		this.id = id;
		name = "Abeille" + id;
		status = "ATTENDRE";
		ruche = r;
		
		fleur = new Fleur();
	}
	
	public void update() {
		if(miel == MAX_MIEL) {
			status = "DEPOSE A LA RUCHE";
			ruche.takeMiel(miel);
			miel = 0;
		} else {
			Integer tryGetPollen = fleur.getPollen();
			if(tryGetPollen == 0) {
				fleur = new Fleur();
				status = "CHERCHE NOUVELLE FLEUR";
			} else {
				miel += tryGetPollen;
				status = "JE BUTINE : " + miel;
			}
		}
	}
}
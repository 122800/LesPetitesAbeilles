package bonnetZone;

import main.IDisplayable;

public class Ruche implements IDisplayable {

	private String colour = "0x0000CC";
	@Override public String getColour() {return colour;}
	@Override public int getId() {return id;}
	@Override public String getName() {return name;}
	@Override public String getStatus() {return status;}
	
	
	// ===== travailler ici ===== //
	
	private int id = 1;
	private String name;
	private String status;
	
	private Integer miel = 0;
	
	public Ruche() {
		name = "La ruche";
		status = "MIEL: " + miel;
	}
	
	public void update() {
		status = "MIEL: " + miel;
	}
	
	public void takeMiel(Integer quantite) {
		miel += quantite;
		status = "JE RAJOUTE DU MIEL : (" + quantite + ")";
	}

}

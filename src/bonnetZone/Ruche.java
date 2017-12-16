package bonnetZone;

import main.Displayable;

public class Ruche implements Displayable {
	
	private String name = "La ruche";		// le nom de la ruche.
	private String status = "EN ATTENTE";	// de l'affichage libre - le contenu de cette variable sera imprimé avec la ruche.
	private String colour = "0x0000CC";		// code hex pour du noir : "0x000000";

	@Override public String getColour()	{	return colour;	}
	@Override public String getName()	{	return name;	}
	@Override public String getStatus()	{	return status;	}
	
	// ============================================================== //
	// =====					Correction						===== //
	// ============================================================== //
	
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

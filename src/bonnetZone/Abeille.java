package bonnetZone;

import main.IDisplayable;

public class Abeille implements IDisplayable {

	private String name;	// le nom de
	private String status;	// de l'affichage libre - le contenu de cette variable sera imprimé pour chaque abeille
	private String colour;	// code hex pour du noir : "0x000000";
	
	@Override public String getColour()	{	return colour;	}
	@Override public String getName()	{	return name;	}
	@Override public String getStatus()	{	return status;	}
	
	// ============================================================== //
	// ===== Il n'y a rien à faire au dessus de cette ligne. 	===== //
	// ===== Tu es libre de mettre autant de code que tu veux ! ===== //
	// ============================================================== //
	
	public Abeille() {
		// voici ton constructeur vide
	}
}
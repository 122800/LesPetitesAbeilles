package main;

import java.util.List;

import bonnetZone.Abeille;
import bonnetZone.Ruche;

public interface IAbeilleApplication {
	public List<Abeille> getAbeilles();
	public Ruche getRuche();
	
	public void receiveInput();
}
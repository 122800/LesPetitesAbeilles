package main;

import java.util.List;

import bonnetZone.Abeille;

public interface ContientDesAbeilles {
	public List<Abeille> getAbeilles();
	public void receiveInput();
	public void run();
}
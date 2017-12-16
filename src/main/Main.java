package main;

import bonnetZone.BonnetApplication;

public class Main {
	
	public static boolean running = true;
	public static Window window;
	public static BonnetApplication LesPetitesAbeilles;
	
	public static void main(String[] args) {
		
		init();
		
		while(running) {
			
			LesPetitesAbeilles.run();
			
			try {
				Thread.sleep(1000/1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void init() {
		window = new Window();
		LesPetitesAbeilles = new BonnetApplication();
	}
}
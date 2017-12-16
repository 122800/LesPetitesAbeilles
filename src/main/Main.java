package main;

import java.awt.event.KeyEvent;

import bonnetZone.BonnetApplication;

public class Main {
	
	public static boolean running = true;
	public static Window window;
	public static BonnetApplication lesPetitesAbeilles;
	
	public static void main(String[] args) {
		
		init();
		
		while(running) {
			
			lesPetitesAbeilles.run();
			
			updateDisplay();
			
			try {
				Thread.sleep(1000/1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void sendInput(int keyCode) {
		if(keyCode == KeyEvent.VK_ENTER) {
			lesPetitesAbeilles.receiveInput();
		}
	}
	
	private static void updateDisplay() {
		window.repaint();
	}

	private static void init() {
		lesPetitesAbeilles = new BonnetApplication();
		window = new Window(lesPetitesAbeilles.getAbeilles(), lesPetitesAbeilles.getRuche());
	}
}
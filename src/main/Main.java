package main;

public class Main {
	
	public static boolean running = true;
	
	public static Window window;
	
	public static void main(String[] args) {
		
		init();
		
		while(running) {
			
			loop();
			
			try {
				Thread.sleep(1000/1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void loop() {
		// do stuff here?
	}
	
	public static void init() {
		window = new Window();
	}
}
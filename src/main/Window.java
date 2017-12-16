package main;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {
	
	private JPanel display;
	private Graphics g;
	
	public Window() {
		setTitle("Les Petites Abeilles");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		display = new JPanel();
		g = display.getGraphics();
	}
	
	public void refresh() {
		g.clearRect(0, 0, display.getWidth(), display.getHeight());
	}
}
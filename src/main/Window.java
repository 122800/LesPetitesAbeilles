package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import bonnetZone.Abeille;
import bonnetZone.Ruche;

public class Window extends JPanel implements KeyListener {
	
	private JFrame container;
	
	public Window(ArrayList<Abeille> abeilles, Ruche ruche) {
		
		this.abeilles = abeilles;
		this.ruche = ruche;
		
		container = new JFrame("Les Petites Abeilles");
		container.setSize(450, 400);
		container.setLocationRelativeTo(null);
		container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		container.getContentPane().add(this);
		
		container.setVisible(true);
		
		container.addKeyListener(this);
	}
	
	private ArrayList<Abeille> abeilles;
	private Ruche ruche;
	
	private static final int W = 200; 
	private static final int H = 50; 
	
	private int curId = 0;
	@Override
	public void paintComponent(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		
		curId = 0;
		
		// abeilles
<<<<<<< Updated upstream
		abeilles.forEach((a) -> {
			paintDisplayable(g, a, 0);
		});
		
		// ruche
		paintDisplayable(g, ruche, getWidth()-W);
=======
		if(abeilles.size() > 0) {
			abeilles.forEach((a) -> {
				paintDisplayable(g, a, 0, curId++);
			});
		}
>>>>>>> Stashed changes
	}
	
	private void paintDisplayable(Graphics g, Displayable d, int x, int curId) {
		g.setColor(Color.decode(d.getColour()));
		
		int y = H * (curId);
		g.drawRect(x, y, W, H);
		
		g.drawString(d.getName(), x + 10, y+20);
		g.drawString(d.getStatus(), x + 10, y+40);
	}

	@Override public void keyPressed(KeyEvent e) {}	
	@Override public void keyTyped(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {
		Main.sendInput(e.getKeyCode());
	}
}
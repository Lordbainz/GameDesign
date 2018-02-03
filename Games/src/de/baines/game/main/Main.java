package de.baines.game.main;

import de.baines.game.graphics.*;
import de.baines.game.objects.*;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
	    int DISPLAYHEIGHT = 600;
	    int DISPLAYWIDTH = 800;
	    System.out.println("test");
		
		Player player = new Player(300,300,100,DISPLAYHEIGHT,DISPLAYWIDTH);
		KeyHandler keyboard = new KeyHandler();
		
		
		
		Screen screen = new Screen();
		screen.setPlayer(player);
		screen.setBounds(0, 0,DISPLAYWIDTH,DISPLAYHEIGHT);
		
		Frame f = new Frame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(DISPLAYWIDTH, DISPLAYHEIGHT);
		f.setVisible(true);
		f.setResizable(false);
		f.setKeyHandler(keyboard);
		f.addScreen(screen);
		
		
		
		while(true) {
			player.update(keyboard.get_Up(), keyboard.get_Down(), keyboard.get_Left(), keyboard.get_Right());
			screen.repaint();			
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}

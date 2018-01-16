package de.baines.game.objects;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
	
	private boolean keyUp = false;
	private boolean keyDown = false;
	private boolean keyLeft = false;
	private boolean keyRight = false;

	@Override
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode()==KeyEvent.VK_S) {keyDown=true;}
		if (e.getKeyCode()==KeyEvent.VK_W) {keyUp=true;}
		if (e.getKeyCode()==KeyEvent.VK_A) {keyLeft=true;}
		if (e.getKeyCode()==KeyEvent.VK_D) {keyRight=true;}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if (e.getKeyCode()==KeyEvent.VK_S) {keyDown=false;}
		if (e.getKeyCode()==KeyEvent.VK_W) {keyUp=false;}
		if (e.getKeyCode()==KeyEvent.VK_A) {keyLeft=false;}
		if (e.getKeyCode()==KeyEvent.VK_D) {keyRight=false;}
	}

	//Don't needed 
	@Override
	public void keyTyped(KeyEvent e) {
	}
	
	public boolean get_Up() {
		return this.keyUp;
	}
	
	public boolean get_Down() {
		return this.keyDown;
	}
	
	public boolean get_Left() {
		return this.keyLeft;
	}
	
	public boolean get_Right() {
		return this.keyRight;
	}

	

}
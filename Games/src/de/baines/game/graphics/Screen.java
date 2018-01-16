package de.baines.game.graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

import de.baines.game.objects.Player;

public class Screen extends JLabel {

	private static final long serialVersionUID = 1L;
	
	private Player player;
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillRect(player.getBounding().x,player.getBounding().y,player.getBounding().width,player.getBounding().height);
		
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
}
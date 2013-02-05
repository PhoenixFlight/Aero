package com.zephyrr.aero.gui;

import java.awt.Graphics;

import javax.swing.JPanel;

import com.zephyrr.aero.world.ChunkGrid;

public class WorldLayer extends JPanel {
	private ChunkGrid cg;
	public WorldLayer(WorldPane parent, ChunkGrid cg) {
		this.cg = cg;
	}
	public void paint(Graphics g) {
		
	}
}

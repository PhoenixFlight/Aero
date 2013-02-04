package com.zephyrr.aero.gui;

import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import com.zephyrr.aero.world.ChunkGrid;

public class Window extends JFrame {
	JLayeredPane deepWorldPane;
	private HashMap<Integer, ChunkGrid> gridMap;
	public Window(int x, int y) {
		setSize(800,600);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		deepWorldPane = new JLayeredPane();
		gridMap = new HashMap<Integer, ChunkGrid>();
	}
	public void update() {
		
	}
}

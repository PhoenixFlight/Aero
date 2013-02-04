package com.zephyrr.aero.gui;

import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import com.zephyrr.aero.entry.Main;
import com.zephyrr.aero.world.ChunkGrid;

public class Window extends JFrame {
	private WorldPane deepWorldPane;
	private Main main;
	public Window(Main m, int x, int y) {
		main = m;
		setSize(800,600);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		deepWorldPane = new WorldPane(this);
		add(deepWorldPane);
	}
	public void update() {
		
	}
}

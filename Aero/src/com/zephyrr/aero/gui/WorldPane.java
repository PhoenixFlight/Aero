package com.zephyrr.aero.gui;

import java.util.HashMap;

import javax.swing.JLayeredPane;

import com.zephyrr.aero.world.World;

public class WorldPane extends JLayeredPane {
	private Window parent;
	private HashMap<Integer, WorldLayer> layers;
	public WorldPane(Window parent) {
		this.parent = parent;
		layers = new HashMap<Integer, WorldLayer>();
		for(Integer i : World.getActiveWorld().getLayers().keySet()) {
			layers.put(i, new WorldLayer(this, World.getActiveWorld().getLayer(i)));
			add(layers.get(i), i);
		}
	}
}

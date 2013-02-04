package com.zephyrr.aero.world;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class World {
	private static ArrayList<World> worlds;
	private static World activeWorld;
	static {
		worlds = new ArrayList<World>();
		loadWorld("mainworld.wld");
	}
	public static World getActiveWorld() {
		return activeWorld;
	}
	public static void setActiveWorld(World w) {
		activeWorld = w;
	}
	private static World loadWorld(String path) {
		// PLACEHOLDER
		return null;
	}
	public static ArrayList<World> getWorlds() {
		return worlds;
	}
	
	private HashMap<Integer, ChunkGrid> layers;
	protected World() {
		layers = new HashMap<Integer, ChunkGrid>();
	}
	public HashMap<Integer, ChunkGrid> getLayers() {
		return layers;
	}
	public ChunkGrid getLayer(int level) {
		return layers.get(level);
	}
}

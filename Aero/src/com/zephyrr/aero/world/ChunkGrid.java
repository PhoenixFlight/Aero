package com.zephyrr.aero.world;

import java.util.HashMap;

public class ChunkGrid {
	private HashMap<Location<Chunk>, Chunk> chunkMap;
	public ChunkGrid() {
		chunkMap = new HashMap<Location<Chunk>, Chunk>();
	}
	public boolean addChunk(Location<Chunk> where, Chunk c) {
		if(chunkMap.containsKey(where))
			return false;
		chunkMap.put(where, c);
		return true;
	}
	public Chunk getChunk(Location<Chunk> where) {
		if(chunkMap.containsKey(where))
			return chunkMap.get(where);
		return null;
	}
}

package com.zephyrr.aero.world;

import java.util.HashMap;

import com.zephyrr.aero.entity.Entity;

public class Chunk {
	private HashMap<Location<Entity>, Entity> entityMap;
	private int baseX, baseY;
	private int xDim, yDim;
	public Chunk(int baseX, int baseY) {
		this.baseX = baseX;
		this.baseY = baseY;
	}
	public boolean addEntity(Location<Entity> where, Entity e) {
		if(entityMap.containsKey(where))
			return false;
		entityMap.put(where, e);
		return true;
	}
	public boolean removeEntity(Location<Entity> where) {
		if(entityMap.containsKey(where)) {
			entityMap.remove(where);
			return true;
		}
		return false;
	}
	public boolean removeEntity(Entity e) {
		if(entityMap.values().contains(e)) {
			for(Location<Entity> l : entityMap.keySet()) {
				if(entityMap.get(l).equals(e)) {
					entityMap.remove(l);
					return true;
				}
			}
		}
		return false;
	}
}

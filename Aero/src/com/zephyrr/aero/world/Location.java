package com.zephyrr.aero.world;

public class Location<T> {
	private int x, y;
	private ChunkGrid grid;
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setGrid(ChunkGrid cg) {
		grid = cg;
	}
	public ChunkGrid getGrid() {
		return grid;
	}
	public boolean equals(Object o) {
		if(o instanceof Location) {
			Location l = (Location)o;
			return l.getX() == getX() && l.getY() == getY();
		}
		return false;
	}
	public int hashCode() {
		return 0;
	}
}

package com.zephyrr.aero.gui;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.imageio.ImageIO;

public class IconCache {
	private static HashMap<String, Image> images;
	static {
		images = new HashMap<String, Image>();
	}
	public static void loadImage(String path, String id) {
		if(!images.containsKey(id))
			images.put(id, getImageFile(path));
	}
	public static void recursiveLoadImage(String path, boolean deep) {
		File dir = new File(path);
		if(!dir.isDirectory())
			return;
		for(File f : dir.listFiles()) {
			if(f.isDirectory() && deep)
				recursiveLoadImage(f.getAbsolutePath(), deep);
			else {
				if(isImageFile(f))
					loadImage(f.getAbsolutePath(), f.getName());
			}
		}
	}
	private static boolean isImageFile(File f) {
		String end = f.getName().split(".")[f.getName().split(".").length - 1];
		switch(end.toLowerCase()) {
		case "png":
		case "jpg":
		case "jpeg":
		case "bmp": return true;
		}
		return false;
	}
	private static Image getImageFile(String path) {
		try {
			return ImageIO.read(new File(path));
		} catch(IOException e) {
			throw new Error("Image File not found: " + path);
		}
	}
	public Image getImage(String key) {
		if(images.containsKey(key)) {
			return images.get(key);
		}
		return null;
	}
	public Set<String> getKeys() {
		Set<String> keys = new HashSet<String>();
		keys.addAll(images.keySet());
		return keys;
	}
}

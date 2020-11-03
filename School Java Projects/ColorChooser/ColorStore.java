import java.awt.*;
import java.util.HashMap;

public class ColorStore {
	
	private static HashMap<String, Color> colorHashMap = new HashMap<>();
	public ColorStore(){colorHashMap.put("MAGENTA",Color.MAGENTA);
	colorHashMap.put("YELLOW",Color.YELLOW);
	colorHashMap.put("CYAN",Color.CYAN);
	colorHashMap.put("DARK_GRAY",Color.DARK_GRAY);
	colorHashMap.put("ORANGE",Color.ORANGE);
	colorHashMap.put("GRAY",Color.GRAY);
	colorHashMap.put("WHITE",Color.WHITE);
	colorHashMap.put("BLUE",Color.BLUE);
	colorHashMap.put("GREEN",Color.GREEN);
	colorHashMap.put("RED",Color.RED);
	colorHashMap.put("PINK",Color.PINK);
	colorHashMap.put("LIGHT_GRAY",Color.LIGHT_GRAY);
	colorHashMap.put("BLACK",Color.BLACK);
	}
	
	private String getName(Color color) {
		return color.getClass().getName();
		}
	
	public HashMap<String, Color> getAllColors(){return colorHashMap;}
	}


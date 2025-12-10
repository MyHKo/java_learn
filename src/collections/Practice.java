package collections;

import java.util.HashMap;
import java.util.Map;

public class Practice {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "one");
		System.out.println(map.get(1));
	}
}

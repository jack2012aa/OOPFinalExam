package five;

import java.util.HashMap;
import java.util.Map;

public class Statistic {

	private int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	private Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	public void addToMap(int i) {
		if (map.containsKey(i)) {
			map.put(i, map.get(i) + 1);
		} else {
			map.put(i, 1);
		}
	}
	
	public void printMap() {
		int total = 0;
		for (int i = 3; i < 19; i++) {
			if (map.get(i) != null) {
				System.out.printf("%d: %d\n", i, map.get(i));
				total += map.get(i);
			} else {
				System.out.printf("%d: 0\n", i);
			}
		}
		System.out.printf("total: %d", total);
	}
	
	public void addToArray(int i) {
		this.array[i-3]++;
	}
	
	public void printArray() {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d: %d\n", i + 3, array[i]);
			total += array[i];
		}
		System.out.printf("total: %d\n", total);
	}
}

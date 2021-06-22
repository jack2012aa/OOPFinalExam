package five;

import java.util.Random;

public class Dice {

	public Integer shoot(Random random) {
		return (random.nextInt(6) + random.nextInt(6) + random.nextInt(6) + 3);
	}
	
}

package five;

import java.util.Random;

public class test {

	public static void main(String[] args) {
		Dice dice = new Dice();
		Random random = new Random();
		random.setSeed(100);  //指定順序
		Statistic statistic = new Statistic();
		
		for (int i = 0; i < 1000; i++) {
			Integer number = dice.shoot(random);
			statistic.addToArray(number);
			statistic.addToMap(number);
		}
		
		statistic.printArray();
		statistic.printMap();
	}

}

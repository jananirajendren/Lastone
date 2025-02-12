package Utility;

import java.util.Random;

public class Java_Utility {
	/**
	 * this method is used to avoid duplicate values
	 * @return
	 */
public int getRandomNum() {
	Random ran = new Random();
	int rannum = ran.nextInt(1000);
	return rannum;
}
}

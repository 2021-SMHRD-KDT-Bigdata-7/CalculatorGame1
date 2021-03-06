package lwa;

import java.util.Random;

public class DivGame implements iGame {
	private Random ran;
	private int num1;
	private int num2;

	@Override
	public void makeRandom() {

		ran = new Random();

		// 1~9까지의 랜덤수를 생성하여 num1과 num2에 초기화
		num1 = ran.nextInt(9) + 1;
		num2 = ran.nextInt(9) + 1;

	}

	@Override
	public String getQuizMsg() {

		return num1 + "/" + num2 + "=";
	}

	@Override
	public boolean checkAnswer(int answer) {

		return ((num1 / num2) == answer) ? true : false;
	}

}

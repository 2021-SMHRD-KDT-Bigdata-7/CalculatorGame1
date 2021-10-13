package lwa;

import java.util.Scanner;

public class ArithmeticGameMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("플레이할 게임을 선택하세요");
		System.out.println("[1] 더하기 [2] 빼기 [3] 곱하기 [4] 나누기");
		int a= scan.nextInt();
		switch(a) {
		case 1: {
		PlusGame dummy = new PlusGame();
		for (int chance = 0; chance < 5; chance++) {
			// 1. 랜덤수 생성
			dummy.makeRandom();
			for (int i = 0; i < 3; i++) {
				// 2. 랜덤숫자를 이용한 문제생성
				String quiz = dummy.getQuizMsg();
				System.out.println(quiz);
				int answer = scan.nextInt();
				// 3. 정답 체크
				if (dummy.checkAnswer(answer)) {
					System.out.println("정답입니다.");
					break;
				} else if (i == 0) {
					System.out.println("다시 생각해볼까요?");
				} else if (i == 1) {
					System.out.println("한번 더...!");
				} else {
					System.out.println("빡대가리");
				}

			}
			
		}
		}
		case 2: {
			MinusGame dummy = new MinusGame();
			for (int chance = 0; chance < 5; chance++) {
				// 1. 랜덤수 생성
				dummy.makeRandom();
				for (int i = 0; i < 3; i++) {
					// 2. 랜덤숫자를 이용한 문제생성
					String quiz = dummy.getQuizMsg();
					System.out.println(quiz);
					int answer = scan.nextInt();
					// 3. 정답 체크
					if (dummy.checkAnswer(answer)) {
						System.out.println("정답입니다.");
						break;
					} else if (i == 0) {
						System.out.println("다시 생각해볼까요?");
					} else if (i == 1) {
						System.out.println("한번 더...!");
					} else {
						System.out.println("빡대가리");
					}

				}
				
			}
		}
		case 3: {
			MulGame dummy = new MulGame();
			for (int chance = 0; chance < 5; chance++) {
				// 1. 랜덤수 생성
				dummy.makeRandom();
				for (int i = 0; i < 3; i++) {
					// 2. 랜덤숫자를 이용한 문제생성
					String quiz = dummy.getQuizMsg();
					System.out.println(quiz);
					int answer = scan.nextInt();
					// 3. 정답 체크
					if (dummy.checkAnswer(answer)) {
						System.out.println("정답입니다.");
						break;
					} else if (i == 0) {
						System.out.println("다시 생각해볼까요?");
					} else if (i == 1) {
						System.out.println("한번 더...!");
					} else {
						System.out.println("빡대가리");
					}

				}
				
			}
		}
		case 4: {
			DivGame dummy = new DivGame();
			for (int chance = 0; chance < 5; chance++) {
				// 1. 랜덤수 생성
				dummy.makeRandom();
				for (int i = 0; i < 3; i++) {
					// 2. 랜덤숫자를 이용한 문제생성
					String quiz = dummy.getQuizMsg();
					System.out.println(quiz);
					int answer = scan.nextInt();
					// 3. 정답 체크
					if (dummy.checkAnswer(answer)) {
						System.out.println("정답입니다.");
						break;
					} else if (i == 0) {
						System.out.println("다시 생각해볼까요?");
					} else if (i == 1) {
						System.out.println("한번 더...!");
					} else {
						System.out.println("빡대가리");
					}

				}
				
			}
				
			}
		default : {
			System.out.println("잘못된 값을 입력하였습니다. 다시 실행해 주세요.");
			break;
		}
		}
		
		}
		
		
	}



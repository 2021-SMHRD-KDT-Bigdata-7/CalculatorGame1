package lwa;

import java.util.Scanner;

public class ArithmeticGameMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�÷����� ������ �����ϼ���");
		System.out.println("[1] ���ϱ� [2] ���� [3] ���ϱ� [4] ������");
		int a= scan.nextInt();
		switch(a) {
		case 1: {
		PlusGame dummy = new PlusGame();
		for (int chance = 0; chance < 5; chance++) {
			// 1. ������ ����
			dummy.makeRandom();
			for (int i = 0; i < 3; i++) {
				// 2. �������ڸ� �̿��� ��������
				String quiz = dummy.getQuizMsg();
				System.out.println(quiz);
				int answer = scan.nextInt();
				// 3. ���� üũ
				if (dummy.checkAnswer(answer)) {
					System.out.println("�����Դϴ�.");
					break;
				} else if (i == 0) {
					System.out.println("�ٽ� �����غ����?");
				} else if (i == 1) {
					System.out.println("�ѹ� ��...!");
				} else {
					System.out.println("���밡��");
				}

			}
			
		}
		}
		case 2: {
			MinusGame dummy = new MinusGame();
			for (int chance = 0; chance < 5; chance++) {
				// 1. ������ ����
				dummy.makeRandom();
				for (int i = 0; i < 3; i++) {
					// 2. �������ڸ� �̿��� ��������
					String quiz = dummy.getQuizMsg();
					System.out.println(quiz);
					int answer = scan.nextInt();
					// 3. ���� üũ
					if (dummy.checkAnswer(answer)) {
						System.out.println("�����Դϴ�.");
						break;
					} else if (i == 0) {
						System.out.println("�ٽ� �����غ����?");
					} else if (i == 1) {
						System.out.println("�ѹ� ��...!");
					} else {
						System.out.println("���밡��");
					}

				}
				
			}
		}
		case 3: {
			MulGame dummy = new MulGame();
			for (int chance = 0; chance < 5; chance++) {
				// 1. ������ ����
				dummy.makeRandom();
				for (int i = 0; i < 3; i++) {
					// 2. �������ڸ� �̿��� ��������
					String quiz = dummy.getQuizMsg();
					System.out.println(quiz);
					int answer = scan.nextInt();
					// 3. ���� üũ
					if (dummy.checkAnswer(answer)) {
						System.out.println("�����Դϴ�.");
						break;
					} else if (i == 0) {
						System.out.println("�ٽ� �����غ����?");
					} else if (i == 1) {
						System.out.println("�ѹ� ��...!");
					} else {
						System.out.println("���밡��");
					}

				}
				
			}
		}
		case 4: {
			DivGame dummy = new DivGame();
			for (int chance = 0; chance < 5; chance++) {
				// 1. ������ ����
				dummy.makeRandom();
				for (int i = 0; i < 3; i++) {
					// 2. �������ڸ� �̿��� ��������
					String quiz = dummy.getQuizMsg();
					System.out.println(quiz);
					int answer = scan.nextInt();
					// 3. ���� üũ
					if (dummy.checkAnswer(answer)) {
						System.out.println("�����Դϴ�.");
						break;
					} else if (i == 0) {
						System.out.println("�ٽ� �����غ����?");
					} else if (i == 1) {
						System.out.println("�ѹ� ��...!");
					} else {
						System.out.println("���밡��");
					}

				}
				
			}
				
			}
		default : {
			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�. �ٽ� ������ �ּ���.");
			break;
		}
		}
		
		}
		
		
	}



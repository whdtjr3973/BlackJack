package com.biz.blcakjack.controller;

import java.util.Scanner;

import com.biz.blackjack.service.BlackJackService;
import com.biz.blackjack.service.PlayService;

public class BlackJack_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		BlackJackService bs = new BlackJackService();
		bs.makeDeck();
		while (true) {
			System.out.println("----------------------");
			System.out.println(" Game Start ");
			System.out.println("----------------------");

			PlayService dealer = new PlayService(bs.getDeck(), "����");
			PlayService player = new PlayService(bs.getDeck(), "�÷��̾�");

			for (int i = 0; i < 2; i++) {
				dealer.hit();
				player.hit();
			}

			while (true) {

				System.out.println("============================");
				System.out.println("1. Hit   2.Stand   0.GameEnd");
				System.out.println("----------------------------");
				System.out.println("���� >> ");
				String strMenu = scan.nextLine();

				try {
					int intMenu = Integer.valueOf(strMenu);
					if (intMenu == 0) {
						System.out.println("Good Bye!");

						// main method���� return ���� ������
						// ������Ʈ ������ ����ȴ�.
						return;
					}
					if (intMenu == 1) {
						dealer.hit();
						player.hit();
					}
					int dSum = dealer.sumValue();
					int pSum = player.sumValue();
					if (pSum > 21) {
						System.out.println("���� �¸�!");
					} else if (dSum > 21) {
						System.out.println("�÷��̾� �¸�!");
					}

					if (intMenu == 2) {
						if (dSum > pSum) {
							System.out.println("���� �¸�");
						} else {
							System.out.println("�÷��̾� �¸�");
						}
						System.out.println("�ƹ�Ű�� ��������");
						break;
					}
				} catch (Exception e) {

				}

			}

		}

	}

}
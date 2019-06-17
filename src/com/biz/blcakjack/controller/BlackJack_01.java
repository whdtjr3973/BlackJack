package com.biz.blcakjack.controller;

import com.biz.blackjack.service.BlackJackService;

public class BlackJack_01 {

	public static void main(String[] args) {

		BlackJackService bs = new BlackJackService();
		bs.makeDeck();
		bs.viewCardList();
		
	}

}

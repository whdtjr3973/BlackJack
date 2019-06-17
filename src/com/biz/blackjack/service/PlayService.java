package com.biz.blackjack.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.blackjack.model.DeckVO;

public class PlayService {

	List<DeckVO> playList;
	List<DeckVO> deckList;
	String playName;

	public int sumValue() {
		int sumValue = 0;
		for (DeckVO vo : playList) {
			sumValue += vo.getValue();

		}
		return sumValue;
	}

	public PlayService(List<DeckVO> deckList, String playName) {
		this.playList = new ArrayList<DeckVO>();
		this.deckList = deckList;
		this.playName = playName;
	}

	public void hit() {
		if (playName.equals("µô·¯") && this.sumValue() > 16) {
			System.out.println("µô·¯Á¡¼ö : " + this.sumValue());
			System.out.println("µô·¯ Hit ±ÝÁö");
		} else {
			playList.add(deckList.get(0));
			deckList.remove(0);
		}
		playList.add(deckList.get(0));
		deckList.remove(0);
		System.out.println("==========");
		System.out.println(playName);
		System.out.println("==========");

		for (DeckVO vo : playList) {
			System.out.println(vo);
		}
	}

}

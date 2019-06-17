package com.biz.blackjack.model;

public class DeckVO {

	private String suit; // ī�幮��
	private String denomination; // ǥ�鰪
	private int value; // �� ����
	
	
	public DeckVO(String suit, String denomination, int value) {
		super();
		this.suit = suit;
		this.denomination = denomination;
		this.value = value;
	}
	
	
	public DeckVO() {
		super();
	}


	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "DeckVO [suit=" + suit + ", denomination=" + denomination + ", value=" + value + "]";
	}
	
	
}

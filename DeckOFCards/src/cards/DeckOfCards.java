package cards;

import java.util.*;

public class DeckOfCards {

	public static void main(String[] args) {

		String[][] cardCombo = new String[4][13];
		String[][] playerCards = new String[4][9];
		Set<String> cards = new HashSet<String>();

		
		//
		String[] suits = { "Clubs", "Hearts", "Diamonds", "Spade" };
		String[] rank = { "Ace", "Kings", "Queen", "Jack", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cardCombo[i][j] = suits[i] + rank[j];
				
			}
		}

		String[] player = new String[9];
	
	
		while (cards.size() < 9) {
			int index = cards.size();
			int randomSuits = (int) Math.floor(Math.random() * 10) % 4;
			int randomRanks = (int) Math.floor(Math.random() * 100) % 13;
			
			
		
			player[index] = cardCombo[randomSuits][randomRanks];
			cards.add(player[index]);
			

		}
		System.out.println(cards);
		System.out.println(cards.size());
	}

}

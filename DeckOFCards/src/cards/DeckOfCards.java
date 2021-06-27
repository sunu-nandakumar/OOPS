package cards;

import java.util.*;

public class DeckOfCards {

	public static void main(String[] args) {

		String[][] cardCombo = new String[4][13];
		String[] cardsDistrubed = new String[36];
		String[][] player = new String[4][9];
		Set<String> cards = new HashSet<String>();

		String[] suits = { "Clubs", "Hearts", "Diamonds", "Spade" };
		String[] rank = { "Ace", "Kings", "Queen", "Jack", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

			// creating all the possible combinations
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cardCombo[i][j] = suits[i] + rank[j];

			}
		}
		// to avoid duplicate cards 
		while (cards.size() < 36) {
			int index = cards.size();
			int randomSuits = (int) Math.floor(Math.random() * 10) % 4;
			int randomRanks = (int) Math.floor(Math.random() * 100) % 13;

			cardsDistrubed[index] = cardCombo[randomSuits][randomRanks];
			cards.add(cardsDistrubed[index]);

		}
		// distributing the cards to players
		int counter = 0;
		while (counter < 36) {

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 9; j++) {
					player[i][j] = (String) cards.toArray()[counter];
					counter++;

				}
			}
		}
		// printing the 2-D array 
		for (int i = 0; i < 4; i++) {
			System.out.println("\nPlayer " + (i + 1) + " cards\n");
			for (int j = 0; j < 9; j++) {

				System.out.println(player[i][j]);
			}
		}

	}

}

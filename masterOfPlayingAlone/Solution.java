package masterOfPlayingAlone;

import java.util.ArrayList;
import java.util.Comparator;

public class Solution {

	boolean[] drawnCardsArr;
	int[] cards;
	int count;

	public int solution(int[] cards) {
		this.cards = cards;
		drawnCardsArr = new boolean[cards.length];
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < cards.length; i++) {
			if(drawnCardsArr[i]) continue;
			
			count = 1;
			drawnCardsArr[i] = true;
			openBox(cards[i] - 1);
			list.add(count);
		}
		
		list.sort(Comparator.reverseOrder());
		
		return list.size() == 1 ? 0 : (list.get(0) * list.get(1));
	}
	
	public void openBox(int index) {
		if(drawnCardsArr[index]) return;
		
		drawnCardsArr[index] = true;
		count++;
		openBox(cards[index] - 1);
	}
}

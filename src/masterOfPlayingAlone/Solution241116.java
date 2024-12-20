package masterOfPlayingAlone;

public class Solution241116 {
	int answer = 0;
	int first = 0;
	int second = 0;
	int index = 0;
	int length = 0;
	int[] cards = new int[100];
	boolean[] visited = new boolean[100];

	public int solution(int[] cards) {
		length = cards.length;
		for (int i = 0; i < length; i++) {
			this.cards[i] = cards[i];
		}

		for (int i = length; i < 100; i++) {
			visited[i] = true;
		}
		first = this.setScore();

		for (int i = 0; i < length; i++) {
			if (!visited[i]) {
				index = i;
				break;
			}
		}

		second = this.setScore();

		answer = first * second;

		return answer;
	}

	private int setScore() {
		int score = 0;

		while (!visited[index]) {
			score++;
			visited[index] = true;
			index = cards[index] - 1;
		}
		;

		return score;
	}
}

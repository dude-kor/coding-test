package masterOfPlayingAlone;

public class Solution241117 {
	public int solution(int[] cards) {
		int answer = 0;
		int first = 0;
		int second = 0;
		int length = cards.length;
		boolean[] visited = new boolean[length];

		int index = 0;

		do {
			first++;
			visited[index] = true;
			index = cards[index] - 1;
		} while(!visited[index]);

		for(int i = 0; i < length; i++) {
			if(visited[i]) continue;

			index = i;
			break;
		}

		if((index == (length - 1)) && visited[index])
			return 0;

		do {
			second++;
			visited[index] = true;
			index = cards[index] - 1;
		} while(!visited[index]);

		answer = first * second;

		return answer;
	}
}

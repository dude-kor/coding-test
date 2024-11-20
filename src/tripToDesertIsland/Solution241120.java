package tripToDesertIsland;

import java.util.ArrayList;
import java.util.List;

public class Solution241120 {

	static int[] xaxis = {1, 0, -1, 0};
	static int[] yaxis = {0, 1, 0, -1};
	static int[][] values;
	static boolean[][] visited;
	static int length;
	static int width;

	public int[] solution(String[] maps) {
		int[] answer = {-1};
		length = maps.length;
		width = maps[0].length();

		values = new int[width][length];

		for(int y = 0; y < length; y++) {
			String X = maps[y];
			String[] xs = X.replace('X', '0').split("");

			for(int x = 0; x < width; x++) {
				values[x][y] = Integer.parseInt(xs[y]);
			}
		}

		List<Integer> foods = new ArrayList<Integer>();
		int food = 0;
		visited = new boolean[width][length];

		for(int x = 0; x < width; x++) {
			for(int y = 0; y < length; y++) {
				visited[x][y] = true;
				int value = check(x, y);
				food += value;

				if (value > 0) continue;

				if(food < 1) continue;

				foods.add(food);
				food = 0;
			}
		}

		if(foods.size() > 0)
			answer = foods.stream().mapToInt(Integer::intValue).toArray();

		return answer;
	}

	private static int check(int x, int y) {
		int value = 0;
		
		for(int i = 0; i < 4; i++) {
			if(x + xaxis[i] < 0) continue;
			if(x + xaxis[i] > width - 1) continue;
			if(y + yaxis[i] < 0) continue;
			if(y + yaxis[i] > length - 1) continue;

			if (visited[x + xaxis[i]][y + yaxis[i]])
				value += values[x + xaxis[i]][y + yaxis[i]];
		}
		
		return value;
	}
}

//05910
//01050
//02310
//10001

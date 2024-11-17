package masterOfPlayingAlone;

//import java.util.Random;
//import java.util.concurrent.atomic.AtomicInteger;
//import java.util.stream.Stream;

public class Main {
	final static Solution241116 solution241116 = new Solution241116();
	final static Solution241117 solution241117 = new Solution241117();
	final static Solution solution = new Solution();
	
	public static void main(String[] args) {
//		int length = new Random().nextInt(100);
//		int[] cards = Stream.generate(new AtomicInteger()::incrementAndGet).parallel().map(String::valueOf)
//				.limit(length).mapToInt(s -> (int) Integer.parseInt(s)).toArray();

		int[] cards = { 8, 6, 4, 7, 2, 5, 1, 4 };

//		System.out.println(solution241116.solution(cards));
//		System.out.println(solution241117.solution(cards));
		System.out.println(solution.solution(cards));
	}
}

package kr.ac.sejong.kmooc.data_engineering.motivation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App6 {
	public static void app2() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/ahnsugyeong/desktop/2022-2/데이터엔지니어링/email.txt"));
		int lineCount = 0;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			lineCount++;

			if (line.startsWith("#"))
				continue;
			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);
		}
		System.out.println("줄 수: " + lineCount);
		br.close();
	}

	public static void app3() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/ahnsugyeong/desktop/2022-2/데이터엔지니어링/email.txt"));
		int eventCount = 0;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;

			if (line.startsWith("#"))
				continue;
			eventCount++;
			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);
		}
		System.out.println("이벤트 수: " + eventCount);
		br.close();
	}

	public static void app4() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/ahnsugyeong/desktop/2022-2/데이터엔지니어링/email.txt"));
		int min = Integer.MAX_VALUE; // 가장 최소의 사람 ID를 담는 min 변수 - 가장 큰 수로 초기화
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;

			if (line.startsWith("#"))
				continue;

			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			if (from < min)
				min = from;

			int to = Integer.parseInt(array[1]);
			if (to < min)
				min = to;

		}
		System.out.println("최소 사람 ID: " + min);

		br.close();
	}

	public static void app5() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/ahnsugyeong/desktop/2022-2/데이터엔지니어링/email.txt"));
		int max = Integer.MIN_VALUE; // 가장 최대의 사람 ID를 담는 max 변수 - 가장 큰 작은 수로 초기화
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;

			if (line.startsWith("#"))
				continue;

			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			if (from > max)
				max = from;

			int to = Integer.parseInt(array[1]);
			if (to > max)
				max = to;

		}
		System.out.println("최대 사람 ID: " + max);

		br.close();
	}

	public static void main(String args[]) throws IOException {
		long pre = System.currentTimeMillis();
		// app2();
		for (int i = 0; i < 100; i++) {
			app3();
			app4();
			app5();
		}

		System.out.println(System.currentTimeMillis() - pre);
	}
}
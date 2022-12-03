package kr.ac.sejong.kmooc.data_engineering.linkedlist;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListExample10 {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		try {
			System.out.println(linkedList.remove());
			System.out.println("출력 되지 않음");
		} catch (NoSuchElementException e) {
			System.out.println("출력 됨");
		}
		System.out.println(linkedList.poll());

		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		System.out.println(linkedList.remove());
		System.out.println(linkedList.poll());

	}

}

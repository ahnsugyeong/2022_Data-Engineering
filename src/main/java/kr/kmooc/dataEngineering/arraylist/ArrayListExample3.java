package kr.kmooc.dataEngineering.arraylist;

import java.util.ArrayList;
import java.util.List;

import kr.kmooc.dataEngineering.homework1.MyArrayList;
import kr.kmooc.dataEngineering.motivation.Email;

public class ArrayListExample3 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());

		List<String> stringList = new ArrayList<String>();
		System.out.println(stringList.isEmpty());
		System.out.println(stringList.size());

		List<Email> emailList = new ArrayList<Email>();
		System.out.println(emailList.isEmpty());
		System.out.println(emailList.size());
		
		List<Integer> intList2 = new MyArrayList<Integer>();
		System.out.println(intList2.isEmpty());
		System.out.println(intList2.size());

		List<String> stringList2 = new MyArrayList<String>();
		System.out.println(stringList2.isEmpty());
		System.out.println(stringList2.size());

		List<Email> emailList2 = new MyArrayList<Email>();
		System.out.println(emailList2.isEmpty());
		System.out.println(emailList2.size());
	}

}

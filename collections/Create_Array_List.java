package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Create_Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		int size = list1.size();
		System.out.println("Size: "+size);
		System.out.println(list1.isEmpty());
		System.out.println(list1);
		list1.add(10);
		list1.add(88);
		list1.add(78);
		list1.add(60);
		list1.add(67);
		list1.add(22);
		list1.add(43);
		list1.add(33);
		
		System.out.println(list1.size());
		System.out.println(list1.isEmpty());
		System.out.println(list1);
		list1.add(2, 88);
		System.out.println(list1);
		list1.remove(6);
		System.out.println(list1);
		System.out.println(list1.subList(2, 6));
		System.out.println(list1.contains(43));
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(88);
		list2.add(10);
		list2.add(43);
		System.out.println(list2);
		System.out.println(list1);
		System.out.println(list1.containsAll(list2));
		System.out.println(list1.equals(list2));
		list2.remove(0);
		System.out.println(list2);
		list1.removeAll(list2);
		System.out.println(list1);
		System.out.println("********************************");
		System.out.println(list1);
		System.out.println(list2);
		list2.addAll(list1);
		System.out.println(list2);
		list1.addAll(2, list2);
		System.out.println(list1);
		System.out.println("********************************");
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
		Collections.sort(list2, Collections.reverseOrder());
		System.out.println(list2);
		System.out.println("***************************");
		for (int i = 0; i <list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		System.out.println(list2.get(3));
		
		System.out.println("######################");
		for (Integer value : list2) {
			System.out.println(value);
		}

	}

}

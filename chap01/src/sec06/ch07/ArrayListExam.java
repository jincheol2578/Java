package sec06.ch07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import sec06.ch06.blackjack.Card;

public class ArrayListExam {
	
	public static void main(String[] args) {
//		수정이 잦을땐 LinkedList가 유리 그렇지 않을땐 ArrayList가 유리함
		List list = new ArrayList();
		List list2 = new LinkedList();
		
		list.add(10);
		list.add(10.1);
		list.add("a");
		list.add(new Card("",""));

		Object obj = list.get(1);
		
		double val = (double)obj;
		System.out.println(val);
		
		//		
//		Box box1 = new Box();
//		box1.val = 10;
//		
//		Box box2 = new Box();
//		box2.val = 20;
//		
//		box1.nextBox =box2;
	}
}

class Box {
	int val;
	Box nextBox;
}
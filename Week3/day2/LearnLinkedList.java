package week3.day2;

import java.util.Deque;
import java.util.LinkedList;

public class LearnLinkedList {

	public static void main(String[] args) {

      Deque<String> lastInFirstOut = new LinkedList<String>();
      lastInFirstOut.addFirst("Bhuvanesh");
      lastInFirstOut.addFirst("Udhaya");
      lastInFirstOut.addFirst("Anburaj");
      lastInFirstOut.addLast("Vineeth");
      lastInFirstOut.forEach(System.out::println);
      

	}

}

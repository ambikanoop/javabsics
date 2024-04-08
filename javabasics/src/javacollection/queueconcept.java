package javacollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class queueconcept {

	public static void main(String[] args) {
		//ArrayList al=new ArrayList();
		
		PriorityQueue q=new PriorityQueue();//duplicate allowed,insertion order preserved
		q.add(10);
		q.offer(20);
		q.add(60);
		q.add(60);
		System.out.println(q);
		//q.element();   //ger head element peek()
	//System.out.println(q.element());//if the queue is empty it trows exception
		System.out.println(q.peek());
		//System.out.println(q.remove());
		System.out.println(q.poll());
		System.out.println(q);
		Iterator it=q.iterator();
		//while(it.hasNext()) {
			//System.out.println(it.next());
		//}
  //for each loop
		for(Object ele:q) {
			System.out.println(ele);
		}
	}

}

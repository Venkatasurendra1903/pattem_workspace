package collections;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.*;
public class StackAndQueueExample 
{
	public static void main(String[] args) 
	{
/*//		Stack<Integer> s = new Stack<Integer>();
		Queue<Integer> s = new LinkedList<Integer>();
//		s.add(1);
//		s.add(2);
//		s.add(3);
		s.add(7855642);
        s.add(35658786);
        s.add(5278367);
        s.add(74381793);
		System.out.println("intitial stack is:\n"+s);
//		s.pop();
////		System.out.println("popping element:\n"+s);
////		System.out.println("popping element:\n"+s.pop());
//		System.out.println(s.peek());
		System.out.println(s.peek());
		*/
		
		Queue<Integer> pq = new PriorityBlockingQueue<Integer>();
		pq.add(343);
		pq.add(23);
//		pq.add(1);
		pq.add(10);
		@SuppressWarnings("rawtypes")
		Iterator itr = pq.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println("initial queue:\n"+pq);
//		pq.remove(10);
//		System.out.println(pq);
//		System.out.println(pq.poll());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		
	}

}

import java.util.*;

class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
    // Write your code here.
		if(linkedList.next==null)
			return linkedList;
		
		LinkedList current=linkedList.next;
		LinkedList prev=linkedList;
		
		while(current!=null)
		{
			if(current.value==prev.value)
			{
				prev.next=current.next;
				current=current.next;
			}
			else
			{
				prev=current;
				current=current.next;
			}
		}
		
    return linkedList;
  }
}

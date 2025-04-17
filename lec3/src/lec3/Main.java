package lec3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList theList=new LinkList();
		
		theList.insertFirst(11);
		theList.insertFirst(22);
		theList.insertFirst(33);
		theList.insertFirst(44);
		
		theList.displayList();
		
		while(!theList.isEmpty()) {
			Link aLink=theList.deleteFirst();
			
			System.out.println("Removed");
			
			aLink.displayLink();
		}
	}

}

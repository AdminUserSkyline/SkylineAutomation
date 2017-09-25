package DataStructure;

import java.util.Iterator;
import java.util.LinkedList;
public class practicelinkedlist {
	public static void main(String args[]){
	practicehashmappings phm = new practicehashmappings();
	
	System.out.println(practicehashmappings.hashmapObject.get(3));
	
	LinkedList<String> linkListObject=new LinkedList<String>();
	
	linkListObject.add("A");
	linkListObject.add("b");
	linkListObject.add("c");
	
	
	for(int i=0;i<linkListObject.size();i++){
		 if(linkListObject.get(i).equals("b"))
		 {
			 linkListObject.remove(i);
			 linkListObject.add(i, "d");
		 }
	}
 Iterator<String> itr=linkListObject.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	}
}	


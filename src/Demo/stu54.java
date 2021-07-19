package Demo;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class stu54 {
	
	public static void main(String args[]) {
		
		Comparator<Integer> com = (x,y) -> x-y;
		int result = com.compare(5,2);
		System.out.println(result);
		
		List<String> list = new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		
		list.forEach(name -> System.out.println(name));
		
		Comparator<Integer> com1 = Math :: subtractExact;
		int result1 = com1.compare(5, 2);
		System.out.println(result1);
		
		
		
//--------------------------------Lambda寫法--------------------------------		
		//===傳統寫法===
        MyCalc calc1 = new MyCalc() {
            @Override
            public void exec(int a, int b) {
                System.out.println("calc1: " + (a + b));
            }
        };
        calc1.exec(1, 2);

        //===Lambda寫法===
        MyCalc calc2 = (a, b) -> System.out.println("calc2: " + (a + b));
        calc2.exec(1, 2);
	}

}

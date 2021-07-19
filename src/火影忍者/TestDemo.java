package 火影忍者;

import 海賊王.騙人布;
import 海賊王.鷹眼;

public class TestDemo {

	public static void main(String[] args) {
		因陀羅 son1 = new 因陀羅();
		阿修羅 son2 = new 阿修羅();
		騙人布 student = new 騙人布();
		
		System.out.println("因陀羅:"+son1.skill);
		System.out.println("阿修羅:"+son2.skill);
		System.out.println("騙人布:"+student.skill);
		
		鳴人 son3 = new 鳴人();
		鷹眼 student2 = new 鷹眼();
		System.out.println();
		System.out.println("鳴人:"+son3.skill);
		System.out.println("鷹眼:"+student2.skill);
	}

}

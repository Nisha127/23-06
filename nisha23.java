package NishaLab2306;

import java.util.Arrays;


public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1 =  new Student(32, "nisha", "java", 80);
		Student obj2 =new Student(20, "neetu", "full stack", 45);
		Student obj3 =new Student(20, "aniket", "digital signal", 45);
		Student obj4 =new Student(45, "siddharth", "digital sign", 45);
		
		
		Student [] arr = { obj1 , obj2, obj3, obj4};
		
		Arrays.sort(arr, new NameComparator());
		
		for(Student s : arr) {
			System.out.println(s+" ");
		} 

	}

}

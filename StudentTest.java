package p2;


public class StudentTest {

	public static void main(String[] args) {
		Student vj=new Student( 5891 , "vijay",100);
		Student nvya=new Student( 1234 , "nvya",80);
		
		vj.showGrade();
		nvya.showGrade();
		
		
		System.out.println("================");
		
		
		System.out.println(Student.getSubject());

	}

}

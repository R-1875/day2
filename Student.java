package p2;

class Student {

	//static data 
	
		private static String subject;///all are global
		
		//SPECIAL BLOCK
		static
		{
		Student.subject="java";
			
		}
		
		//instance data
		
		private int rollNo;
		private String Name;////all are global
		private float marks;
		
		//special methods-cONSTRUCTOR
		
		Student(int rno,String sname,float mks)
		{
			this.rollNo=rno;
			this.Name=sname;
			this.marks=mks;
			
			
		}
		//static methods
		
		public static String getSubject()
		{
			return Student.subject;
			//System.out.println("Id ="+this.empId);
		}
		

		//instance methods
		
		void showGrade()
		{
			if((this.marks>60)&&(this.marks<=100))
				System.out.println("first division");
						else if((this.marks>40)&&(this.marks<=60))
				System.out.println("second division");
			
			else 
				System.out.println("fail");
			
			
			System.out.println("Id ="+this.rollNo);
			System.out.println("Id ="+this.Name);
			System.out.println("Id ="+this.marks);
			
		
			
		}
	
	
	
	
}


package pack2;



class Car {
	
	private long chassis_no;
	private String model;
	private String color;
	
	
	public void display()
	{
		System.out.println(this.chassis_no+""+this.model+ ""+ this.color);
	}
	
	
	
	

	Car()
	{
		this.chassis_no=1111;
		this.model="alto";
		this.color="White";
		
		
	}
	
	
	Car(long cno,String md1,String clr)
	{
		this.chassis_no=cno;
		this.model=md1;
		this.color=clr;
		
	}
	
	
	Car(Car old)
	{
		this.chassis_no=old.chassis_no;
		this.model=old.model;
		this.color=old.color;
	}
	
}

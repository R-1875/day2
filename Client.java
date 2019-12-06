package pack2;



public class Client {

	public static void main(String[] args) {
		
		Car c1=new Car();
		Car c2=new Car(8888,"jaguar","neon");
		Car c3=new Car(c1);
		//Car c4=new Car(c2);

		c1.display();
		System.out.println("-----------");
		c2.display();
		System.out.println("-----------");
		c3.display();
		//c4.display();
	}

}

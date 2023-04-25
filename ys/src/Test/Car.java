package Test;

import java.util.ArrayList;




abstract class Car {
	void run( ) {
		   start( );
		   drive( );
		   stop( );
		   turnoff( );
		   washCar();
	}
	abstract void start();
	abstract void drive();
	abstract void stop();
	abstract void turnoff();
	abstract void washCar();
}

class Sonata extends Car{

	@Override
	void start() {
		System.out.println("Sonata �õ��� �մϴ�.");
	}

	@Override
	void drive() {
		System.out.println("Sonata �޸��ϴ�.");
	}

	@Override
	void stop() {
		System.out.println("Sonata ����ϴ�.");
	}

	@Override
	void turnoff() {
		System.out.println("Sonata �õ��� ���ϴ�.");
	}

	@Override
	void washCar() {
		System.out.println("������ �մϴ�.");
	}
	
}
class Grandeur extends Car{

	@Override
	void start() {
		System.out.println("Grandeur �õ��� �մϴ�.");
	}

	@Override
	void drive() {
		System.out.println("Grandeur �޸��ϴ�.");
	}

	@Override
	void stop() {
		System.out.println("Grandeur ����ϴ�.");
	}

	@Override
	void turnoff() {
		System.out.println("Grandeur �õ��� ���ϴ�.");
	}

	@Override
	void washCar() {
		System.out.println("������ �մϴ�.");
	}
	
}

class Avante extends Car{

	@Override
	void start() {
		System.out.println("Avante �õ��� �մϴ�.");
	}

	@Override
	void drive() {
		System.out.println("Avante �޸��ϴ�.");
	}

	@Override
	void stop() {
		System.out.println("Avante ����ϴ�.");
	}

	@Override
	void turnoff() {
		System.out.println("Avante �õ��� ���ϴ�.");
	}
	@Override
	void washCar() {
		System.out.println("������ �մϴ�.");
	}

}

class Genesis extends Car{

	@Override
	void start() {
		System.out.println("Genesis �õ��� �մϴ�.");
	}

	@Override
	void drive() {
		System.out.println("Genesis �޸��ϴ�.");
	}

	@Override
	void stop() {
		System.out.println("Genesis ����ϴ�.");
	}

	@Override
	void turnoff() {
		System.out.println("Genesis �õ��� ���ϴ�.");
	}
	@Override
	void washCar() {
		System.out.println("������ �մϴ�.");
	}

}



class CarTest {
	
	
	public static void main(String[] args) {
		ArrayList<Car> CarList = new ArrayList<Car>();
		CarList.add(new Sonata());
		CarList.add(new Grandeur());
		CarList.add(new Avante());
		CarList.add(new Genesis());
		for(Car car:CarList) {
			car.run();
			System.out.println("======================");		
	}
	}
}
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
		System.out.println("Sonata 시동을 켭니다.");
	}

	@Override
	void drive() {
		System.out.println("Sonata 달립니다.");
	}

	@Override
	void stop() {
		System.out.println("Sonata 멈춥니다.");
	}

	@Override
	void turnoff() {
		System.out.println("Sonata 시동을 끕니다.");
	}

	@Override
	void washCar() {
		System.out.println("세차를 합니다.");
	}
	
}
class Grandeur extends Car{

	@Override
	void start() {
		System.out.println("Grandeur 시동을 켭니다.");
	}

	@Override
	void drive() {
		System.out.println("Grandeur 달립니다.");
	}

	@Override
	void stop() {
		System.out.println("Grandeur 멈춥니다.");
	}

	@Override
	void turnoff() {
		System.out.println("Grandeur 시동을 끕니다.");
	}

	@Override
	void washCar() {
		System.out.println("세차를 합니다.");
	}
	
}

class Avante extends Car{

	@Override
	void start() {
		System.out.println("Avante 시동을 켭니다.");
	}

	@Override
	void drive() {
		System.out.println("Avante 달립니다.");
	}

	@Override
	void stop() {
		System.out.println("Avante 멈춥니다.");
	}

	@Override
	void turnoff() {
		System.out.println("Avante 시동을 끕니다.");
	}
	@Override
	void washCar() {
		System.out.println("세차를 합니다.");
	}

}

class Genesis extends Car{

	@Override
	void start() {
		System.out.println("Genesis 시동을 켭니다.");
	}

	@Override
	void drive() {
		System.out.println("Genesis 달립니다.");
	}

	@Override
	void stop() {
		System.out.println("Genesis 멈춥니다.");
	}

	@Override
	void turnoff() {
		System.out.println("Genesis 시동을 끕니다.");
	}
	@Override
	void washCar() {
		System.out.println("세차를 합니다.");
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
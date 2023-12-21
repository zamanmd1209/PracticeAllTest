package javaAll;

public class Printer<T> {

	T thinngToPrint;

	public Printer(T thingToPrint) {

		this.thinngToPrint = thingToPrint;
	}

	public void print() {
		System.out.println(thinngToPrint);

	}

}

package org.posJava.aula2.clock;

public class TesteClock {

	public static void main(String[] args) throws InterruptedException {

		ClockDisplay meuRelogio = new ClockDisplay(17, 40);

		while (true) {
			System.out.println(meuRelogio);
			meuRelogio.tickTime();
			Thread.sleep(500);
		}
	}
}

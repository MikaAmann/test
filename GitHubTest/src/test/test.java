package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		System.out.println(
				"Bitte entscheiden Sie, welche der folgenden Berechnungen Sie ausführen möchten:\n 1) Sparplan mit Zinseszins\n "
						+ "2) Sparplan ohne Zinseszins\n 3) Erforderliche Dauer eines Sparziels mit Zinseszins");
		Scanner sc = new Scanner(System.in);
		int eingabe1 = sc.nextInt();

		if (eingabe1 == 1) {

			System.out.println("Sie wählten Option " + eingabe1 + ".\n");

			System.out.println("Bitte geben Sie Ihr Startguthaben ein: ");

			double guthaben = sc.nextInt();

			System.out.println("Bitte geben Sie den Zinssatz (in %) ein: ");
			double zins = sc.nextInt();

			System.out.println("Bitte geben Sie die Laufzeit (in Jahren) ein: ");
			int jahre = sc.nextInt();

			for (int i = 1; i <= jahre; i++) {

				guthaben *= (1 + (zins / 100));

				guthaben += 1000.;

				System.out.println("Guthaben nach dem " + i + ". Jahr: " + guthaben);

			}
		}

		else if (eingabe1 == 2) {

			System.out.println("Sie wählten Option " + eingabe1 + ".\n");

			System.out.println("Bitte geben Sie Ihr Startguthaben ein: ");

			double guthaben = sc.nextInt();

			System.out.println("Bitte geben Sie den Zinssatz (in %) ein: ");
			double zins = sc.nextInt();

			System.out.println("Bitte geben Sie die Laufzeit (in Jahren) ein: ");
			int jahre = sc.nextInt();

			for (int i = 0; i < jahre; i++) {

				double zinsWert = (i * 1000 * (zins / 100));

				guthaben += 1000.0 + zinsWert;

				System.out.println("Guthaben nach dem " + (i + 1) + ". Jahr: " + guthaben);

			}
		}

		else if (eingabe1 == 3) {

			System.out.println("Sie wählten Option " + eingabe1 + ".\n");
			

			System.out.println("Bitte geben Sie Ihr Startguthaben ein: ");

			double guthaben = sc.nextInt();

			System.out.println("Bitte geben Sie den Zinssatz (in %) ein: ");
			double zins = sc.nextInt();

			System.out.println("Bitte geben Sie Ihr Sparziel an: ");
			int sparZiel = sc.nextInt();

			int i = 0;

			while (guthaben <= sparZiel) {

				guthaben *= (1 + (zins / 100));

				guthaben += 1000.;

				i++;

			}

			System.out.println("Guthaben nach dem " + i + ". Jahr: " + guthaben);
		}

		sc.close();
	}

}

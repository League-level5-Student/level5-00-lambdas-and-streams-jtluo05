package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.

		printCustomMessage((s) -> {
			String good = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				good += s.charAt(i) + "";

			}
			System.out.println(good);
		}, "Jordan");
		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			String f = "";
			String g = "";
			for (int i = 0; i < s.length(); i++) {
				s = s.toLowerCase();
				if (i % 2 == 1) {
					f = s.charAt(i) + "";
					f = f.toUpperCase();
					g = g + f;
				} else {
					g = g + s.charAt(i) + "";
				}
			}
			System.out.println(g);
		}, "Jordan");
		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s) -> {
			String good = "";
			for (int i = 0; i < s.length(); i++) {
				good += s.charAt(i) + "";
				good += ".";
			}
			System.out.println(good);
		}, "Jordan");
		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((s) -> {
			String good = "";
			for (int i = 0; i < s.length(); i++) {
				if (s.contains("a")) {
						
					good=s.substring(0, s.indexOf("a"))+s.substring(s.indexOf("a")+1);
				} else if (s.contains("e")) {
					good=s.substring(0, s.indexOf("e"))+s.substring(s.indexOf("a")+1);
				} else if (s.contains("i")) {
					good=s.substring(0, s.indexOf("i"))+s.substring(s.indexOf("a")+1);
				} else if (s.contains("o")) {
					good=s.substring(0, s.indexOf("o"))+s.substring(s.indexOf("a")+1);
				} else if (s.contains("u")) {
					good=s.substring(0, s.indexOf("u"))+s.substring(s.indexOf("a")+1);
				}
			}
			System.out.println(good);
		}, "Jordan");
	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}

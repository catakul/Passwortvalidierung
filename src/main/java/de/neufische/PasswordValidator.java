package de.neufische;

public class PasswordValidator {
	static char ch;

	public static void main(String[] args) {
		System.out.println("Passwortvalidierung");
		PasswordValidator.containsNumbers("StringWith12345");
	}

	public static boolean isPasswordLongEnough(String s) {
		if (s.length() <= 10) {
			return false;
		}
		return true;
	}

	public static boolean containsLetters(String str) {
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				return true;
			} else if (Character.isLowerCase(ch)) {
				return true;
			}
		}
		return false;
	}

	public static boolean containsNumbers(String str) {
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			for (int j = 0; j < 10; j++) {
				if (Character.toString(ch).equals("" + j)) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean isSimple(String str) {
		if (str.contains("password") || (str.contains("123456"))) {
			return true;
		}
		return false;
	}

}
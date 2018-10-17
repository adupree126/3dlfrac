package lsys;


public class Ruleset {
	private static final String [] defaultValues = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	
	private String [] values;
	
	public Ruleset() {
		values = defaultValues.clone();
	}
	
	
	public void addRule(char c, String value) throws IllegalArgumentException  {
		values[getKeyIndex(c)] = value;
	}
	
	public String applyTo(String input) {
		StringBuilder builder = new StringBuilder();
		for (char c : input.toCharArray()) {
			builder.append(encode(c));
		}
		return builder.toString();
	}
	
	private String encode(char c) {
		try {
			return values[getKeyIndex(c)];
		} catch(IllegalArgumentException e) {
			return "" + c;
		}
	}
	
	private int getKeyIndex(char c) throws IllegalArgumentException {
		switch(c) {
		case 'a': return 0;
		case 'b': return 1;
		case 'c': return 2;
		case 'd': return 3;
		case 'e': return 4;
		case 'f': return 5;
		case 'g': return 6;
		case 'h': return 7;
		case 'i': return 8;
		case 'j': return 9;
		case 'k': return 10;
		case 'l': return 11;
		case 'm': return 12;
		case 'n': return 13;
		case 'o': return 14;
		case 'p': return 15;
		case 'q': return 16;
		case 'r': return 17;
		case 's': return 18;
		case 't': return 19;
		case 'u': return 20;
		case 'v': return 21;
		case 'w': return 22;
		case 'x': return 23;
		case 'y': return 24;
		case 'z': return 25;
		default: throw new IllegalArgumentException("Bad rule key lookup: " + c);
		}
	}
}

package org.tfa.test.matching;

public class Main {

	public static void main(String[] args) {
		Matcher matcherTest = new Matcher();
		String result = matcherTest.getBestMatch();
		System.out.print(result);
	}

}

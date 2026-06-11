package com.javatechie.sms.api.service;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {

	static char firstRepeatedChar(String str) {
		Map<Character, Integer> charMap = new HashMap<>();
		char firstRepeatChar = '0';
		char[] ch = str.toLowerCase().toCharArray();

		for (char c : ch) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			if (entry.getValue() == 1) {
				firstRepeatChar = entry.getKey();
				System.out.print(firstRepeatChar);
				break;
			}
		}
		return firstRepeatChar;
	}

	public static void main(String[] args) {
		
		firstRepeatedChar("Success");

	}

}

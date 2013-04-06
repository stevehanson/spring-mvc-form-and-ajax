package com.codetutr.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.codetutr.domain.Person;

@Service
public class RandomPersonGeneratorImpl implements RandomPersonGenerator {

	public Person generate() {
		Person person = new Person();
		person.setName(randomName());
		person.setAge(randomAge());
		return person;
	}

	/**
	 * @return number between 10 and 110
	 */
	private Integer randomAge() {
		Random random = new Random();
		return 10 + random.nextInt(100);
	}

	private String randomName() {
		String[] names = {"Nikolaus Otto", "Robert Ford", "Gottlieb Daimler", "Lt. General Masaharu Homma"};
		Random random = new Random();
		return names[random.nextInt(names.length)];
	}
}

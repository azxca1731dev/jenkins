package com.example.azxca1731.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MinusServiceTests {
	@Autowired
	private MinusService minusService;

	@Test
	public void testMinus(){
		int a = 1;
		int b = 2;
		assertEquals(minusService.minus(a, b),a+b);
	}
}

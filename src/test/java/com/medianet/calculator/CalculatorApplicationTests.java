package com.medianet.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CalculatorApplicationTests {
		private Calculator calculator = new Calculator();
		@Test
		public void testSum() {
			assertEquals(5, calculator.sum(2, 3));
		}
	}
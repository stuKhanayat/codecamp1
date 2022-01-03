package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	MathUtils mathutils;
	@BeforeEach
	void init() {
			 mathutils=new MathUtils();
		}
	//addition
	@Test
	void add() {
		assertEquals(-500,mathutils.add(0,-500));
	}
	@Test
	void add1() {
		assertEquals(-499,mathutils.add(0,-499));
	}
	@Test
	void add2() {
		assertEquals(0,mathutils.add(0,0));
	}
	@Test
	void add3() {
		assertEquals(500,mathutils.add(0,500));
	}
	@Test
	void add4() {
		assertEquals(499,mathutils.add(0,499));
	}
	//subtraction
	@Test
	void sub() {
		assertEquals(-500,mathutils.subtract(-500,0));
	}
	@Test
	void sub1() {
		assertEquals(-499,mathutils.subtract(-499,0));
	}
	@Test
	void sub2() {
		assertEquals(0,mathutils.subtract(0,0));
	}
	@Test
	void sub3() {
		assertEquals(500,mathutils.subtract(500,0));
	}
	@Test
	void sub4() {
		assertEquals(499,mathutils.subtract(499,0));
	}
	//division
	@Test
	void div() {
		assertEquals(-5,mathutils.divide(-500,100));
	}
	@Test
	void div1() {
		assertEquals(-4.99,mathutils.divide(-499,100));
	}
	@Test
	void div2() {
		assertEquals(0,mathutils.divide(0,100));
	}
	@Test
	void div3() {
		assertEquals(5,mathutils.divide(500,100));
	}
	@Test
	void div4() {
		assertEquals(4.99,mathutils.divide(499,100));
	}
	@Test
	void div5() {
		assertEquals(-0.2,mathutils.divide(100,-500));
	}
	@Test
	void div6() {
		assertEquals(-0.20040080160320642,mathutils.divide(100,-499));
	}
	@Test
	void div7() {
		
		assertThrows(ArithmeticException.class,()->mathutils.divide(100, 0));
		
	}
	@Test
	void div8() {
		assertEquals(0.2,mathutils.divide(100,500));
	}
	@Test
	void div9() {
		assertEquals(0.20040080160320642,mathutils.divide(100,499));
	}
//multiplication
	
	@Test
	void mul() {
		assertEquals(0,mathutils.multiply(0,500));
	}
	@Test
	void mul1() {
		assertEquals(0,mathutils.multiply(0,499));
	}
	@Test
	void mul2() {
		assertEquals(0,mathutils.multiply(0,-500));
	}
	@Test
	void mul3() {
		assertEquals(0,mathutils.multiply(0,-499));
	}
	@Test
	void mul4() {
		assertEquals(0,mathutils.multiply(0,0));
	}
	//exponent
	@Test
	void exp() {
		assertEquals(1,mathutils.exponent(-500,0));
	}
	@Test
	void exp1() {
		assertEquals(1,mathutils.exponent(-499,0));
	}
	@Test
	void exp2() {
		
		assertThrows(IllegalArgumentException.class,()->mathutils.exponent(0, 0));
		
	}
	@Test
	void exp3() {
		assertEquals(1,mathutils.exponent(500,0));
	}
	@Test
	void exp4() {
		assertEquals(1,mathutils.exponent(499,0));
	}
	@Test
	void exp5() {
		assertThrows(IllegalArgumentException.class,()->mathutils.exponent(0,-500));
	}
	@Test
	void exp6() {
		assertThrows(IllegalArgumentException.class,()->mathutils.exponent(0,-499));
	}
	@Test
	void exp7() {
		assertEquals(0,mathutils.exponent(0,500));
	}
	@Test
	void exp8() {
		assertEquals(0,mathutils.exponent(0,499));
	}







	
	
	
}

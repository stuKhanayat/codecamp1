package io.javabrains;

public class MathUtils {
	public int add(int a,int b) {
		return a+b;
	}
	
	
	public int subtract(int a,int b) {
		return a-b;
	}
	public double multiply(int a,int b) {
		return a*b;
	}
	public double divide(double a,double b) {
		if(b==0)
		{org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(MathUtils.class);
		logger.info("b cannot be 0");
		throw new ArithmeticException("b cannot be 0"); 
		}
		return a/b;
	}
	public double exponent(int a ,int b) {
		if(a==0 && b==0)
		{org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(MathUtils.class);
		logger.info("Both a and b cannot be 0,This is undefined");
		throw new IllegalArgumentException("Both a and b cannot be 0,This is undefined"); 
		}
		
		else if(a==0 && b<0)
		{org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(MathUtils.class);
		logger.info("b cannot be negative when a is 0");
		throw new IllegalArgumentException("b cannot be negative when a is 0"); 
		}
		else
			return Math.pow(a, b);
			
		
		
}
}

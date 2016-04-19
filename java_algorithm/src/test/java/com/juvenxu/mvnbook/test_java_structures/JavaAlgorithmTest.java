package com.juvenxu.mvnbook.test_java_structures;




import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.juvenxu.mvnbook.java_structures.*;

/**
 * Unit test for simple App.
 */
public class JavaAlgorithmTest 
    extends TestCase
{
	
	public void testSayHello(){
		HelloWorld helloWorld=new HelloWorld();
		String result=helloWorld.sayHello();	
	}
	public void testPerson(){ 
		Person testperson =new Person();
		testperson.setName("fgsh");
		testperson.setAge(15);
		testperson.info(); 
		
	}
	public void testRecursion(){
		Recursion testrecursion=new Recursion(12);
		System.out.println(testrecursion.Result);
		int f =testrecursion.recursionExample(13);
		System.out.println(f);
	}
	public void testLogGcd(){
		LogGcd testloggcd=new LogGcd(50,15);
		testloggcd.logGcdResultSecond();
		System.out.println("the reusult is "+testloggcd.result); 
	}
	
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public JavaAlgorithmTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( JavaAlgorithmTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}

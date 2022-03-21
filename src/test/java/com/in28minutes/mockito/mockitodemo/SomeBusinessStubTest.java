package com.in28minutes.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessStubTest {

	@Test
	public void testFindGreatestFromAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

}

class DataServiceStub implements DataService{
	
	@Override 
	public int[] retrieveAllData() {
		return new int[] { 24, 6, 15 };
	}
}

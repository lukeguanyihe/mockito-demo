package com.in28minutes.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessMockTest {

	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl businessImpl;
	
	
	@Test
	public void testFindGreatestFromAllData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 6, 15});
		assertEquals(24, businessImpl.findTheGreatestFromAllData());
	}
	
	
	@Test
	public void testFindGreatestFromAllData_ForOneValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(15, result);
	}

}


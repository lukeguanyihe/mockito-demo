package com.in28minutes.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListTest {

	@Test
	public void test() {
		List listMock = mock(List.class);
		
		when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());
	}
	
	
	@Test
	public void testGet() {
		List listMock = mock(List.class);
		
		when(listMock.get(Mockito.anyInt())).thenReturn("Something");
		assertEquals("Something", listMock.get(0));
		assertEquals("Something", listMock.get(1));
	}

}

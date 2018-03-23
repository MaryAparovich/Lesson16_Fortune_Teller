package by.htp.collections;

import static org.junit.Assert.*;

import org.junit.Test;

import by.htp.collections.logic.Client;

public class TestClient {
	Client client;

	@Test
	public void testInitClient() {
		client = new Client("Masha");
		assertEquals("Masha", client.getName());
}

}

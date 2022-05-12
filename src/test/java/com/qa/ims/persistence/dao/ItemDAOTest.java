package com.qa.ims.persistence.dao;

public class ItemDAOTest {

	
	@Test
	public void testReadAll() {
		List<Item> created = new ArrayList<>();
		itemTest.add(new Item(1L, "pencil", 20D));
		asserEqulas(created, DAO.readALL());
		
	}
	
	
	@Test
	
	
}

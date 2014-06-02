package com.samplemart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samplemart.model.Store;
import com.samplemart.service.StoreService;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		StoreService stockService = (StoreService) appContext.getBean("storeService");

		/** insert **/
		Store store = new Store();
		store.setName("Test");
		store.setPhone("123456789");
		store.setAddress("No Addr");
		stockService.save(store);

		/** select **/
		Store store2 = stockService.findByStoreId(new Integer(1));
		System.out.println(store2.getName());

		/** update **/
		store2.setName("New name");
		stockService.update(store2);

		/** delete **/
		stockService.delete(store2);

		System.out.println("Done");
	}
}

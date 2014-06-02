package com.samplemart.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samplemart.dao.StoreDAO;
import com.samplemart.model.Store;
import com.samplemart.service.StoreService;

@Service("storeService")
public class StoreServiceImpl implements StoreService {

	@Autowired
	StoreDAO storeDAO;
	
	public void save(Store store) {
		storeDAO.save(store);
	}

	public void update(Store store) {
		storeDAO.update(store);
	}

	public void delete(Store store) {
		storeDAO.delete(store);
	}

	public Store findByStoreId(Integer storeId) {
		return storeDAO.findByStoreId(storeId);
	}

	public StoreDAO getStoreDAO() {
		return storeDAO;
	}

	public void setStoreDAO(StoreDAO storeDAO) {
		this.storeDAO = storeDAO;
	}

}

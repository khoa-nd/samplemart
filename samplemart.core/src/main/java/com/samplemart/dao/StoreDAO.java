package com.samplemart.dao;

import com.samplemart.model.Store;

public interface StoreDAO {
	void save(Store stock);
	void update(Store stock);
	void delete(Store stock);
	Store findByStoreId(Integer storeId);
}

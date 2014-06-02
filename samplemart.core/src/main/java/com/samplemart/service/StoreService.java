package com.samplemart.service;

import com.samplemart.model.Store;

public interface StoreService {
	void save(Store stock);
	void update(Store stock);
	void delete(Store stock);
	Store findByStoreId(Integer storeId);
}

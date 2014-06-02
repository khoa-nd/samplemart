package com.samplemart.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.samplemart.dao.StoreDAO;
import com.samplemart.model.Store;
import com.samplemart.utils.CustomHibernateDaoSupport;

@Repository("storeDAO")
public class StoreDAOImpl extends CustomHibernateDaoSupport implements StoreDAO {

	public void save(Store store) {
		getHibernateTemplate().save(store);
	}

	public void update(Store store) {
		getHibernateTemplate().update(store);
	}

	public void delete(Store store) {
		getHibernateTemplate().delete(store);
	}

	public Store findByStoreId(Integer storeId) {
		List list = getHibernateTemplate().find("from Store where id = ?", storeId);
		return (Store) list.get(0);
	}

}

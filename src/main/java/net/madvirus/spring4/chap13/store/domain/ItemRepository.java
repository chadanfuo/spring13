package net.madvirus.spring4.chap13.store.domain;

import model.Item;

public interface ItemRepository {

	Item findById(Integer itemId);

}
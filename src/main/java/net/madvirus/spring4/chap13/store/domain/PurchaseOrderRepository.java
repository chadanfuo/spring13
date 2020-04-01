package net.madvirus.spring4.chap13.store.domain;

import model.PurchaseOrder;

public interface PurchaseOrderRepository {

	void save(PurchaseOrder order);

}
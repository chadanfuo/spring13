package net.madvirus.spring4.chap13.store.domain;

import model.PaymentInfo;

public interface PaymentInfoRepository {

	void save(PaymentInfo paymentInfo);

}

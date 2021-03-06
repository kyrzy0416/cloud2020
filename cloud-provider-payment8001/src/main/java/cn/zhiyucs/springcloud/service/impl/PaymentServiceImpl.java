package cn.zhiyucs.springcloud.service.impl;

import cn.zhiyucs.springcloud.dao.PaymentDao;
import cn.zhiyucs.springcloud.entities.Payment;
import cn.zhiyucs.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

package cn.xrkj.services.impl;

import cn.xrkj.service.OrderServices;
import org.springframework.stereotype.Service;

@Service
public class OrderServicesImpl implements OrderServices {
    @Override
    public int queryList(String orderNo) {
        return 1000;
    }
}

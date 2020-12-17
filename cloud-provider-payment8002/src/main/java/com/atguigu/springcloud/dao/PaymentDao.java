package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by ${yangshun} on 2020/12/11.
 */
@Mapper
public interface PaymentDao {
    Payment getById (@Param("id") Long id);

    int create(Payment payment);
}

package com.higedrum.springboot.web.sample.repository;

import com.higedrum.springboot.web.sample.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 顧客用のリポジトリです。
 *
 * Created by koji on 2016/06/07.
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}

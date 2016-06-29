package com.higedrum.springboot.web.sample.web;

import com.higedrum.springboot.web.sample.domain.Customer;
import com.higedrum.springboot.web.sample.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 顧客画面用のコントローラクラスです
 *
 * Created by koji on 2016/06/29.
 */
@Controller
@RequestMapping("customers")
public class CustomerController {
  @Autowired
  CustomerService customerService;

  @RequestMapping(method = RequestMethod.GET)
  String list(Model model) {
    List<Customer> customers = customerService.findAll();
    model.addAttribute("customers", customers);
    return "customers/list";
  }
}

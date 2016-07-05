package com.higedrum.springboot.web.sample.web;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * 顧客更新用フォーム
 *
 * Created by koji on 2016/06/30.
 */
@Data
public class CustomerForm {

  @NotNull
  @Size(min = 1, max = 127)
  private String firstName;

  @NotNull
  @Size(min = 1, max = 127)
  private String lastName;

}

package com.sasaki.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDataRestController {

    // MySampleBeanインスタンスを自動的にバインド
    @Autowired
    MySampleBean bean;

    /* http://localhost:8080/count にアクセスで呼び出し
     * リロードするごとに表示される数字が１増加する
     */
    @RequestMapping("/count")
    public int count() {
        return bean.count();
    }

}

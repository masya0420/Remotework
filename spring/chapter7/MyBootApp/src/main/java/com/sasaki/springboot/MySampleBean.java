package com.sasaki.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class MySampleBean {

    private int counter = 0;
    private int max = 10;

    // Beanとして登録される際に、autowiredが付けられたコンストラクタによってインスタンスが生成される
    @Autowired
    public MySampleBean(ApplicationArguments args) {
        // アプリケーション実行時の引数をListとして取り出せる
        List<String> files = args.getNonOptionArgs();

        try {
            // 取り出したListの最初の要素を整数に変換してmaxフィールドに格納
            max = Integer.parseInt(files.get(0));

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public int count() {
        counter++;
        counter = counter > max ? 0 : counter;
        return counter;
    }

}

package com.ydl.mybatis.plus.demo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ydl.mybatis.plus.demo.entity.RmwSensitiveWords;
import com.ydl.mybatis.plus.demo.mapper.RmwSensitiveWordsMapper;
import com.ydl.mybatis.plus.demo.service.RmwSensitiveWordsService;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ydl
 * @since 2020/10/19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RmwSensitiveWordsTest {

    @Autowired
    private RmwSensitiveWordsMapper mapper;

    @Autowired
    private RmwSensitiveWordsService service;

    @Test
    public void selectListTest(){
        List<RmwSensitiveWords> rmwSensitiveWords = mapper.selectList(null);
        rmwSensitiveWords.forEach(System.out::println);

    }

    @Test
    public void countTest(){
        System.out.println(service.count());
    }

    /**
     * 分页功能需要设置分页插件 {@link com.ydl.mybatis.plus.demo.config.MybatisPlusConfig}
     */
    @Test
    public void pageTest(){
        //框架自带分页方法
        Page<RmwSensitiveWords> page = new Page<>(1,10);
        service.page(page);
        System.out.println(page.getPages());
        //自定义方法实现分页，
        mapper.getData(page);
        page.getRecords().forEach(System.out::println);
    }

}

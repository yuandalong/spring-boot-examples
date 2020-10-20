package com.ydl.mybatis.plus.demo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ydl.mybatis.plus.demo.entity.RmwSensitiveWords;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ydl
 * @since 2020-10-19
 */
public interface RmwSensitiveWordsMapper extends BaseMapper<RmwSensitiveWords> {

    /**
     * 自定义方法实现分页
     * 如果返回类型是 IPage 则入参的 IPage 不能为null,因为 返回的IPage == 入参的IPage
     * 如果返回类型是 List 则入参的 IPage 可以为 null(为 null 则不分页),但需要你手动 入参的IPage.setRecords(返回的 List);
     * @param rmwSensitiveWordsIpage
     * @return
     */
    @Select("select * from rmw_sensitive_words where status = 2")
    IPage<RmwSensitiveWords> getData(IPage<RmwSensitiveWords> rmwSensitiveWordsIpage);

}

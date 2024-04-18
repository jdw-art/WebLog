package com.jacob.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jacob.weblog.common.domain.dos.CategoryDO;

/**
 * @Author: Jacob
 * @Description: 文章分类接口
 * @Date: 2024/4/18 16:15
 * @Version: 1.0
 */
public interface CategoryMapper extends BaseMapper<CategoryDO> {
    /**
     * 根据用户名查询
     * @param categoryName
     * @return
     */
    default CategoryDO selectByName(String categoryName) {
        // 构建查询条件
        LambdaQueryWrapper<CategoryDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(CategoryDO::getName, categoryName);

        // 执行查询
        return selectOne(wrapper);
    }
}

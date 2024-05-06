package com.jacob.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jacob.weblog.common.domain.dos.WikiDO;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @Author: Jacob
 * @Description: 知识库Mapper接口
 * @Date: 2024/5/6 18:30
 * @Version: 1.0
 */
public interface WikiMapper extends BaseMapper<WikiDO> {

    /**
     * 分页查询
     * @param current
     * @param size
     * @param title
     * @param startDate
     * @param endDate
     * @return
     */
    default Page<WikiDO> selectPageList(Long current, Long size, String title, LocalDate startDate, LocalDate endDate, Boolean isPublish) {
        // 分页对象(查询第几页、每页多少数据)
        Page<WikiDO> page = new Page<>(current, size);

        // 构建查询条件
        LambdaQueryWrapper<WikiDO> wrapper = Wrappers.<WikiDO>lambdaQuery()
                .like(StringUtils.isNotBlank(title), WikiDO::getTitle, title) // like 模块查询
                .ge(Objects.nonNull(startDate), WikiDO::getCreateTime, startDate) // 大于等于 startDate
                .le(Objects.nonNull(endDate), WikiDO::getCreateTime, endDate)  // 小于等于 endDate
                .eq(Objects.nonNull(isPublish), WikiDO::getIsPublish, isPublish) // 发布状态
                .orderByDesc(WikiDO::getWeight) // 按权重倒序
                .orderByDesc(WikiDO::getCreateTime); // 按创建时间倒叙

        return selectPage(page, wrapper);
    }
}

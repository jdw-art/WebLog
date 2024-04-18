package com.jacob.weblog.admin.service.impl;

import com.jacob.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.jacob.weblog.admin.service.AdminCategoryService;
import com.jacob.weblog.common.domain.dos.CategoryDO;
import com.jacob.weblog.common.domain.mapper.CategoryMapper;
import com.jacob.weblog.common.enums.ResponseCodeEnum;
import com.jacob.weblog.common.exception.BizException;
import com.jacob.weblog.common.utils.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @Author: Jacob
 * @Description: 文章分类管理实现类
 * @Date: 2024/4/18 16:18
 * @Version: 1.0
 */
@Service
@Slf4j
public class AdminCategoryServiceImpl implements AdminCategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 添加分类
     *
     * @param addCategoryReqVO
     * @return
     */
    @Override
    public Response addCategory(AddCategoryReqVO addCategoryReqVO) {
        String categoryName = addCategoryReqVO.getName();

        // 先判断该分类是否已经存在
        CategoryDO categoryDO = categoryMapper.selectByName(categoryName);

        if (Objects.nonNull(categoryDO)) {
            log.warn("分类名称： {}, 此分类已存在", categoryName);
            throw new BizException(ResponseCodeEnum.CATEGORY_NAME_IS_EXISTED);
        }

        // 构建 DO 类
        CategoryDO insertCategoryDO = CategoryDO.builder()
                .name(addCategoryReqVO.getName().trim())
                .build();

        // 执行 insert
        categoryMapper.insert(insertCategoryDO);

        return Response.success();
    }
}

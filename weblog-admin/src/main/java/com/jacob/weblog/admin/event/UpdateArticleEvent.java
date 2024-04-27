package com.jacob.weblog.admin.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @Author: Jacob
 * @Description: 文章更新事件
 * @Date: 2024/4/27 21:37
 * @Version: 1.0
 */
@Getter
public class UpdateArticleEvent extends ApplicationEvent {
    /**
     * 文章 ID
     */
    private Long articleId;

    public UpdateArticleEvent(Object source, Long articleId) {
        super(source);
        this.articleId = articleId;
    }
}

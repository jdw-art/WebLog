package com.jacob.weblog.admin.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @Author: Jacob
 * @Description: 文章发布事件
 * @Date: 2024/4/27 21:31
 * @Version: 1.0
 */
@Getter
public class PublishArticleEvent extends ApplicationEvent {
    /**
     * 文章 ID
     */
    private Long articleId;

    public PublishArticleEvent(Object source, Long articleId) {
        super(source);
        this.articleId = articleId;
    }
}

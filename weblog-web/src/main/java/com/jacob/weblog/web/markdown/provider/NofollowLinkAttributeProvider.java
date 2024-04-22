package com.jacob.weblog.web.markdown.provider;

import org.commonmark.node.Link;
import org.commonmark.node.Node;
import org.commonmark.renderer.html.AttributeProvider;

import java.util.Map;

/**
 * @Author: Jacob
 * @Description: 超链接中动态添加 nofollow
 * @Date: 2024/4/22 22:14
 * @Version: 1.0
 */
public class NofollowLinkAttributeProvider implements AttributeProvider {
    /**
     * 网站域名（上线后需要改成自己的域名）
     */
    private final static String DOMAIN = "www.quanxiaoha.com";

    @Override
    public void setAttributes(Node node, String tagName, Map<String, String> attributes) {
        if (node instanceof Link) {
            Link linkNode = (Link) node;
            // 获取链接地址
            String href = linkNode.getDestination();
            // 如果链接不是自己域名，则添加 rel="nofollow" 属性
            if (!href.contains(DOMAIN)) {
                attributes.put("rel", "nofollow");
            }
        }
    }
}

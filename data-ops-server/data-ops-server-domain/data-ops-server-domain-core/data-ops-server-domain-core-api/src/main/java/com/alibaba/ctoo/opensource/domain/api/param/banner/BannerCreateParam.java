package com.alibaba.ctoo.opensource.domain.api.param.banner;

import java.util.Date;

import lombok.Data;

/**
 * banner创建参数
 *
 * @author hyh
 */
@Data
public class BannerCreateParam {

    /**
     * 图片地址
     */
    private String pictureUrl;

    /**
     * 跳转地址
     */
    private String jumpUrl;

    /**
     * 开始时间
     */
    private Date gmtStart;

    /**
     * 结束时间
     */
    private Date gmtEnd;

    /**
     * 排序
     */
    private Integer orderNum;
}
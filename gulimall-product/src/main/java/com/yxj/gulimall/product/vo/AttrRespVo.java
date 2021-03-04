package com.yxj.gulimall.product.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class AttrRespVo extends AttrVo{

    private String catelogName;
    private String groupName;

    private Long[] catelogPath;
}

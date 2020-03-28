package com.example.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tuzhijin
 * @version Id: BaseEntity.java, v 0.1 2020/3/28 23:32 tuzhijin Exp $$
 */
@Data
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -4398393169271702173L;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updateTime;

    private String createBy;

    private String updateBy;

    private String remark;
}

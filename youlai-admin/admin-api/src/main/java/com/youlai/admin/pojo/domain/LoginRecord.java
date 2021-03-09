package com.youlai.admin.pojo.domain;

import com.youlai.common.base.BaseDocument;
import lombok.Data;

/**
 * @author hxr
 * @date 2021-03-09
 */
@Data
public class LoginRecord extends BaseDocument {

    private String description;

    private String clientIP;

    private long elapsedTime;

    private Object message;

    private String token;

    private String username;

    private String loginTime;

    private String region;

}

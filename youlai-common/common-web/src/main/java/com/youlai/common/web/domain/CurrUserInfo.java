package com.youlai.common.web.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 登录用户信息
 *
 * @author haoxr
 * @date 2022/8/5
 */
@Data
@NoArgsConstructor
public class CurrUserInfo {

    private Long userId;

    private Long deptId;

    private String username;

    private List<String> authorities;

}

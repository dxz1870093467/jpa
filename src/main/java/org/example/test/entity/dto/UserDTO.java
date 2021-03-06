package org.example.test.entity.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author zhangxiaodong
 * @date 2021/3/5 17:59
 */
@Data
@Builder
public class UserDTO {
    private String userId;
    private String username;
    private String nickname;
    private String birthday;
}
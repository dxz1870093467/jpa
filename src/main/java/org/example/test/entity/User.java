package org.example.test.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * @author zhangxiaodong
 * @date 2021/3/5 16:29
 */
@Data
@Entity
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String username;
    private String password;
    private String nickName;
    @Past
    private Date birthday;
    @AssertFalse
    private BigDecimal uIndex;
}

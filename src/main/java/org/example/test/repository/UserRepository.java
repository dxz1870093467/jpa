package org.example.test.repository;

import org.example.test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * @author zhangxiaodong
 * @date 2021/3/5 17:57
 */
public interface  UserRepository extends JpaRepository<User, Integer>, QueryDslPredicateExecutor<User> {
}

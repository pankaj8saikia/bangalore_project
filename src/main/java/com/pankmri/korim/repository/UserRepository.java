package com.pankmri.korim.repository;

import com.pankmri.korim.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Project user-activity
 * @Author mgohain
 * @Created 2019-11-12
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findOneByUserName(String userName);
    User findOneByEmail(String email);
    User findOneByContactNumber(String contactNumber);
    List<User> findAll();
    User getOne(Long id);
    User deleteOneById(Long id);
}

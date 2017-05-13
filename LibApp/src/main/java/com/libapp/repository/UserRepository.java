package com.libapp.repository;

import com.libapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by akshayshivanne on 4/22/2017.
 */

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

   List<User> findAll();
}

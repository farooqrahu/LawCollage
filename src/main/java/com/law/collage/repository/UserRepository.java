package com.law.collage.repository;

import com.law.collage.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by farooq on 21/3/18.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}

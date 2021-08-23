package com.ganesh.model.persistence;


import com.ganesh.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, String>{

    @Query("FROM User WHERE username=:na and password=:pwd")
    public User getUser(@Param("na") String username,@Param("pwd") String password);
}

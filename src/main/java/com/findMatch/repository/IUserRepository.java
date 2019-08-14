package com.findMatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.findMatch.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{

	User findByphoneno(Long phoneno);

	User findByprofileId(Long id);
}

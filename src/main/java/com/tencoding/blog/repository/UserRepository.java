package com.tencoding.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tencoding.blog.dto.User;

// DAO
// 여기서는 굳이 Bean 으로 등록 요청을 하지 않아도 등록을 시켜 준다. --> JpaRepository
// @Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
}

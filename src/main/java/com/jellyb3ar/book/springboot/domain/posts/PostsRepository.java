package com.jellyb3ar.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    // JPA에서 제공되지 않는 것
    @Query("SELECT p FROM Posts p ORDER BY p.id")
    List<Posts> findAllDesc();
}

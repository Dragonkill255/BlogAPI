package net.practices.springboot.repository;

import net.practices.springboot.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;





public interface PostRepository extends JpaRepository<Post,Long> {





}

package com.rancho.demo.elasticsearch.repository.repository;

import com.rancho.demo.elasticsearch.repository.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<User, String> {

    User findByName(String name);
}

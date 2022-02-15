package com.example.foo.test.repository.foo;

import com.example.foo.test.entity.foo.FooEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FooRepository extends JpaRepository<FooEntity, Long> {

}

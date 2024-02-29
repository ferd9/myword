package com.myword.app.word;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MyWordRepository extends JpaRepository<MyWordEntity, UUID> {
}

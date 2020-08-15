package com.kudriavtsev.project.socialnetwork.repos;

import com.kudriavtsev.project.socialnetwork.entities.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepo extends JpaRepository<Chat, Integer> {
}

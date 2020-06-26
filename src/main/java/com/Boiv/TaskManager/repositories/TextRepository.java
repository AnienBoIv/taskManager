package com.Boiv.TaskManager.repositories;

import com.Boiv.TaskManager.entities.Text;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextRepository extends JpaRepository<Text, Long> {
}

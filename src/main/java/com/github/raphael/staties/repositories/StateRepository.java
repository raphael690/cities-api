package com.github.raphael.staties.repositories;

import com.github.raphael.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}

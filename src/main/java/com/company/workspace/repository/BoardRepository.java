package com.company.workspace.repository;

import com.company.workspace.model.Board;
import com.company.workspace.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Integer> {


}

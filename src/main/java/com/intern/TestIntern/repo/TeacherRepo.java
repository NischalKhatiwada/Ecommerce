package com.intern.TestIntern.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.TestIntern.modal.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer>{
	List<Teacher> findByName(String name);
}

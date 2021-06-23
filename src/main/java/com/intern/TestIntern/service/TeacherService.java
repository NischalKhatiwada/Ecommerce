package com.intern.TestIntern.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.intern.TestIntern.modal.Teacher;
import com.intern.TestIntern.repo.TeacherRepo;

@Service
public class TeacherService {
	
	@Autowired
	TeacherRepo teacherRepo;
	
	public Teacher addTeacher(Teacher teacher) {
		Teacher savedTeacher=teacherRepo.save(teacher);
		return savedTeacher;
	}

	public List<Teacher> getAllTeacher() {
		List<Teacher> allTeacher=teacherRepo.findAll();
		return allTeacher;
	}

	public Teacher getTeacherById(int id) {
		Teacher teacherById= teacherRepo.findById(id).get();
		return teacherById;
	}

	public void deleteTeacher(int id) {
		teacherRepo.deleteById(id);
		
	}

	public Teacher updateTeacher(Teacher teacher) {
		Teacher updatedTeacher=teacherRepo.save(teacher);
		return updatedTeacher;
	}

	public Teacher updateTeacher2(Teacher teacher, int id) {
		teacher.setId(id);
		Teacher updatedTeacher=teacherRepo.save(teacher);
		return updatedTeacher;
	}

	public List<Teacher> getTeacherByName(String name) {
		List<Teacher> teach=teacherRepo.findByName(name);
		return teach;
	}
	

}

package com.intern.TestIntern.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intern.TestIntern.modal.Teacher;
import com.intern.TestIntern.service.TeacherService;


@RestController
@RequestMapping("/api/teacher")
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;
	
	@PostMapping("/add")
	public Teacher addTeacher(@RequestBody Teacher teacher) {
		Teacher savedTeacher = teacherService.addTeacher(teacher);
		
		return savedTeacher;	
	}
	
	@GetMapping("/allTeacher")
	public List<Teacher> getAllTeacher() {
		List<Teacher> teacherList=teacherService.getAllTeacher();
		return teacherList;
	}
	
	@GetMapping("/getTeacherById/{id}")
	public Teacher getTeacherById(@PathVariable int id) {
		Teacher teacherById= teacherService.getTeacherById(id);
		return teacherById;
	}
	
	@DeleteMapping("/deleteTeacher/{id}")
	public void deleteTeacher(@PathVariable int id) {
		teacherService.deleteTeacher(id);
	}
	
	@PutMapping("/updateTeacher")
	public Teacher updateTeacher(@RequestBody Teacher teacher) {
		Teacher updateTeacher=teacherService.updateTeacher(teacher);
		return updateTeacher;
	}
	
	@PutMapping("/updateTeacher/{id}")
	public Teacher updateTeacher2(@RequestBody Teacher teacher,@PathVariable int id)
	{
		Teacher updateTeacher= teacherService.updateTeacher2(teacher,id);
		return updateTeacher;
	}
	
	@GetMapping("/getTeacherByName/{name}")
	public List<Teacher> getTeacherByname(@PathVariable String name) {
		List<Teacher> teacherByname= teacherService.getTeacherByName(name);
		return teacherByname;
	}
}

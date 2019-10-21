package com.in28Minutes.learning.restfulWebService.restfulwebservice.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Configuration;

import com.in28Minutes.learning.restfulWebService.restfulwebservice.dto.TodoDTO;
import com.in28Minutes.learning.restfulWebService.restfulwebservice.entity.Todo;


@Mapper(componentModel="spring")
public interface TodoMapper {
	
	//TodoMapper INSTANCE = Mappers.getMapper(TodoMapper.class);
	
	TodoDTO toTodoDTO(Todo todoObj);
	
	Todo toToDo(TodoDTO todoDtoObj);
	
	List<TodoDTO> toTodoDTOs(List<Todo> todos );

}

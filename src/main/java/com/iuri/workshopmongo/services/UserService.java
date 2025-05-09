package com.iuri.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iuri.workshopmongo.domain.User;
import com.iuri.workshopmongo.dto.UserDTO;
import com.iuri.workshopmongo.repository.UserRepository;
import com.iuri.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository rep;
	
	public List<User> findAll(){
		return rep.findAll();
	}
	
	public User findById(String id) {
		User user = rep.findById(id).orElse(null);
		if( user == null) {
			throw new ObjectNotFoundException("Objeto nao encontrado");
		}
		return user;
	}
	
	public User insert(User obj) {
		return rep.insert(obj);
	}
	
	public void delete(String id) {
 		findById(id);
 		rep.deleteById(id);
 	}
	
	public User update(User obj) {
 		User newObj = findById(obj.getId());
 		updateData(newObj, obj);
 		return rep.save(newObj);
 	}
 
 	private void updateData(User newObj, User obj) {
 		newObj.setName(obj.getName());
 		newObj.setemail(obj.getemail());
 	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
}

package com.anudip.crud.controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.anudip.crud.entity.User;
import com.anudip.crud.service.UserService;

// user controller to handling all rest api incoming request
@RestController
public class UserController {
	
	@Autowired
	private UserService us;
	
	//save user in db table using rest api PostMapping
	@PostMapping("/saveU")
	public ResponseEntity<User> saveUser(@Valid @RequestBody User user){
		return new ResponseEntity<User>(us.saveUser(user), HttpStatus.CREATED);
	}
	
	// fetch user details from db table using rest api GetMapping
	@GetMapping("/getAllU")
	public List<User> getAll(){
		return us.getAllUser();
	}
	
	// fetch user details from db table using rest api GetMapping based on id
	@GetMapping("/getU/{uid}")
	public ResponseEntity<User> getU(@PathVariable("uid") int uid){
		return new ResponseEntity<User>(us.getUserById(uid),HttpStatus.OK);
	}
	
	//update user details in db table using rest api PutMapping based on id
	@PutMapping("/updateU/{uid}")
	public ResponseEntity<User> updateUser(@PathVariable("uid") int uid, @RequestBody User user){
			return new ResponseEntity<User>(us.updateUserById(user, uid), HttpStatus.OK);
		}
		
		//delete user details in db table using rest api PutMapping based on id
	@DeleteMapping("/deleteU/{uid}")
	public ResponseEntity<String> deleteUser(@PathVariable("uid") int uid){
		us.deleteUserById(uid);
		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
				}
	//get user details by first name
	@GetMapping("/getByFn/{fname}")
	public List<User> getFname(@PathVariable String fname){
		return us.getFname(fname);
	}
	//get user details by last name
	@GetMapping("/getByLn/{lname}")
	public List<User> getLname(@PathVariable String lname){
		return us.getLname(lname);
	}
	//get user details by phone
	@GetMapping("/getByPh/{uphone}")
	public User getPhone(@PathVariable long uphone){
		return us.getPhone(uphone);
	}
}

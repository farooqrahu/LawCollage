package com.law.collage.controller;

import com.law.collage.dto.UserDto;
import com.law.collage.service.UserService;
import com.law.collage.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by farooq on 21/3/18.
 */
@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(Constants.GET_USER_BY_ID)
	public UserDto getUserById(@PathVariable Integer userId) {
		return userService.getUserById(userId);
	}
	
	@RequestMapping(Constants.GET_ALL_USERS)
	public List<UserDto> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(value= Constants.SAVE_USER, method= RequestMethod.POST)
	public void saveUser(@RequestBody UserDto userDto) {
		userService.saveUser(userDto);
	}
}

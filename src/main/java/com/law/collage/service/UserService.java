package com.law.collage.service;

import com.law.collage.dto.UserDto;

import java.util.List;

/**
 * Created by farooq on 21/3/18.
 */
public interface UserService {
    UserDto getUserById(Integer userId);
    void saveUser(UserDto userDto);
    List<UserDto> getAllUsers();
}

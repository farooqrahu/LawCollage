package com.law.collage.converter;

import com.law.collage.dto.UserDto;
import com.law.collage.entity.User;

import java.util.stream.Collectors;

/**
 * Created by farooq on 21/3/18.
 */
public class UserConverter {
	public static User dtoToEntity(UserDto userDto) {
		User user = new User(userDto.getUserName(), null);
		user.setUserId(userDto.getUserId());
		user.setSkills(userDto.getSkillDtos().stream().map(SkillConverter::dtoToEntity).collect(Collectors.toList()));
		return user;
	}

	public static UserDto entityToDto(User user) {
		UserDto userDto = new UserDto(user.getUserId(), user.getUserName(), null);
		userDto.setSkillDtos(user.getSkills().stream().map(SkillConverter::entityToDto).collect(Collectors.toList()));
		return userDto;
	}
}

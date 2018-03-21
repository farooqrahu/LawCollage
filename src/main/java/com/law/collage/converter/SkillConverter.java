package com.law.collage.converter;

import com.law.collage.dto.SkillDto;
import com.law.collage.entity.Skill;

/**
 * Created by farooq on 21/3/18.
 */
public class SkillConverter {
	public static Skill dtoToEntity(SkillDto SkillDto) {
		Skill Skill = new Skill(SkillDto.getSkillName(), null);
		Skill.setSkillId(SkillDto.getSkillId());
		return Skill;
	}

	public static SkillDto entityToDto(Skill skill) {
		return new SkillDto(skill.getSkillId(), skill.getSkillName());
	}
}

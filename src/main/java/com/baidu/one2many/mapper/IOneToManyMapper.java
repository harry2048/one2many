package com.baidu.one2many.mapper;

import com.baidu.one2many.vo.Position;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IOneToManyMapper {
    Position queryPositionTeacherResultMapById(int teacherNo);
}

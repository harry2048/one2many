package com.baidu.one2many;

import com.baidu.one2many.mapper.IOneToManyMapper;
import com.baidu.one2many.vo.Position;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class One2manyApplicationTests {

    @Autowired
    private IOneToManyMapper oneToManyMapper;

    @Test
    void contextLoads() {
        Position position = oneToManyMapper.queryPositionTeacherResultMapById(1);
        Assert.notNull(position, "id为1的职称无数据");

        System.out.println(position);
        position.getTeacherList().forEach(System.out::println);
    }

}

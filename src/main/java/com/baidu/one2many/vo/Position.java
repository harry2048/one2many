package com.baidu.one2many.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Position implements Serializable {
	private int id;
	private String name;
	
	private List<Teacher> teacherList;
 
}
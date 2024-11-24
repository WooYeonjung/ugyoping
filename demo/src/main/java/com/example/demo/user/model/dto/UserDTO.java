package com.example.demo.user.model.dto;

import com.example.demo.common.model.dto.BaseDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO extends BaseDTO{
	private  Long id;
	private  String email;
	private String name;
	private  String profilePicture;
	private  String provider;
	private  String providerId;
	
}

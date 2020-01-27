package com.test.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceResponse<T> {
	private String message;
	private String status;
	private T data;
	
	public ServiceResponse(String message, String status){
		this.message=message;
		this.status=status;
	}
}

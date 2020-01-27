package com.test.sevice;

import java.util.List;


import com.test.model.response.ServiceResponse;


public interface ReaderService {

	public ServiceResponse<List<String>> compareData();

}

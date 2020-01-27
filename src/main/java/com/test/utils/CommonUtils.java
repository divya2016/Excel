package com.test.utils;

import org.springframework.stereotype.Component;

import com.test.constant.Constants;
import com.test.constant.MessageConstants;
import com.test.model.response.ServiceResponse;
@Component
public class CommonUtils {

	public <T> ServiceResponse<T> generateErrorMessage() {
		return new ServiceResponse<>(Constants.ERROR, MessageConstants.ERROR_TRY_AGAIN);
	}

}

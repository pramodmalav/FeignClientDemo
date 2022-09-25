package com.app.feign.util;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceFallback implements FeignServiceUtil{
	
	@Override
    public String getName() {
        return "Something wrong in getName";

}

	@Override
	public String getAddress() {
        return "Something wrong in getAddress";
	}

	@Override
	public String getStatus() {
        return "Something wrong in getStatus";
	}
}
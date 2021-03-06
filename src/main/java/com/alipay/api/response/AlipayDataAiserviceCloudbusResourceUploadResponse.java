package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusCommonResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.resource.upload response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-07 15:30:10
 */
public class AlipayDataAiserviceCloudbusResourceUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6326483318536311151L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private CloudbusCommonResult result;

	public void setResult(CloudbusCommonResult result) {
		this.result = result;
	}
	public CloudbusCommonResult getResult( ) {
		return this.result;
	}

}

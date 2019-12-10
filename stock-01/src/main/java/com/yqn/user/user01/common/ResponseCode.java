package com.yqn.user.user01.common;


public enum ResponseCode {

	UPLOAD_CHUNK(98,"分片上传中"),
	USER_PAY(99,"用户支付"),  
	REQUEST_ERROR(100,"请求出错"), 
	NOT_SIGN(101,"无签名"),  
	SIGN_ERROR(102,"签名错误"),  
	MISSING_PARAMETERS(103,"缺少参数"), 
	TOO_MANY_REQUEST(104,"too many request"), 
	INVALID_REQUEST(105,"invalid request"),
	SIGN_INVALID(106,"签名过期"),
	BACK_LOGIN_INVALID(107,"登录失效，请登录"),  // 后台错误码
	BACK_NOT_PERMISSION(108,"没有此功能的权限，请联系系统超级管理员");   // 后台错误码


    private Integer code;
	private String msg;
	ResponseCode(Integer code, String msg) {
		
		this.code = code;
		this.msg = msg;
	}
	
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	
}

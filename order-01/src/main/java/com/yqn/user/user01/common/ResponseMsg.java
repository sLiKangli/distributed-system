package com.yqn.user.user01.common;


public class ResponseMsg {

	private Integer code;
	private String msg;
	private Object result;
	
	
	public ResponseMsg() {
		
		code = 0;
		msg = "操作成功";
	}
	
	/**
	 * 设置错误消息
	 * 此时的错误码自动为100
	 */
	public void setRequestError(String msg) {
		
		this.code = 100;
		this.msg = msg;
	}
	
	/**
	 * 设置请求结果码
	 */
	public void setRequestError(ResponseCode requestCode) {
	
		this.code = requestCode.getCode();
		this.msg = requestCode.getMsg();
	}

	
	/**
	 * 设置请求成功的结果对象
	 */
	public void setSuccessObject(Object obj) {
		this.code = 0;
		this.result = obj;
	}

	/**
	 * 设置请求成功的结果对象
	 */
	public void setSuccessObject(Object obj, ResponseCode requestCode) {
		this.result = obj;
		this.code = requestCode.getCode();
		this.msg = requestCode.getMsg();
	}

	@Override
	public String toString() {
		return "ResponseMsg{" +
				"code=" + code +
				", msg='" + msg + '\'' +
				", result=" + result +
				'}';
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

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
}

/**
 * 
 */
package com.mpn.json;

/**
 * @author quanzhi
 *
 */
public class UserResponse {
	private int code;
	private String name;
	private Long userId;
	private String message;
	public String getName() {
		return name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
}

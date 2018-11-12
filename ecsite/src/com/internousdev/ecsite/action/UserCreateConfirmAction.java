package com.internousdev.ecsite.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	private String userName;
	public Map<String,Object>session;
	private String errorMassage;

	public String execute(){

		String result=SUCCESS;
		if(!(loginUserId.equals(""))
				&&!(loginPassword.equals(""))
				&&!(userName.equals(""))) {
					session.put("loginUserId", loginUserId);
					session.put("loginPassword",loginPassword);
					session.put("userName",userName);
				}else{
					setErrorMassage("未入力の項目があります。");
					result=ERROR;
				}
				return result;
	}
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserID){
		this.loginUserId = loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void sestLoginPassword(String loginPasword){
		this.loginPassword = loginPassword;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session = session;
	}
	public String getErroeMassage(){
		return errorMassage;
	}
	public void setErrorMassage(String errorMassage){
		this.errorMassage = errorMassage;
	}
}
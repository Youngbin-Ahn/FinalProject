package com.scsa.model.vo;

import java.util.List;

public class UserInfo {
	
	private String userId;
	private String password;
	private String username;
	private String nickname;
	private String userSeqNo;
	private String authorizationCode;
	private String accessToken;
	private String fcmId;
	
	private List<AccountInfo> accountList;
	
	public UserInfo() {
		super();
	}
	
	// 청구 등록시 claimerId 저장용
	public UserInfo(String userId) {
		super();
		this.userId = userId;
	}
	
	// 로그인용
	public UserInfo(String userId, String password, String fcmId) {
		super();
		this.userId = userId;
		this.password = password;
		this.fcmId = fcmId;
	}
	
	// 비밀번호 제외
	public UserInfo(String userId, String username, String nickname, String userSeqNo, String authorizationCode,
			String accessToken, String fcmId) {
		super();
		this.userId = userId;
		this.username = username;
		this.nickname = nickname;
		this.userSeqNo = userSeqNo;
		this.authorizationCode = authorizationCode;
		this.accessToken = accessToken;
		this.fcmId = fcmId;
	}
	
	public UserInfo(String userId, String password, String username, String nickname, String userSeqNo,
			String authorizationCode, String accessToken, String fcmId) {
		super();
		this.userId = userId;
		this.password = password;
		this.username = username;
		this.nickname = nickname;
		this.userSeqNo = userSeqNo;
		this.authorizationCode = authorizationCode;
		this.accessToken = accessToken;
		this.fcmId = fcmId;
	}

	// 이후 생성자는 필요에 따라 추가할 것 //

	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUserSeqNo() {
		return userSeqNo;
	}

	public void setUserSeqNo(String userSeqNo) {
		this.userSeqNo = userSeqNo;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getFcmId() {
		return fcmId;
	}

	public void setFcmId(String fcmId) {
		this.fcmId = fcmId;
	}
	
	

	public List<AccountInfo> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<AccountInfo> accountList) {
		this.accountList = accountList;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", password=" + password + ", username=" + username + ", nickname="
				+ nickname + ", userSeqNo=" + userSeqNo + ", authorizationCode=" + authorizationCode + ", accessToken="
				+ accessToken + ", fcmId=" + fcmId + "]";
	}
	
}

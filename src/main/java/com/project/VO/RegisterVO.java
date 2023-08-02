package com.project.VO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "register")
public class RegisterVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int registerId;
	
	@ManyToOne
	private LoginVO loginVo;

	public int getRegisterId() {
		return registerId;
	}

	public void setRegisterId(int registerId) {
		this.registerId = registerId;
	}

	public LoginVO getLoginVo() {
		return loginVo;
	}

	public void setLoginVo(LoginVO loginVo) {
		this.loginVo = loginVo;
	}
	
}

package com.beini.jwt.service.impl;

import org.springframework.security.core.GrantedAuthority;

/**
 * 权限类型，负责存储权限和角色
 *
 * @author lb_chen
 */
public class GrantedAuthorityImpl implements GrantedAuthority {
	private static final long serialVersionUID = 6888307530821658666L;
	private String authority;

	public GrantedAuthorityImpl(String authority) {
		this.authority = authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String getAuthority() {
		return this.authority;
	}
}

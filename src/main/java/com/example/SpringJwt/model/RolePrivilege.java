package com.example.SpringJwt.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class RolePrivilege extends AuditModel {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private int  allowMask;
	private int denyMask;
	
	 @ManyToOne(fetch=FetchType.EAGER, optional = false)
	    @JoinColumn(name = "category_id", nullable = false)
	    @OnDelete(action = OnDeleteAction.CASCADE)
	    private PrivilegeCategory category;
	 
	 @ManyToOne(fetch=FetchType.EAGER, optional = false)
	    @JoinColumn(name = "role_id", nullable = false)
	    @OnDelete(action = OnDeleteAction.CASCADE)
	    @JsonIgnore
	    private Role role;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAllowMask() {
		return allowMask;
	}

	public void setAllowMask(int allowMask) {
		this.allowMask = allowMask;
	}

	public int getDenyMask() {
		return denyMask;
	}

	public void setDenyMask(int denyMask) {
		this.denyMask = denyMask;
	}

	public PrivilegeCategory getCategory() {
		return category;
	}

	public void setCategory(PrivilegeCategory category) {
		this.category = category;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}

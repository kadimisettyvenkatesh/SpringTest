package com.example.SpringJwt.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
public class Privilege extends AuditModel {

	@Id
	@GeneratedValue
	private Long id;
    private String name;
    private String description;
    private int privValue;
    
    @ManyToOne(fetch=FetchType.EAGER, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private PrivilegeCategory category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrivValue() {
		return privValue;
	}

	public void setPrivValue(int privValue) {
		this.privValue = privValue;
	}

	public PrivilegeCategory getCategory() {
		return category;
	}

	public void setCategory(PrivilegeCategory category) {
		this.category = category;
	}

}

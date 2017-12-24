package com.management.hospital.model;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    @Id
    private Long id;
    
    private String name;

    public Role() {
    }
    
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

	@Override
	public String toString() {
		return "Role [roleId=" + id + ", role=" + name + "]";
	}
}

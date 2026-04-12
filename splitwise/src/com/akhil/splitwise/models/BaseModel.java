package com.akhil.splitwise.models;

import java.util.Date;

@Getter
@Setter
@MappedSuperClass
@EntityListeners(AuditingEntityListener.class)
public class BaseModel {
	@Id
	@GeneratedVale(strategy = GenerationType.Identity)
	private long id;
	@CreatedDate
	private Date createdDate;
	@LastModifiedDate
	private Date lastModifiedDate;
	// Auditing fields
}



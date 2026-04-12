package com.akhil.splitwise.models;

@Getter
@Setter
@Entity
@Table(name="users")
public class User extends BaseModel {
	private String userName;
	private String hashedPassword;
	private String phoneNumber;
}

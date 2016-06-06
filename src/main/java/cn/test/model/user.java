package cn.test.model;

public class user {
	
	private int account_id;
	private String account;
	private String password;
	private String name;
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "user [account_id=" + account_id + ", account=" + account + ", password=" + password + ", name=" + name
				+ "]";
	}
	
	

}

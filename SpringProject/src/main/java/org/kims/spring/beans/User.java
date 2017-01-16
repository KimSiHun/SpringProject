package org.kims.spring.beans;

public class User
{
	private String	userName;

	private String	userEMail;

	private String	startPhoneNum;
	private String	middlePhoneNum;
	private String	endPhoneNum;

	private String	userPhoneNum;

	public User()
	{
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String userEMail, String startPhoneNum, String middlePhoneNum, String endPhoneNum)
	{
		super();
		this.userName = userName;
		this.userEMail = userEMail;
		this.startPhoneNum = startPhoneNum;
		this.middlePhoneNum = middlePhoneNum;
		this.endPhoneNum = endPhoneNum;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getUserEMail()
	{
		return userEMail;
	}

	public void setUserEMail(String userEMail)
	{
		this.userEMail = userEMail;
	}

	public String getStartPhoneNum()
	{
		return startPhoneNum;
	}

	public void setStartPhoneNum(String startPhoneNum)
	{
		this.startPhoneNum = startPhoneNum;
	}

	public String getMiddlePhoneNum()
	{
		return middlePhoneNum;
	}

	public void setMiddlePhoneNum(String middlePhoneNum)
	{
		this.middlePhoneNum = middlePhoneNum;
	}

	public String getEndPhoneNum()
	{
		return endPhoneNum;
	}

	public void setEndPhoneNum(String endPhoneNum)
	{
		this.endPhoneNum = endPhoneNum;
	}

	StringBuilder sb = new StringBuilder();

	public String makePhoneNum()
	{
		sb = sb.append(startPhoneNum).append("-").append(middlePhoneNum).append("-").append(endPhoneNum);
		userPhoneNum = String.valueOf(sb);

		return userPhoneNum;
	}

	

}

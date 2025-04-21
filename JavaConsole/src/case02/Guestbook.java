package case02;

import java.util.Date;

// 訪客留言版
public class Guestbook {
	
	private String userName;
	private Date date;
	
	public Guestbook(String userName) {
		this.userName = userName;
		this.date = new Date();
	}

	public String getUserName() {
		return userName;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Guestbook [userName=" + userName + ", date=" + date + "]";
	}
	
	
	
}

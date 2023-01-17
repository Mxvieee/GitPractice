package dto;

public class KadaiAccount {
	private String mail;
	private String salt;
	private String password;
	private String hashedPassword;
	private int id;
	private String name;
	private String gakunen;
	private String gakka;
	public String getMail() {
		return mail;
	
	}
	public KadaiAccount(String mail, String salt, String password, String hashedPassword, int id, String name,
			String gakunen, String gakka) {
		super();
		this.mail = mail;
		this.salt = salt;
		this.password = password;
		this.hashedPassword = hashedPassword;
		this.id = id;
		this.name = name;
		this.gakunen = gakunen;
		this.gakka = gakka;
		
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHashedPassword() {
		return hashedPassword;
	}
	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		public String getGakunen() {
		return gakunen;
	}
	public void setGakunen(String gakunen) {
		this.gakunen = gakunen;
	}
	public String getGakka() {
		return gakka;
	}
	public void setGakka(String gakka) {
		this.gakka = gakka;
	}
}
	
	
	
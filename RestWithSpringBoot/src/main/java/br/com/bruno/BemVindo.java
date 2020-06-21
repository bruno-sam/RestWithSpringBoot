package br.com.bruno;

public class BemVindo {
	
	private final long id;
	private final String content;
	
	public BemVindo(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	

}

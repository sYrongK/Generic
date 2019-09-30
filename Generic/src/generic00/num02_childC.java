package generic00;

public enum num02_childC implements num01_parentC{
	
	KOREAN("한국", "서울"), GERMANY("독일", "베를린");
	
	private final String name;
	private final String capital;
	
	private num02_childC(String name, String capital) {
		this.name = name;
		this.capital = capital;
	}

	@Override
	public String getName() {
		String str = "";
		for (num02_childC c : num02_childC.values())
			str += c.name + " ";		
		return str;
	}

	@Override
	public String getCapital() {
		String str = "";
		for (num02_childC c : num02_childC.values())
			str += c.capital + " ";	
		return capital;
	}
	
}

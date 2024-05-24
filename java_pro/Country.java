package TNS.Newpackage.Country;

public class Country {

	public String country_name;
	
	public Country() {
		this.country_name = "unknown";
	}

	public Country(String country_name) {
		this.country_name = country_name;
	}

	public int getCountryLength() {
		return country_name.length();
	}
	
	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
		
	public static void 	main(String[] arge) {
		Country defaultCountry = new Country();
		Country specifiCountry = new Country("India");
		Country specifiCountry1 = new Country("Germany");
		
		System.out.println("Country name: "+defaultCountry.getCountry_name()+", length: "+defaultCountry.getCountryLength());
		System.out.println("Country name: "+specifiCountry.getCountry_name()+", length: "+specifiCountry.getCountryLength());
		System.out.println("Country name: "+specifiCountry1.getCountry_name()+", length: "+specifiCountry1.getCountryLength());
	}
}

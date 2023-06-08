package singleton;

import java.util.List;

import dto.AddressDto;

public class Singleton {
	private static Singleton sc = null;
	public List<AddressDto> addressList = null;
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(sc== null) {
			sc= new Singleton();
		}
		return sc;
	}
}

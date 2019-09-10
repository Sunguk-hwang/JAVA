package sec01.exam02;

public class Key {
	
	//field
	public int number;
	
	
	//constructor
	public Key(int number) {
		this.number = number;
	}
	
	//method
	@Override
	public int hashCode() {
		return number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key key = (Key) obj;
			if(number == key.number) {
				return true;
			}
		}
		return false;
	}
}

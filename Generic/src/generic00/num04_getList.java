package generic00;

import java.util.ArrayList;
import java.util.List;

public class num04_getList implements num03_enumSetType<num02_childC>{
	
	@Override
	public List<num02_childC> getName() {
		ArrayList<num02_childC> list = new ArrayList<num02_childC>();
		String str = "";
		for (num01_parentC f : num02_childC.values()) {
			str += f.getName() + " ";
		}
		System.out.println(str);
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println("하하 모르겠넹");
	}
}

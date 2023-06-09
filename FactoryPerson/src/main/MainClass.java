package main;

import java.util.ArrayList;
import java.util.List;

import factory.PersonFactory;
import types.AbstractItem;
import types.Atype;
import types.Btype;

public class MainClass {

	public static void main(String[] args) {
		PersonFactory pf = new PersonFactory();
		pf.create(new Atype());
		
		pf.mWeapon.drawWeapon();
		pf.mBomb.drawBomb();
		
		List<PersonFactory> list = new ArrayList<PersonFactory>();
		
		AbstractItem objArr[] = {new Atype(),new Atype(),new Btype()};
		
		for (int i=0; i<objArr.length;i++) {
			PersonFactory p = new PersonFactory();
			p.create(objArr[i]);
			list.add(p);
		}
		for (int i =0; i<list.size(); i++) {
			PersonFactory p = list.get(i);
			p.mWeapon.drawWeapon();
			p.mBomb.drawBomb();
		}
	}

}

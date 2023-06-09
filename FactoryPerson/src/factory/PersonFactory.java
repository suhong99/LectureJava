package factory;

import bomb.Bomb;
import types.AbstractItem;
import weapon.Weapon;

public class PersonFactory {
	public Weapon mWeapon;
	public Bomb mBomb;
	
	public void create(AbstractItem ai) {
		mWeapon = ai.createWeapon();
		mBomb = ai.createBomb();
	}
}

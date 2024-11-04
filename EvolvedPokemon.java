package kadai10;

public class EvolvedPokemon extends Pokemon {
	//オーバーライド
	
	public void attack() {
		System.out.println("進化後の攻撃");
	//スーパークラスのattackメソッド	
		super.attack();
	}

    public void heal() {
	    System.out.println("進化後は回復した");
	    }
}

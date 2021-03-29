package spring.service.dice.play;

import spring.service.dice.Dice;
import spring.service.dice.impl.DiceAImpl;

/*
 *	FileName : Player01.java
 *	ㅇ DiceA 을 가지고(?, has a :: Association Relationship)있는 Player Object Modeling
 *  ㅇDiceA 를 사용 합을 리턴하는 Method 정의  
 */
public class Player02 {
	
	///Field
	private Dice dice;    // 1. 이렇게 field 에 Dice를 인터페이스로 선언하면, 여러개의 주사위를 코드수정 하나도 없이 가지고 놀 수 있다  (재사용성이 높아진다)
	//2. 근데 이렇게 선언까지는 가지지 못한다 _ 주입이 되어야 가질 수 있다  (생성자, setter)
	// 이 두가지가 DI ( 의존: 필요로 하는 쪽_player  주입: setter 나 생성자로 주사위를 주입)
	private int totalValue;
	
	///Constructor Method
	public Player02() {
	}
	
	public Player02(Dice dice) {
		this.dice = dice;
	}

	///Method (getter/setter)
	public Dice getDice() {
		return dice;
	}
	public void setDice(Dice dice) {
		this.dice = dice;
	}
	public int getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}
	
	//==> count 만큼 주사위를 굴려서 합을 후하는 행위    _ 몇번 돌릴지 count 를 중심으로 가지고 논다 /작동된다 
	// 이 클래스에서의 결정적인 코드
	
	public void playDice(int count){
		
		System.out.println("==>"+getClass().getName()+".playDice() start....");

		for (int i = 0; i < count; i++) {
			dice.selectedNumber();
			System.out.println("::[ "+dice.getClass().getName()+" ] 의 선택된수 : "+dice.getValue());
			totalValue += dice.getValue(); 
		}
		
		System.out.println("==>"+getClass().getName()+".playDice() end....");
	}

}//end of class
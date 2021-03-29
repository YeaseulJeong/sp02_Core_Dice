package spring.service.dice.play;

import spring.service.dice.DiceA;

/*
 *	FileName : Player01.java
 *	ㅇ DiceA 을 가지고(?, has a :: Association Relationship)있는 Player Object Modeling
 *  ㅇDiceA 를 사용 합을 리턴하는 Method 정의  
 */
public class Player01 {
	
	///Field
	private DiceA diceA = new DiceA();    // 이렇게 코드를 짜면 절대로 안된다 _ 오로지 DiceA만 가지고 놀겠다는 뜻 
	private int totalValue;
	
	///Constructor Method
	public Player01() {
	}
	
	///Method (getter/setter)
	public DiceA getDiceA() {
		return diceA;
	}
	public void setDiceA(DiceA diceA) {
		this.diceA = diceA;
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
			diceA.selectedNumber();
			System.out.println("::[ "+diceA.getClass().getName()+" ] 의 선택된수 : "+diceA.getValue());
			totalValue += diceA.getValue(); 
		}
		
		System.out.println("==>"+getClass().getName()+".playDice() end....");
	}

}//end of class
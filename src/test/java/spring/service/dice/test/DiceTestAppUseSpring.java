package spring.service.dice.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import spring.service.dice.play.Player02;


public class DiceTestAppUseSpring {
	public static void main(String[] args) {
		
		//xml 하나씩 하면서 이곳에서 하나씩 테스트한다...
		
		
		// 1. DI 컨테이너 생성... 이때 주문서 함께 읽도록 같이 저장한다 
		// 주문서를 받아서 Bean 생성하고 저장
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/resources/config/diceservice.xml"));
		
		
		//2. 컨테이너에서 생성된 객체를 받아옴
		Player02 player01 = (Player02)factory.getBean("player01");
		
		//3. 받아온 빈의 메서드를 호출   
		player01.playDice(3);
		System.out.println("======================");
		System.out.println("선택된 주사위 수의 통합은 :"+ player01.getTotalValue());
		System.out.println("=============\n\n");
		
		
		//2. 컨테이너에서 생성된 객체를 받아옴
		Player02 player02 = (Player02)factory.getBean("player02");
		
		//3. 받아온 빈의 메서드를 호출  
		player02.playDice(3);
		System.out.println("======================");
		System.out.println("선택된 주사위 수의 통합은 :"+ player02.getTotalValue());
		System.out.println("=============\n\n");
		
		
		
		Player02 player03 = (Player02)factory.getBean("player03");
		player03.playDice(3);
		System.out.println("======================");
		System.out.println("선택된 주사위 수의 통합은 :"+ player03.getTotalValue());
		System.out.println("=============\n\n");
		
		
		Player02 player04 = (Player02)factory.getBean("player04");
		player04.playDice(3);
		System.out.println("======================");
		System.out.println("선택된 주사위 수의 통합은 :"+ player04.getTotalValue());
		System.out.println("=============\n\n");
	
	}
	
}//end of class
//Dog 클래스를 사용해보자!!

//클래스를 패키지로 선언하면, 이 패키지의 위치는 
package com.tje.use;
//Dog 과 UseDog은 서로 다른 패키지에 존재한다
//따라서 UseDog 클래스에게 Dog의 위치를 알려줘야 한다

//import란? 현재 클래스에서 사용하려는 목적 클래스의 위치를 즉 경로를 알려주는 코드!!
//Write Once, Run Anywhere!!
import com.tje.animal.Dog;

class UseDog {
	public static void main(String[] args) {
		String name= new Dog().getName();
		System.out.println("강아지명은"+name);
	}
}

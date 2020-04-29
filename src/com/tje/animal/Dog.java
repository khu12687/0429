//강아지를 정의한다!!
//현재 원본소스를 원하는 경로에 .class컴파일 결과물을 넣으려면 컴파일시 그 경로를 지정해야한다.
/*클래스를 디렉토리에 담아서 관리할때, 자바분야에서는 이를 디렉토리라 하지 않고 패키지라한다!!
아래의 Dog클래스는 tje/animal에 들어 있으므로 그 경로를 명시해야 한다.. 이때 패키지간 구분은
. 표기한다!!

-d 옵션을 이용하면, class 이 생성될때 패키지로 명시한 디렉토리들이 자동생성!!
*/
package com.tje.animal;
class Dog{
	String name ="뽀삐";
	int age = 5;

	public int getAge(){
			return age;
	}
	public String getName(){
		return name;
	}
}

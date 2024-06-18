package chp9;
public class Baby implements Papa, Mama {
//Papa의 모든 함수 정의해야됨 
	public void genderFather() {
		System.out.println("나는 아버지입니다.");
		
	}
	//Mama의 모든 함수 정의해야됨
	public void genderMother() {
		System.out.println("나는 어머니입니다.");
	}
	//Baby클래스의 함수
	public void printInfo() {
		System.out.println("나는 아기입니다.");
	}
}



public class GitTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Hello World!!");
		
		TestA a = new TestA("AAA");
		System.out.println(a.getName());
	}

}

class TestA {
	String name;
	
	TestA(String name){
		this.name = name;
	}
	
	String getName() {
		return name;
	}
}
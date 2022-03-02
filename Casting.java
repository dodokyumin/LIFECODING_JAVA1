
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; //자동적으로
		double b2 = (double) 1; //수동적으로(명시적으로) 1을 double형태로 바꿈. 
		System.out.println(b); // 1.0   1이 double형으로 컨버팅됨. 잃어버리는 값 없음.
		
//		int c = 1.1;  0.1 값을 잃어버리기 때문에 컨버팅 에러.
		double d = 1.1; //에러전구 클릭.change type of 'd' to 'double'.
		int e = (int) 1.1; //Add cast to 'int'. 강제로 인티저로 바꾸는 코드를 자동으로 추가해주겠다.
//		double형을 int로 바꿀 때 손실이 있기 때문에 우리가 반드시 명시적으로만 형변환으로 해줘야한다.
		System.out.println(e);
		
		// 1 to String (구글에 java int to string casting 검색
		String f = Integer.toString(1);
		System.out.println(f);
		System.out.println(f.getClass()); // .getClass 는 앞의 값이 어떤 데이터 타입인지 알려주는 코드. JS의 type of ( )
		
//		어떤 변수의 값을 다른 데이터 타입으로 컨버팅 해야하는데, 그때의 키워드가 casting!
	}

}

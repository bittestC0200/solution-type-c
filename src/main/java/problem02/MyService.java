package problem02;

public class MyService extends BaseService {

	public void service(String state) {
		String result = state.equals("오후") ? afternoon() : state.equals("낮") ? super.day() : super.night();
		System.out.print(result);
		System.out.println("서비스시작");
	}
	
	public String afternoon() {
		
		return "오후";
	}
}

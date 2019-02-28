package problem03;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	
	private String[] buffer;
	private List<String> lst;

	public MyStack( int size ) {
		
	}
	
	public void push(String item) {
		if (buffer == null)
		{
			buffer = new String[] { item };
		}
		else
		{
			AddList(buffer, item);
		}
		
	}

	public String pop() {
		return null;
	}

	public boolean isEmpty() {
		
		if (size() <= 0 ) return true;

		return false;
	}
	
	public int size() {
		
		if (buffer == null)
		{
			return 0;
		}
		else
		{
			return buffer.length;
		}
		
	}
	
	//스트링 배열을 리스트로 변환하여 요소를 추가하는 방식으로 코드를 작성하려 하였으나,
	//시간이 부족해서 풀지 못하였습니다.
	public void AddList(String[] str, String new_str)
	{
		//if (lst != null)
		//{
			//lst = null;
		//}
		
		//lst = new ArrayList<String> ();
		//lst.toArray(str);
		//lst.add(new_str);
		
		
		//for (int i = 0; i < lst.size(); i++)
		//{
			//lst.add(i, str[i].toString());
		//}
		
		//buffer = null;
		//buffer = new String[ size() ];
		//lst.toArray( buffer );
	
	}
}
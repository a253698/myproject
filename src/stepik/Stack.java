package stepik;

public class Stack {

	public static void main(String[] args) {


		java.util.Stack<String> st = new java.util.Stack<String>();

		String c1 = "1";
		st.push(c1);
		String c2 = "2";
		st.push(c2);
		String c3 = "3";
		st.push(c3);
		String c4 = "4";
		st.push(c4);
		String c5 = "5";
		st.push(c5);
		String c6 = "6";
		st.push(c6);
		String c7 = "7";
		st.push(c7);
		
		
		String e1 = st.pop();
		String e2 = st.pop();
		String e3 = st.pop();
		String e4 = st.pop();
		String e5 = st.pop();
		String e6 = st.pop();
		String e7 = st.pop();

		
		System.out.print(e2 + " " + e4 + " " + e6);
	
	}

}

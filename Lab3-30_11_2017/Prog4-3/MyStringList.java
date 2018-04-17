package prog1;

public class MyStringList {
	
	String[] strArray;
	int position;
	
	public MyStringList() {
		// TODO Auto-generated constructor stub
		strArray  = new String[2];
		position = 0;
	}

	public void add(String s) {
		if(position != strArray.length) {
			strArray[position] = s;
			position++;
		}
		else {
			resize();
			strArray[position] = s;
			position++;
		}
	}
	
	public String get(int i) {
		return strArray[i];
	}
	
	
	public boolean find(String s) {
		for(String str: strArray) {
			if(str.equals(s)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean remove(String s) {
		for(int i = 0; i< strArray.length; i++) {
			if(strArray[i].equals(s)) {
				strArray[i] = null;
				position--;
				return true;
			}
		}
		String[] temp = strArray.clone();
		strArray = new String[temp.length];
		int pointer = 0;
		for(String str : temp) {
			if(s != null) {
				strArray[pointer] = str;
				pointer++;
			}
		}
		return false;
	}
	
	public String toString() {
		String output = "";
		for(String s: strArray) {
			if(s!= null)
				output += "[" + s + "] ";
		}
		return output;
	}
	
	public int size() {
		return position;
	}
	
	private void resize() {
		System.out.println("Resizing....");
		String[] temp = strArray.clone();
		strArray = new String[temp.length+2];
		int pointer = 0;
		for(String s : temp) {
			if(s != null) {
				strArray[pointer] = s;
				pointer++;
			}
		}
		position = pointer;
	}
}

package sec06.ch07;

public class MyArrayList implements MyList{
	private int[] arr;
	public MyArrayList() {
		
		arr = new int[0];
		
	}
	@Override
	public void add(int value) {
		int temp[] = new int[arr.length+1];
		for(int i = 0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = value;
		arr = temp;
	}

	@Override
	public int size() {
		return arr.length;
	}

	@Override
	public int get(int index) {
		return arr[index];
	}
	
	@Override
	public int remove() {
		int temp[] = new int[arr.length-1];
		int val=arr[temp.length];
		for(int i = 0; i<temp.length; i++) {
	
				temp[i] = arr[i];
			
		}
		arr=temp;
		return val;
	
	}
	@Override
	public void add(int index, int value) {
		int temp[] = new int[arr.length+1];
		for(int i=0; i<temp.length; i++) {
			if(i==index) {
				temp[i] = value;
			}else if(i>index) {
				temp[i] = arr[i-1]; 
			}else {
				temp[i] = arr[i];
			}
		}
		arr=temp;
	}
	@Override
	public int remove(int index) {
		int temp[] = new int[arr.length-1];
		for(int i=0; i<temp.length; i++) {
		 int num = i >= index ? i+1 : i;
			temp[i]=arr[num];
		}
		int delVal = arr[index];
		arr=temp;
		return delVal;
	}
}

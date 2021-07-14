package b4;

public class SelectionSort extends NumberList implements Sort{

	@Override
	public void sort() {
		if(this.getLengOfList()>0) {
			int[] arr= this.getArray();
			for(int i=0;i<this.getLengOfList()-1;i++) {
				for(int j=i+1;j<this.getLengOfList();j++) {
					if(arr[j] < arr[i]) {
						int swap= arr[i];
						arr[i]= arr[j];
						arr[j]= swap;
					}
					
				}
			}
			this.setArray(arr);
		}
		
	}

	public SelectionSort() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SelectionSort(int lengOfList) {
		super(lengOfList);
		// TODO Auto-generated constructor stub
	}

	
}

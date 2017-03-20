public class Quick
{
	public static String name(){
		return "Leung,Brian,6";
	}
	//I NEED THIS SWAP HELPER FUNCTION IN MY LIFE BC I HATE MANUALLY SWAPPING THINGS
    public static void swap(int x, int y, int[] o) {
		int temp = o[x];
		o[x] = o[y];
		o[y] = temp;
    }
	
    public static void printArr(int[] arr) {
		for (int o:arr){
			System.out.print(o+" ");
		}
		System.out.println();
    }

    public static int[] builder(int s, int mxVal) {
		int[] retArr = new int[s];
		for(int i = 0; i < retArr.length; i++){
			retArr[i] = (int)(mxVal * Math.random());
		}
		return retArr;
    }
	//HERE IS THE PARTITION FUNCTION
    public static int part(int[] arr, int l, int r, int pivPos){
		int piv = arr[pivPos];
		swap(r, pivPos, arr);
		int s = l;
		for (int i = l; i < r; i ++){
			if(arr[i] < piv){
			swap(s, i, arr);
			s++;
			}
		}	 
		swap (r, s, arr);
		return s;
    }
	
    public static int quickselect(int[] data, int k){
		//do i trust kth?
		sortit(data, 0, data.length - 1);
		//no
		return data[k];
		//Something something theres probably a smarter way to solve this
    }
    
    public static void sortit(int[] arr, int l, int r){
		//sort it, sort it, sort it
		if (l >= r){
			return;
		}
		int s = part(arr, l, r, l);
		//your chaos way too high u need to sort itt
		if(l < s-1){
			sortit(arr, l, s-1);
		}else{
			if(s < r){
				sortit(arr, s + 1, r);
			}
		}
    }

    /*
    public static void main( String[] args ) 
    {
		int[]ary = { 2, 10, 15, 23, 0,  5};
		System.out.println(quickselect(ary,3));
    }
	*/
	
}

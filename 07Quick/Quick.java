import java.util.Random;

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
	public static int[] randArray(int length, int range){
		int[] array = new int[length];
		for (int i = 0; i<length-1; i++){
			Random rand = new Random();
			array[i] = rand.nextInt(range);
		}
		return array;
	}
	public static int[] splitL(int[] arr){
		
	}
	public static int[] splitR(int[] arr){
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
	public static void quickDutch(int[] arr){
		
	}
	public static int[] dutchyH(int[] arr, int lt, int gt, int i){
		while (i<=gt){
			if (arr[i] == arr[0]){
				i++;
			}
			else{
				if (arr[i] < arr[0]){
					swap(lt,i,arr);
					lt++;
					i++;
				}
				else{
					swap(gt,i,arr);
					gt--;
				}
			}
		}
		return arr;
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
	
	//HERE IS MERGESORT
	public static int[] mergesort(int[] arr){
		
		
	}
	
	public static int[] merge(int[] arr1, int[] arr2){
		int p1 = 0;
		int p2 = 0;
		int[] retArr = new int[arr1.length+arr2.length];
		int out = -1;
		int longarr = 0;
		for (int i = 0; i<retArr.length; i++){
			//printArr(retArr);
			//System.out.println("p1 = "+p1+"\np2 = "+p2);	
			if ((p1 >= arr1.length)){
				out = i;
				longarr = 2;
				break;
			}
			if ((p2 >= arr2.length)){
				out = i;
				longarr = 1;
				break;
			}
			if (arr1[p1]>=arr2[p2]){
				retArr[i] = arr2[p2];
				p2++;
			}else{
				retArr[i] = arr1[p1];
				p1++;
			}
		}
		if (out!=-1){
			for (int i = out; i<retArr.length; i++){
				if (longarr == 2){
					retArr[i] = arr2[p2];
					p2++;
				}else{
					retArr[i] = arr1[p1];
					p1++;
				}
			}
		}
		//printArr(retArr);
		return retArr;
	}
	//END MERGESORT

    
    public static void main( String[] args ) 
    {
		//int[]ary = Quick.randArray(500,100);
		//Quick.printArr(dutchyH(ary,0,ary.length-1,0));
		//Quick.printArr(Quick.sortit(ary, 0, ary.length - 1));
		int[] ar1 = {1,5,7};
		int[] ar2 = {10,10,10,10,10};
		Quick.printArr(Quick.merge(ar1,ar2));
    }
	
	
}

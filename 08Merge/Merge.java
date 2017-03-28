import java.util.Random;
public class Merge{
	public static void mergesort(int[] arr){
		if (arr.length == 1){
			//System.out.println("Going up");
			return;
		}
		else{
			int[] left = splitL(arr);
			int[] right = splitR(arr);
			//printArr(left);
			//printArr(right);
			mergesort(left);
			mergesort(right);
			merge(left,right,arr);
		}
		//printArr(arr);
	}
			
	public static void merge(int[] arr1, int[] arr2, int[] destination){
		int p1 = 0;
		int p2 = 0;
		int out = -1;
		int longarr = 0;
		for (int i = 0; i<destination.length; i++){
			//printArr(destination);
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
				destination[i] = arr2[p2];
				p2++;
			}else{
				destination[i] = arr1[p1];
				p1++;
			}
		}
		if (out!=-1){
			for (int i = out; i<destination.length; i++){
				if (longarr == 2){
					destination[i] = arr2[p2];
					p2++;
				}else{
					destination[i] = arr1[p1];
					p1++;
				}
			}
		}
		//printArr(destination);
		return;
	}
	
	public static int[] splitL(int[] arr){
		int[] ret = new int[arr.length/2];
		for (int i = 0; i<ret.length; i++){
			ret[i] = arr[i];
		}
		return ret;
	}
	public static int[] splitR(int[] arr){
		int[] ret = new int[arr.length - (arr.length/2)];
		for (int i = 0; i<ret.length; i++){
			ret[i] = arr[arr.length-ret.length+i];
		}
		return ret;
	}
	public static int[] randArray(int length, int range){
		int[] array = new int[length];
		for (int i = 0; i<length-1; i++){
			Random rand = new Random();
			array[i] = rand.nextInt(range);
		}
		return array;
	}
	public static void printArr(int[] arr) {
		for (int o:arr){
			System.out.print(o+" ");
		}
		System.out.print("\n");
    } 	
	//END MERGESORT
	//Tested sorted, unsorted, non dupe, duped, all same, and random
	/*
	public static void main(String[] args){
		int[] array = Merge.randArray(100000,1);
		Merge.mergesort(array);
		Merge.printArr(array);
		//System.print("Done");
	}
	*/
	
}
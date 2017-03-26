public class Merge{
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
}
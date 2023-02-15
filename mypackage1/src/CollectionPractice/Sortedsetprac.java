package CollectionPractice;

public class Sortedsetprac {

	public static void printarray(int arr[]){
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		        }
		System.out.println();
	          }
	public static void main(String[] args){
		// TODO Auto-generated method stub
		//bubble sort
              int arr[] = {8,2,5,7,1,4};
for (int i = 0; i < arr.length-1; i++){
	for (int j = 0; j < arr.length-i-1; j++){
		if(arr[j]>arr[j+1]){
			//swap
			int temp= arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
		    }}}
	printarray(arr);
            
	
	//selection sort

	int arr1[] = {8,2,5,7,1,4};
	for (int i = 0; i < arr1.length-1; i++){

     int smallest =i;
     for (int j = 0; j < arr1.length; j++) {
		if(arr1[smallest] > arr1[j]) {
			smallest = j;
			
		}}
     int temp = arr1[smallest];
     arr1[smallest] = arr1[i];
     arr1[i] = temp;
     
	}
   printarray(arr1);
	}

   

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      



	   
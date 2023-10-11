public static void main(String[] args){
	int[] arr = {67, 29, 34, 120, 211, 70, 53};	
	radix_sort(arr);		
}

public static void radix_sort(int[] arr) {
	final int MaxNumber = getMaxnum(arr);
	// 자릿수
	int radix = 1;
	
	// LinkedList의 배열로 된 Queue
	Queue<Integer>[] bucket = new LinkedList[10];
	for(int i=0; i<10; i++) {
		bucket[i] = new LinkedList<>();
	}
	
	while(radix <= MaxNumber) {
		// bucket에 담기(자릿수 기준)
		for(int idx = 0; idx < arr.length; idx++) {
			bucket[(arr[idx] / radix) % 10].add(arr[idx]);
		}
		
		// bucket에서 꺼내서 원래 arr에 담기
		for(int arr_idx=0, bucket_idx=0; bucket_idx<10; bucket_idx++) {
			while(!bucket[bucket_idx].isEmpty()) {
				arr[arr_idx++] = bucket[bucket_idx].poll();
			}
		}
		radix*=10;
	}
}
	
// 가장 큰 수 찾아서 해당 자릿수 만큼 돌리기
public static int getMaxnum(int[] arr) {
	int maxNumber = arr[0];
	for(int num : arr) {
		if(num > maxNumber) {
			maxNumber = num;
		}
	}
	return maxNumber;
}

int[] arr = {67, 29, 34, 20, 11, 70, 53};
		
for(int i=0; i<arr.length-1; i++) {
	int min_index = i;
	
    // 최솟값 인덱스 찾기
	for(int j = i+1; j<arr.length; j++) {
		if(arr[j] < arr[min_index]) {
			min_index = j;
		}
	}
	
    // i번째 값과 최솟값을 서로 교환
	int temp = arr[min_index];
	arr[min_index] = arr[i];
	arr[i] = temp;
}

for(int i=0; i<arr.length; i++) {
	System.out.print(arr[i] + " ");
}

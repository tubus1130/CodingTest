int[] arr = {67, 29, 34, 20, 11, 70, 53};
		
// round는 배열 크기 -1만큼 반복
for(int i=1; i<arr.length; i++) {

	// 각 라운드별 비교횟수는 라운드를 거칠수록 1개씩 줄어듬
	for(int j=0; j<arr.length-i; j++) {
		if(arr[j] > arr[j+1]) {
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
		}
	}
}
for(int i=0; i<arr.length; i++) {
	System.out.print(arr[i] + " ");
}

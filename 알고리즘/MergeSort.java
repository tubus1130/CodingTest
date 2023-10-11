static int[] sorted;
	
public static void main(String[] args){
	int[] arr = {67, 29, 34, 20, 11, 70, 53};
	
	sorted = new int[arr.length];
	merge_sort(arr, 0, arr.length-1);
}
	
// 범위를 나누는 과정
public static void merge_sort(int[] arr, int left, int right) {
	if(left == right) return;
	
	int mid = (left + right) / 2;

	merge_sort(arr, left, mid);	
	merge_sort(arr, mid + 1, right);
	
	merge(arr, left, mid, right);
}
	
// sorted 배열에 왼쪽오른쪽 배열비교해서 값 저장하는 단계
public static void merge(int[] arr, int left, int mid, int right) {
	int l = left;		// 왼쪽 부분리스트 시작점
	int r = mid + 1;	// 오른쪽 부분리스트의 시작점 
	int idx = left;		// 채워넣을 배열의 인덱스
	
	// 양쪽 값 존재할때, 비교해서 값 채워넣기
	while(l <= mid && r <= right) {
		if(arr[l] <= arr[r]) {
			sorted[idx] = arr[l];
			idx++;
			l++;
		}
		else {
			sorted[idx] = arr[r];
			idx++;
			r++;
		}
	}
	
	// 한쪽이 다 채웠을경우 나머지 채워놓기 => 어차피 부분배열안에서는 정렬되있음
	if(l > mid) {
		while(r <= right) {
			sorted[idx] = arr[r];
			idx++;
			r++;
		}
	}
	else {
		while(l <= mid) {
			sorted[idx] = arr[l];
			idx++;
			l++;
		}
	}
	
	// 기존배열에 복사
	for(int i = left; i <= right; i++) {
		arr[i] = sorted[i];
	}
}

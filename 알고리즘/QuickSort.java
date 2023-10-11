public static void main(String[] args) {
	int[] arr = {67, 29, 34, 20, 11, 70, 53};
	l_pivot_sort(arr, 0, arr.length-1);
}

public static void l_pivot_sort(int[] a, int lo, int hi) {
		
	// 정렬할 원소가 1개 이하이므로 종료
	if(lo >= hi) {
		return;
	}		
    
	int pivot = partition(a, lo, hi);	
		
	l_pivot_sort(a, lo, pivot - 1);
	l_pivot_sort(a, pivot + 1, hi);
}

public static int partition(int[] a, int left, int right) {
	int lo = left;
	int hi = right;
    
    // 왼쪽 요소를 pivot으로 설정
	int pivot = a[left];
    
	while(lo < hi) {
    	// 오른쪽에 pivot보다 작은값을 만날때까지 hi--
		while(a[hi] > pivot && lo < hi) {
			hi--;
		}
        // 왼쪽에 pivot보다 큰 값을 만날때까지 lo++
		while(a[lo] <= pivot && lo < hi) {
			lo++;
		}
		swap(a, lo, hi);
	}
	swap(a, left, lo);
	return lo;
}

private static void swap(int[] a, int i, int j) {
	int temp = a[i];
	a[i] = a[j];
	a[j] = temp;
}

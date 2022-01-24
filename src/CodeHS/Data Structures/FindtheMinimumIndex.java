public int findMin(int[] arr) {
    int smallest = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < arr[smallest]) {
            smallest = i;
        }
    }
    return smallest;
}
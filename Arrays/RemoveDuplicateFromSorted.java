class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3};

        int k = removeDuplicates(arr);

        System.out.println("Unique elements: " + k);
    }

    public static int removeDuplicates(int[] arr) {

        int i = 0;

        for (int j = 1; j < arr.length; j++) {

            if (arr[i] != arr[j]) {

                arr[i + 1] = arr[j];
                i++;
            }
        }

        return i + 1;
    }
}
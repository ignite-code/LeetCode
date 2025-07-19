class Solution {
    public String convert(String s, int numRows) {
        if (s.length() <= 2 || numRows == 1) {
            return s;
        }
        int j = 0;

        int step = numRows * 2 - 2;
        String arr[] = new String[numRows];
        Arrays.fill(arr, "");

        for (int i = 0; i < numRows; i++) {
            j = i; // 1
            while (j < s.length()) {

                // System.out.println(s.charAt(j));
                arr[i] += String.valueOf(s.charAt(j));
                if (i != 0 && i != numRows - 1 && j + step - i < s.length()) {
                    // System.out.println(s.charAt(j + step - i));
                    arr[i] += String.valueOf(s.charAt(j + step - i));
                }
                j = j + step + i;
            }
            step--;
        }

        return Arrays.stream(arr).collect(Collectors.joining());
    }
}




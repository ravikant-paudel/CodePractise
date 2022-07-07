package com.example.code_practise;

public class BinaryGap {

    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        int _obtainValue = binaryGap.Solution(9);
        System.out.println(_obtainValue);
    }

    public int Solution(int N) {
        String binaryString = Integer.toString(N, 2);

        boolean _started = false;
        int _counter = 0;
        int _maxCount = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            String c = binaryString.substring(i, i + 1);
            if (c.equals("1")) {
                if (_started) {
                    if (_counter > _maxCount) {
                        _maxCount = _counter;
                    }
                }
                _counter = 0;
                _started = true;
            }
            if (c.equals("0")) {
                _counter++;
            }
        }

        return _maxCount;
    }
}

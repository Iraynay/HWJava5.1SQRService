package ru.netology.sqr;

public class SQRService {
    public static int calculate(int rangeStart, int rangeEnd) {
        int SQR = 0;
        for (int i = 0; i <= 99; i++) {
            if (i * i >= rangeStart & i * i <= rangeEnd) {
                SQR++;
            }
            ;
        }
        return (SQR);

    }
}

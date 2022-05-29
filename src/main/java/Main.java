import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int SQR = SQRService.calculate(100, 600);
        System.out.println("SQRService Result: " + SQR);

    }

}


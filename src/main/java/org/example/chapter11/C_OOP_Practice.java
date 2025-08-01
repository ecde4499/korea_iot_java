package org.example.chapter11;

/*
    == SOLID 원칙 ==
    SRP: 단일 책인 원칙 - 클래스는 하나의 책임만을 가짐
    OCP: 개방 폐쇄 원칙 - 확장에 개방, 수정에 폐쇄
    LSP: 리스코프 치환 원칙 - 자식 클래스는 부모 클래스를 대체 할 수 있어야 함 (부모와 행위의 일관성)
    ISP: 인터페이스 분리 원칙 - 자신이 사용하지 않는 인터페이스에 의존하지 X
    DIP: 의존 역전 원칙 - 클래스 간의 결함을 낮추고, 추상화에 의존해야 함
 */

// == SOLID 원칙을 활용한 주문 관리 시스템 == //

// 1. SRP - Order 클래스는 주문 정보를 저장하는 역할만 담당
class Order {
    private String orderId; // 각 주문의 식별번호
    private int amount; // 주문 금액

    public Order(String orderId, int amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public String getOrderId() { return orderId; }
    public int getAmount() { return amount; }
}

// 2. OCP - 결제 프로세스를 추상화한 인터페이스
interface PaymentProcessor {
    void processPayment(Order order);
}

class  CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(Order order) {
        System.out.println("신용카드로 결제합니다 : " + order.getOrderId());
    }

}

class SamsungPayPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(Order order) {
        System.out.println("삼성페이로 결제합니다: " + order.getOrderId());
    }
}

// 3. ISP - 주문 보고서 생성을 위한 별도의 인터페이스
interface GenerateReport {
    void generateReport(Order order);
}
class PdfReportGenerator implements GenerateReport {
    @Override
    public void generateReport(Order order) {
        System.out.println("주문 정보 보고서를 PDF 파일로 생성: " + order.getOrderId());
    }
}

// 4. DIP - orderService 클래스는 결제 및 보고소 생성 인터페이스에 의존
class OrderService {
    private final PaymentProcessor paymentProcessor;
    private  final GenerateReport generateReport;

    // 생성자에게 결제 처리기 & 보고 생성기 주입 (인터페이스와의 의존을 주입)
    public OrderService(PaymentProcessor paymentProcessor, GenerateReport generateReport) {
        this.paymentProcessor = paymentProcessor;
        this.generateReport = generateReport;
    }

    void placeOrder(Order order) {
        paymentProcessor.processPayment(order);
        generateReport.generateReport(order);
        System.out.println("주문 완료");
    }
}


public class C_OOP_Practice {
    public static void main(String[] args) {
        PaymentProcessor creditCard = new CreditCardPaymentProcessor();
        PaymentProcessor samsumPay = new SamsungPayPaymentProcessor();

        GenerateReport generateReport = new PdfReportGenerator();

        OrderService orderService = new OrderService(creditCard, generateReport);
        OrderService orderService1 = new OrderService(samsumPay, generateReport);

        // 여러 개의 주문 객체 생성
        Order order1 = new Order("1",18000);
        Order order2 = new Order("2",28000);
        Order order3 = new Order("3",13000);
        Order order4 = new Order("4",34000);

        // 주문 처리 실행
        orderService.placeOrder(order1);
        orderService.placeOrder(order2);
        orderService1.placeOrder(order3);
        orderService1.placeOrder(order4);

    }
}

public class Quadratic {
    public static void main(String[] args) {
        System.out.println("Phương trình bậc hai có dạng:");
        System.out.println("a*x*x+b*x=+c=0");
        int a, b, c;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Input a:");
        a = sc.nextInt();
        System.out.println("Input b:");
        b = sc.nextInt();
        System.out.println("Input c:");
        c = sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double x = -c / b;
                System.out.println("Phương trình có nghiệm:" + x);
            }
        } else {
            double x1, x2;
            double deltal = Math.pow(b, 2) - 4 * a * c;
            if (deltal < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (deltal > 0) {
                x1 = (-b + Math.sqrt(deltal)) / (2 * a);
                x2 = (-b - Math.sqrt(deltal)) / (2 * a);
                System.out.println("Phương trình có nghiêm x1=" + x1);
                System.out.println("Phương trình có nghiêm x2=" + x2);
            } else
                System.out.println("Phương trinh có nghiệm kép x=" + (-b / 2 * a));
        }
    }
}

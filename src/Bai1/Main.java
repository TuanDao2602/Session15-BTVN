package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner =new Scanner(System.in);
        try {
            System.out.println("nhập vào cạnh a của tam giác");
            float a = scanner.nextInt();
            System.out.println("nhập vào cạnh b của tam giác");
            float b =scanner.nextInt();
            System.out.println("nhập vào cạnh c của tam giác");
            float c = scanner.nextInt();
            if (a+b<c||b+c<a||a+c<b||a<0||b<0||c<0){
                throw new IllegalTriangleException("ĐÂY KHÔNG PHẢI 3 CẠNH CỦA 1 TAM GIÁC");
            }else {
                System.out.println("đây là 3 cạnh của 1 tam giác");
            }
        }catch (NumberFormatException ex){
            throw new IllegalTriangleException("ĐÂY KHÔNG PHẢI 3 CẠNH CỦA 1 TAM GIÁC");
        }

    }
}

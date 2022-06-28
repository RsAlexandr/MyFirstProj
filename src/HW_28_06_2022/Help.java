package HW_28_06_2022;

import java.util.Scanner;

public class Help {
    public static void main(String[] args) {
        String choice;

        for (;;) {
            System.out.println("Справка:");
            System.out.println("1.if\n2.switch\n3.for\n4.while\n5.do-while\n6.break\n7.continue");


            for (;;) {
                System.out.println("Введите один из пунктов и нажмите ENTER: ");
                Scanner input = new Scanner(System.in);
                choice = input.nextLine();
                switch (choice) {
                    case "1":
                        System.out.println("Oпepaтop if:\n");
                        System.out.println("if(ycлoвиe) оператор;");
                        System.out.println("else оператор;");
                    case "2":
                        System.out.println("Oпepaтop switch:\n");
                        System.out.println("switch(выpaжeниe) {");
                        System.out.println(" case константа:");
                        System.out.println(" последовательность операторов");
                        System.out.println(" break;");
                    case "3":
                        System.out.println("Oпepaтop for:\n");
                        System.out.print("for(инициaлизaция; условие; итерация)");
                        System.out.println(" оператор;");
                    case "4":
                        System.out.println("Oпepaтop while:\n");
                        System.out.println("while(ycлoвиe) оператор;");
                    case "5":
                        System.out.println("Oпepaтop do-while:\n");
                        System.out.println("do {");
                        System.out.println(" оператор;");
                        System.out.println("} while (условие};");
                    case "6":
                        System.out.println("Oпepaтop break:\n");
                        System.out.println("break; или break метка;");
                    case "7":
                        System.out.println("Oпepaтop continue:\n");
                        System.out.println("continue; или continue метка;");
                    case "q":
                        break;
                }

                if (choice.equals("q")) {
                    System.out.println("<<<break>>>");
                    break;
                }
            }

            if (choice.equals("q")) {
                System.out.println("<<<break>>>");
                break;
            }
        }
    }

}

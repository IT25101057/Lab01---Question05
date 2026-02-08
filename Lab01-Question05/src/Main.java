//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();


        int part1 = calc.multiply(3, 4);
        int part2 = calc.multiply(5, 7);
        int sum1 = calc.add(part1, part2);
        int result1 = calc.square(sum1);
        System.out.println("Result 1: " + result1);


        int sum2 = calc.add(4, 7);
        int sum3 = calc.add(8, 3);
        int square2 = calc.square(sum2);
        int square3 = calc.square(sum3);
        int result2 = calc.add(square2, square3);
        System.out.println("Result 2: " + result2);

    }
    }

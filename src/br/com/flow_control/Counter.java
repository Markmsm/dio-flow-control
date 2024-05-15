package br.com.flow_control;

import br.com.flow_control.exceptions.InvalidParametersException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número:");
            final int number1 = scanner.nextInt();

            System.out.println("Digite o segundo número:");
            final int number2 = scanner.nextInt();

            count(number1, number2);
        } catch (InvalidParametersException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Os parâmetros devem ser apenas números inteiros.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void count(int number1, int number2) throws InvalidParametersException {
        if (number1 > number2) {
            throw new InvalidParametersException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        final int iterationsNumber = number2 - number1;

        for (int i = 1; i <= iterationsNumber; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
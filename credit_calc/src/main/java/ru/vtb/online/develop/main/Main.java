package ru.vtb.online.develop.main;

import com.google.gson.Gson;
import ru.vtb.online.develop.calculator.CalculatingValues;
import ru.vtb.online.develop.pojo.Body;
import ru.vtb.online.develop.pojo.CalculatorResponse;
import ru.vtb.online.develop.pojo.InterestRates;
import ru.vtb.online.develop.pojo.OptionRates;
import ru.vtb.online.develop.search.ValuesSearch;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


public class Main {
    // Сделать метод для парсинга из строк в double и int. Часто используется
    // Сделать метод для округления до сотых
    public static void main(String[] args) throws IOException {

        System.out.println("Введи абсолютный путь к файлу");
        Scanner scanner = new Scanner(System.in);
        // Считываем путь к файлу
        String filePath = scanner.nextLine();
        // Сохраняем файл
        String content = Files.readString(Paths.get(filePath));
        System.out.println("Введи сумму кредита");
        String enterAmount = scanner.nextLine();
        System.out.println("Введи срок кредита");
        String enterTerm = scanner.nextLine();

        double minRateFromTheBucket;
        double minRateWithOptionFromTheBucket;
        double rateFromOptionRate;

        // Объект gson для десериализации
        Gson gson = new Gson();
        // Десериализация в объект калькулятора
        CalculatorResponse calculatorResponse = gson.fromJson(content, CalculatorResponse.class);
        // Получаем interestRates для передачи в метод поиска бакета
        List<InterestRates> respInterestRates = calculatorResponse.getResponse().getBody().getInterestRatesList();
        // Ищем нужный бакет
        InterestRates bucket = ValuesSearch.findInterestRatesBucket(enterAmount, enterTerm, respInterestRates);
        // Получаем minRate из найденного бакета
        minRateFromTheBucket = Double.parseDouble(bucket.getMinRate().replaceAll("[^0-9.]", ""));
        // Получаем minRateWithOption из найденного бакета
        minRateWithOptionFromTheBucket = Double.parseDouble(bucket.getMinRateWithOption().replaceAll("[^0-9.]", ""));
        // Получаем optionRate
        List<OptionRates> respOptionRates = calculatorResponse.getResponse().getBody().getOptionRatesList();
        // Ищем нужный бакет в optionsRate
        OptionRates optionRatesBucket = ValuesSearch.findOptionRatesBucket(enterAmount, enterTerm, respOptionRates);
        // Получаем тариф опции из бакета
        rateFromOptionRate = Double.parseDouble(optionRatesBucket.getRate().replaceAll("[^0-9.]", ""));

        double monthlyPayment = CalculatingValues.calculateMonthlyPayment(enterAmount, minRateFromTheBucket,
                enterTerm);
        double monthlyPaymentWithOption = CalculatingValues.calculateMonthlyPaymentWithOption(enterAmount,
                minRateWithOptionFromTheBucket, enterTerm, rateFromOptionRate);
        double savingOnOnePayment = monthlyPayment - monthlyPaymentWithOption;
        double costOfTheOption = CalculatingValues.calculateCostOfTheOption(enterAmount,enterTerm,rateFromOptionRate);
        double savingsOverTheEntireLoanTerm = savingOnOnePayment * Integer.parseInt(enterTerm.replaceAll("[^0-9]", ""));
        // Сделать метод для вывода значений
        System.out.println("Платеж без опции = " + monthlyPayment);
        System.out.println("Платеж с опцией = " + monthlyPaymentWithOption);
        System.out.println("Стоимость опции = " + costOfTheOption);
        System.out.println("Экономия на одном платеже = "+ savingOnOnePayment);
        System.out.println("Экономия за весь срок кредита = "+ savingsOverTheEntireLoanTerm);

    }
}
package com.example.test_case.entity;

import org.springframework.boot.SpringApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Arrays;



public class Greeting {
    private String content;

    public String getContent() {
        return content;
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    /////////////////////////////////////ДОБАВИТЬ СТРОКУ ДЛЯ СОХРАНЕНИЯ КАЖДОЙ НОВОЙ ИТЕРАЦИИ
                }
    }


    public void setContent(String content) {

        String line = content;
        String[] numberStrs = line.split(" ");
        int[] numbers = new int[numberStrs.length];
        for(int i = 0;i < numberStrs.length;i++)
        {
            numbers[i] = Integer.parseInt(numberStrs[i]);
        }

        bubbleSort(numbers);
        String ary2 = Arrays.toString(numbers);


        this.content = ary2;
        ////
    }


}

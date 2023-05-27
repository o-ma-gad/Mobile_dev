package com.tede.tede.request;

import com.google.gson.Gson;
import com.tede.tede.model.Teacher;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiConnection {

    private static final String API_URL = "https://mirea-wizard/api/teacher";

    //метод, который будет делать запрос и возвращать объект
    public Teacher getTeacher(int instituteId) {
        //формируем URL подключения с параметрами
        String urlString = API_URL + "?instituteId=" + instituteId;

        //создаем объект URL
        URL url;
        try {
            url = new URL(urlString);

            //создаем объект HttpURLConnection для отправки запроса
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            //читаем ответ сервера
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String response = in.readLine();
            in.close();

            //преобразуем JSON строку в объект
            Gson gson = new Gson();
            Teacher teacher = gson.fromJson(response, Teacher.class);

            return teacher;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
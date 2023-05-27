package com.tede.tede.api;

import android.util.Log;

import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.tede.tede.model.Teacher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.net.ssl.HttpsURLConnection;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ApiConnection {

    private static final String API_URL = "https://mirea-wizard/api/teacher";
    //метод, который будет делать запрос и возвращать объект
    public Teacher getOneTeacher(int id) {
        //формируем URL подключения с параметрами
        String urlString = API_URL + id;

        //создаем объект URL
        URL url;
        try {
            url = new URL(urlString);

            //создаем объект HttpURLConnection для отправки запроса
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
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


    public List<Teacher> getTeachersByInstituteId(int instituteId) {
        String urlString = API_URL + "?instituteId=" + instituteId;
        URL url;
        try {
            url = new URL(urlString);
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))
            ) {
                String response = in.readLine();
                Gson gson = new Gson();

                List<Teacher> teachers = gson.fromJson(response, new TypeToken<List<Teacher>>(){}.getType());
                return teachers;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }

        // возвращаем пустой список вместо null
        return new ArrayList<Teacher>();
    }
}
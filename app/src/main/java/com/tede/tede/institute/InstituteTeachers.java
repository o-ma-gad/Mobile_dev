//package com.tede.tede.institute;
//
//import android.os.AsyncTask;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import java.io.BufferedReader;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.List;
//
//public class InstituteTeachers extends AsyncTask<String, Void, List<Teacher>> {
//    @Override
//    protected List<Teacher> doInBackground(String... strings) {
//        String instituteId = strings[0];
//        List<Teacher> teachersList = new ArrayList<>();
//
//        try {
//            String apiUrl = "http://90.156.209.38/api/" + instituteId;
//            URL url = new URL(apiUrl);
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod("GET");
//
//            int responseCode = connection.getResponseCode();
//            if (responseCode == HttpURLConnection.HTTP_OK) {
//                InputStream inputStream = connection.getInputStream();
//                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//
//                String line;
//                StringBuilder response = new StringBuilder();
//                while ((line = bufferedReader.readLine()) != null) {
//                    response.append(line);
//                }
//
//                JSONArray jsonArray = new JSONArray(response.toString());
//                for (int i = 0; i < jsonArray.length(); i++) {
//                    JSONObject jsonTeacher = jsonArray.getJSONObject(i);
//                    int id = jsonTeacher.getInt("id");
//                    String fullName = jsonTeacher.getString("fullName");
//                    teachersList.add(new Teacher(id, fullName));
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return teachersList;
//    }
//}

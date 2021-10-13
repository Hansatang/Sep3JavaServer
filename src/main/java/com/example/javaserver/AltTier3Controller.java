package com.example.javaserver;/*
 * 03.10.2021 Original version
 */


import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@RestController
public class AltTier3Controller {

    private static final Gson gson = new Gson();
    private final Connection connection =
            DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "qwerty");
    private final Statement statement = connection.createStatement();

    public AltTier3Controller() throws SQLException {
    }


    @GetMapping("/BankF/{phoneNo}")
    public synchronized String getAccount(@PathVariable(value = "phoneNo") int accountNumber) {
        System.out.println("It's working");

        List<String> AdultsList = new ArrayList<>();
        AdultsList.add("It's working");
        String result = gson.toJson(AdultsList);
        return result;
    }


}

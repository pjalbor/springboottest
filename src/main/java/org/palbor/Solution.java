package org.palbor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Solution implements CommandLineRunner {

    @Autowired
    private MyBean myBean;

    public static void main(String[] args) {
        SpringApplication.run(Solution.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        boolean userHasNotFinishedInput = true;

        Scanner input = new Scanner(System.in);
        while (userHasNotFinishedInput) {
            System.out.println("--Insert element--ass");
            String line = input.nextLine();
            if (line.equals(""))
                userHasNotFinishedInput = false;
            else
                myBean.addElement(line);
        }
        Thread.sleep(1000);

        System.out.println(myBean.elements());
    }
}

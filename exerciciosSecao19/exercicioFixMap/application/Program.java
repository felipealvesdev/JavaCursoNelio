package exercicioFixMap.application;

import exercicioFixMap.entities.BallotBox;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> result = new HashMap<>();

        System.out.print("Enter file full path: ");
        String path = scan.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while(line != null) {

                String[] fields = line.split(",");
                String name = fields[0];
                Integer votes = Integer.parseInt(fields[1]);

                if(result.containsKey(name)) {
                    votes += result.get(name);
                }

                BallotBox ballotBox = new BallotBox(name);

                result.put(name, votes);
                line = br.readLine();
            }

            for(String key : result.keySet()) {
                System.out.println(key + ": " + result.get(key));
            }


        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scan.close();
    }
}

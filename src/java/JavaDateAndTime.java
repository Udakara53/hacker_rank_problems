package java;

import java.io.*;
import java.text.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year)  {
        String inputDate = String.format("%d/%d/%d",day,month,year);
        SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
        String finalDay = null;
        try {
            finalDay = new SimpleDateFormat("EEEE").format(date1.parse(inputDate));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return  finalDay;

    }

}

public class JavaDateAndTime {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

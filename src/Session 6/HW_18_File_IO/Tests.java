import java.io.*;

public class Tests {
  public static void main(String[] args) {
    int[][] marks = new int[10][5];
    String line;
    int currentLine = 0;
    int currentMark = 0;
    int Mark;
    int length;
    String inFileName = "marks.txt";
    String outFileName = "result.txt";
    double[] average = new double[10];
    int highestAverage = 0;
    try {
      FileReader file = new FileReader(inFileName);
      BufferedReader in = new BufferedReader(file);
      line = in.readLine();
      while (line != null) {
        length = line.length();
        currentMark = 0;
        for (int i = 0; i < length; i += 3) {
          Mark = Integer.parseInt(line.substring(i, i + 2));
          marks[currentLine][currentMark] = Mark;
          currentMark++;
        }
        currentLine++;
        line = in.readLine();
      }
      in.close();
    } catch (IOException e) {
      System.out.println("Error");
    }
    for (int i = 0; i < 10; i++) {
      double score = 0;
      for (int j = 0; j < 5; j++) {
        score += marks[i][j];
      }
      score /= 5;
      average[i] = score;
    }
    for (int i = 0; i < 10; i++) {
      if (average[i] > average[highestAverage]) {
        highestAverage = i;
      }
    }
    try {
      FileWriter file = new FileWriter(outFileName);
      BufferedWriter out = new BufferedWriter(file);
      out.write("The student with the highest average is: " + highestAverage + "\n");
      for (double i : average) {
        out.write(i + "\n");
      }
      out.close();
    } catch (IOException e) {
      System.out.println("Error");
    }
  }
}

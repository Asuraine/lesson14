package ru.sbgeu.lichman.basic;

public class Main {
    public static void main(String[] args) {

        try {
            int answer = massiveArray(new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}});
            System.out.println(answer);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR!");
        } catch (NumberFormatException e) {
            System.out.println("ERROR!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static int massiveArray(String[][] a) throws Exception {
        int sum = 0;
        int num;
        int[][] massive = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                num = Integer.parseInt(a[i][j]);
                massive[i][j] = num;
            }
        }
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                sum += massive[i][j];
            }
        }
        return sum;
    }
}
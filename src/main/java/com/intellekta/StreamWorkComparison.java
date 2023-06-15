package com.intellekta;

import java.io.*;
import java.util.*;

public class StreamWorkComparison {
    static long start;
    static Date date = new Date();
    File dir = new File("D://Notes");

    public static long checkFileReaderWork(File dir) throws IOException {
        start = System.currentTimeMillis();

        FileReader fr = new FileReader(dir);
        try {
            int count;
            while ((count = fr.read()) != -1)
                return System.currentTimeMillis() - start;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Access denied");
            return -1;
        } finally {
            fr.close();
        }
        return -1;
    }

    public static long checkBufferedReaderWork(File dir) throws IOException {
        start = System.currentTimeMillis();

        BufferedReader bf = new BufferedReader(new FileReader(dir));
        try {
            String line;
            while ((line = bf.readLine()) != null)
                return start - date.getTime();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Access denied");
            return -1;
        } finally {
            bf.close();
        }
        return -1;
    }

    public static long checkScannerWork(File dir) throws IOException {
        start = System.currentTimeMillis();

        try(Scanner sc = new Scanner(new BufferedReader(new FileReader(dir)));) {
            while (sc.hasNext()) {
                sc.nextLine();
            }
            return System.currentTimeMillis() - start;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Access denied");
            return -1;
        }
        return -1;
    }

    public static List<String[]> compareReading(File dir) throws IOException {
        List<String[]> result = new ArrayList();

        try {
            long timeReader = checkFileReaderWork(dir);
            result.add(new String[]{"FileReader", String.valueOf(timeReader)});

            long timeBuffer = checkBufferedReaderWork(dir);
            result.add(new String[]{"BufferReader", String.valueOf(timeBuffer)});

            long timeScanner = checkScannerWork(dir);
            result.add(new String[]{"Scanner", String.valueOf(timeScanner)});
            return result;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Access denied");
        }
        return new ArrayList<>();
    }
}

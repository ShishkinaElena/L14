package p3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String text = "Hello"; // есть текст запишется в итоге в файл hello.txt на уровне проекта,
        try(FileOutputStream outputStream = new FileOutputStream("hello.txt")) { // используем конструкцию  с FileOutputStream
            byte[] bytes = text.getBytes();  // текст , который нужно записать сделаем в виде массива  byte[]
            outputStream.write(bytes, 0, bytes.length); // метод write и передаем туда байт и массив
            //outputStream.write(bytes[0]); // можно записать одиночный байт (один символ)
            System.out.println("The file written");
        }catch (IOException exception){  // нужно для работы с файлами и потоками, если возникнет ошибка сработает IOException
            exception.printStackTrace();
        }
        // вывод в консоль
        try(FileInputStream inputStream = new FileInputStream( "hello.txt")) {  // наименование файла "hello.txt"
            /*   int i;
            while ((i=inputStream.read())!=-1){
                System.out.print((char) i); // Hello  здесь считываем с помощью метода read() каждый отдельный байт в переменную i
            }*/
            // второй вариант
            byte[] bytes = new byte[256];
            System.out.println("File data:");
            int count;  // c помощью метода int считываем данные в массив bytes
            while ((count=inputStream.read(bytes))!=-1) {
                for (int i = 0; i < count; i++) {
                System.out.println((char) bytes[i]);
            }
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}

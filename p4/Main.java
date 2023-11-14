package p4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // можно объеденить в один класс чтение и  запись
        try(FileInputStream fileInputStream = new FileInputStream("text.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("text_new.txt")
        ){
            byte[] bytes = new byte[256];
            int count;
            while ((count=fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes, 0, count);
            }
            System.out.println("DONE");
        }catch (IOException exception){
            exception.printStackTrace();
        }
  //выпадет ошибка text.txt (Не удается найти указанный файл), т.к. надо создать текстовый документ на уровне класса, тогда выполнится программа и перезапишется в новый файл "text_new.txt"

    }
}

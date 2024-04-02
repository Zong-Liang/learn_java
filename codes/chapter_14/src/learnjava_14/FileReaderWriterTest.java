package learnjava_14;

import org.junit.jupiter.api.Test;

import java.io.*;

public class FileReaderWriterTest {
    //读取文件内容显示在控制台上
    @Test
    public void test1() {
        // 1. 创建File类的对象
        File file1 = new File("hello.txt");

        //创建输入型字符流用于读取数据
        FileReader fr = null;
        try {
            fr = new FileReader(file1);

            // read(): 返回读入的一个字符。如果达到文件末尾，返回-1
            //        int data = fr.read();
            //        while (data != -1) {
            //            System.out.print((char) data);
            //            data = fr.read();
            //        }
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //流资源的关闭操作 (一定要执行，否则会造成内存的泄露)
        try {
            assert fr != null;
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //对read()操作升级：使用read的重载方法，读入字符数组
    @Test
    public void test2() {
        File file1 = new File("hello.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file1);
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuf[i]);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                assert fr != null;
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //写出到文件
    @Test
    public void test3() {
        File file1 = new File("hello1.txt");

        FileWriter fw = null;
        try {
            fw = new FileWriter(file1);

            fw.write("哈哈哈\n");
            fw.write("嘻嘻嘻\n");
            fw.write("呜呜呜\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                assert fw != null;
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //文件的复制
    @Test
    public void test4() {
        // 1. 创建File类的对象
        File file1 = new File("hello.txt");
        File file2 = new File("hello2.txt");
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(file1);
            fw = new FileWriter(file2);

            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                fw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            assert fr != null;
            fr.close();
            assert fw != null;
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
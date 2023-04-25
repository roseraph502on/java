package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return name +", "+price+"��";
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("�ڹ�", 25000));
        bookList.add(new Book("���̽�", 15000));
        bookList.add(new Book("�ȵ���̵�", 30000));

       
        int sum = 0;
        System.out.println("20000�� �̻��� å ��� - ");
        for(Book b : bookList) {
            //��� å�� ���� �հ�
            sum += b.getPrice();
            //2���� �̻� ���
            if(b.getPrice()>=20000)
                System.out.println(b);
        }
        System.out.println();
        System.out.println("å ���� �� - "+sum);
    }
}

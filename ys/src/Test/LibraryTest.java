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
        return name +", "+price+"원";
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("자바", 25000));
        bookList.add(new Book("파이썬", 15000));
        bookList.add(new Book("안드로이드", 30000));

       
        int sum = 0;
        System.out.println("20000원 이상의 책 목록 - ");
        for(Book b : bookList) {
            //모든 책의 가격 합계
            sum += b.getPrice();
            //2만원 이상만 출력
            if(b.getPrice()>=20000)
                System.out.println(b);
        }
        System.out.println();
        System.out.println("책 가격 합 - "+sum);
    }
}

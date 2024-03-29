package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * @Author: EzioHe
 * @Date: 2023/4/19 15:35
 */
public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));
        col.add("jack");
        //System.out.println("col=" + col);

        //遍历 col 对应的迭代器
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) { //判断是否还有数据
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }

        //如果希望再次遍历，需要重置迭代器
        System.out.println("=====第二次遍历=====");
        iterator = col.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
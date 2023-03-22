package com.itheima.assignment;
class Book{
    String name;
    String author;
    int saleNum;

    public Book() {
    }

    public Book(String name, String author, int saleNum) {
        this.name = name;
        this.author = author;
        this.saleNum = saleNum;
    }
    void setBook(String name, String author, int saleNum){
        this.name = name;
        this.author = author;
        this.saleNum = saleNum;
    }
    void printBook(){
        System.out.println("书名："+name);
        System.out.println("作者："+author);
        System.out.println("出售储量："+saleNum);
    }
}
public class Lesson5 {
    public static void main(String[] args) {
        Book b = new Book("完美世界","西红柿",12);
        //b.setBook("1","2",4);
        b.printBook();
    }


}

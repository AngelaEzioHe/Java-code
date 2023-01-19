package hyfstu.codeblock;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("你好，李焕英");
        System.out.println("======================");
        Movie movie1 = new Movie("唐人街探案", 100, "小明");
    }
}
class Movie{
    private String name;
    private double price;
    private String director;
    {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始");
        System.out.println("电影正式开始");
    }
    public Movie(String name) {
//        System.out.println("电影屏幕打开");
//        System.out.println("广告开始");
//        System.out.println("电影正式开始");
        System.out.println("public Movie(String name) 构造器被调用..");
        this.name = name;
    }

    public Movie(String name, double price) {
//        System.out.println("电影屏幕打开");
//        System.out.println("广告开始");
//        System.out.println("电影正式开始");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
//        System.out.println("电影屏幕打开");
//        System.out.println("广告开始");
//        System.out.println("电影正式开始");
        System.out.println("public Movie(String name, double price, String director) 构造器被调用");
        this.name = name;
        this.price = price;
        this.director = director;
    }

}
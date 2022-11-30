# Java 笔记

## 快速入门

**第一个程序：**

```java
//1.public class test表示Hello是一个类，是一个public共有的类
//2.Hell0{ }表示一个类的开始和结束
//3.public static void main(String[] args) 表示一个主方法，即我们程序的入口
//4.main{ }表示方法的开始和结束
//5. System.out.printIn(""); 表示输出双引号内的东西到屏幕上
//public类只能有一个
public class Hello     //注意，这块儿的“Hello”要和文件名一致
{
    public static void main(String[] args)
    {
        System.out.printIn("hello world~");    //注意，println是小写的L不是大写的I
	}
}
```



## +号使用

```java
System.out.println(100+98); //198
System.out.println("100"+98); //10098
System.out.println(100+3+"hello"); //103hello
System.out.println("hello"+100+3); //hello1003
```

**注意：**

1. 从左到右，依次运算
2. 左右两方，有一方为字符串时，做拼接运算
3. 左右两方都是数值时，做四则运算



## 整型细节

```java 
int n1 =1;
long n2 = 1L;//定义long型常量为其赋值时要在常量后加"l"或"L"。
```



## 浮点数细节

```java
float	f1 = 1.1; //写法错误，java中，小数默认为double型，若为float型常量赋值，应在常量后加上“F”。
float	f2 = 1.1F;//正确
double	f3 = .123; //正确写法，0.123可以省略小数点前的0，但小数点不可省略
double	f4 = 5.12e2; //意为5.12*(10^2)
double	f5 = 2.7;
double	f6 = 8.1 /3; //结果为2.6999997
```

*对运算结果是小数的进行判断时，要小心。应该是以两个数的差值的绝对值在某个精度范围内进行判断*

```java
if(Math.abs(f5-f6) < 0.00001)
{
    System.out.println("差值非常小，到我的规定精度，认为相等");
}
```

## 字符型细节

**java中，char类型的本质是一个整数，再默认输出时，是unicode码对应的字符**

```java
char c1 ='何';
System.out.println((int)c1); //“何”对应的unicode码为20309
char c2 = 20309;
System.out.println(c2);
```

```java
System.out.println('a' + 10); //结果为107。（编译器先将‘a’转换为97，再和10进行运算。
```



## bool类型细节

**布尔类型：boolean**		值只能为 true 或 false

不可以以0或非0的整数替代 false 和 true

**和C语言不同**

**和C语言不同**

**和C语言不同**



## 基本数据类型转换

char -> int -> long -> float -> double

byte -> short -> int -> long -> float -> double

**所以，以下代码正确**

```java
int a = 'c';
double d = 80;
```



### 强制类型转换

**注意：**

- 会有精度损失
- 会有溢出

byte 和 char、short进行运算时，都先转换成int处理

### String类型基本转换

**基本数据类型 + " "就转换成字符串格式了**

```java
//基本数据类型->String
int n1 = 100;
float f1 = 1.1F;
double d1 = 4.5;
boolean b1 = true;
String s1 = n1 + "";
String s2 = f1 + "";
String s3 = d1 + "";
String s4 = b1 + "";
System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
```

 

**用特定的类将字符串转换成对应的基本数据类型：**

```java
//String->对应的基本数据类型
String s5 = "123";
int num1 = Integer.parseInt(s5);
double num2 = Double.parseDouble(s5);
float num3 = Float.parseFloat(s5);
long num4 = Long.parseLong(s5);
byte num5 = Byte.parseByte(s5);
boolean b = Boolean.parseBoolean("true");
short num6 = Short.parseShort(s5);

System.out.println(num1);
System.out.println(num2);
System.out.println(num3);
System.out.println(num4);
System.out.println(num5);
System.out.println(num6);
System.out.println(b);
```


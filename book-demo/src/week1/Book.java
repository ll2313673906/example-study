package week2;

/**
 * 打印书籍信息
 * @author 刘恋
 * 2019.3.19
 * @param <T>
 */

public class Book<T> {

   private T[] bookInfo;// 数组类型形参：书籍信息
    public Book(T[] bookInfo){    // 参数为书籍信息的Book<T>类构造方法
        this.bookInfo = bookInfo; // 为书籍信息赋值


    }
    public void showBookInfo(){
        System.out.println("书名\t\t作者\t\t价格\t\t是否附赠光盘");
        System.out.println("-----------------------------");
        for (int i = 0; i < bookInfo.length; i++){
            System.out.print(bookInfo[i] + "\t");
        }
    }

    public static void main(String[] args) {
        String[] info = {"《零基础学java》","明日科技","69.80","附赠光盘"};
        Book<String> book = new Book<String>(info);
        book.showBookInfo();
    }
}

package week2;

/**
 * 借阅《战争与和平》
 * @author 刘恋
 */

public class BorrowABook {
    // 无参构造方法
    public BorrowABook(){

    }
    // 参数为书名的借书方法
    public void borrow(String name){
        // 输出借书的书名
        System.out.println("请前往借阅登记处领取" + name + "。");
    }
    public static void main(String[] args){
        BorrowABook book = new BorrowABook();
        book.borrow("《战争与和平》");
    }
}

package week2;

import java.util.Scanner;

/**
 * 用户登录验证
 * @author 刘恋
 * 2019.3.21
 */
public class LoginService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建扫描器
        String password;
        do {
            System.out.println("请输入6位数字密码");
            password = scanner.nextLine();  //将用户在控制台上输入的密码记录下来

        }while (!"543022".equals(password));
        System.out.println("登录成功");
        scanner.close();

    }
}

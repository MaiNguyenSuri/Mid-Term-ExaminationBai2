/*Viết chương trình nhập mật khẩu, yêu cầu mật khẩu phải có từ 10 ký tự trở lên trong đó có ít nhất 1 ký tự in hoa, 1 ký tự số,
1 ký tự đặc biệt như . - _ …

Nếu mật khẩu ít hơn 10 ký tự thông báo mật khẩu yếu
Nếu thiếu một trong các ký tự đặc biệt thì thông báo mật khẩu chưa đủ mạnh*/

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập  password: ");
        String input = scanner.nextLine();

        checkPassword(input);

    }

    public static void checkPassword(String s) {

        boolean isDigit = false;
        boolean isSpecialLetter = false;
        boolean isUpperCase = false;

        char[] special = new char[]{'-', '_', '.'};

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (Character.isDigit(c)) {
                isDigit = true;
            } else if (Character.isUpperCase(c)) {
                isUpperCase = true;
            } else {
                for (int j = 0; j < special.length; j++) {
                    if (c == special[j]) {
                        isSpecialLetter = true;
                        break;
                    }
                }
            }
        }

        if (!isDigit || !isUpperCase || !isSpecialLetter) {
            System.out.println("Mật khẩu không hợp lệ");
        } else if (arr.length < 10) {
            System.out.println("Mật khẩu yếu");
        } else {
            System.out.println("Mật khẩu mạnh");
        }
    }
}

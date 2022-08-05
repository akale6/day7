//使用switch把小写类型的char型转为大写（键盘输入），只转换a b c d e 其他输出为other

import java.util.Scanner;

public class SwitchExercise01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入小写字母a-e");
        char c1 = scanner.next().charAt(0);
        switch (c1) {
            case 'a':
                System.out.println("A");
                break;
            case  'b':
                System.out.println("B");
                break;
            case  'c' :
                System.out.println("C");
                break;
            case  'd' :
                System.out.println("D");
                break;
            case  'e' :
                System.out.println("E");
                break;
            default:
                System.out.println("你输入的有误");
        }

    }
}

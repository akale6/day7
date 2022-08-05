import java.util.Scanner;

//对学生成绩大于60分的，输出“合格” 低于60分的 输出“不合格”（输入的成绩不能大于100）
public class SwitchExercise02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的成绩");
        double score = scanner.nextDouble();
        if (score >= 0 && score <= 100){
        switch ((int)(score / 60)){
            case 0 :
                System.out.println("不及格");
                break;
            case 1 :
                System.out.println("及格");
                break;
            default:
                System.out.println("输入有误");

        }

    }else {
            System.out.println("输入的成绩在0-100");
        }

        }
}

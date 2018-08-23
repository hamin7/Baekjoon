import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int num = scan.nextInt();

    int sum = 0;
    String line = scan.next();

    for(int i = 0; i < num; i++){
      sum += line.charAt(i)-'0';
    }
    System.out.println(sum);
  }
}

/* String -> char -> int 변환이 핵심 문제

답은 아스키 코드를 사용

각 숫자의 아스키코드는 0을 의미하는 48을 뺴주면 자신의 수를 가지게 된다.
그래서 아래와 같이 계산해 주면 숫자값을 얻을 수 있다.

line.charAt(i)-'0';

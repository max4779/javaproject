package study;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean stop=true;
        Scanner number;
        int menuNumber;

        System.out.printf("*** 영단어 마스터 ***\n");

        while(stop){
            System.out.println("********************\n");
            System.out.println("1. 모든 단어 보기\n");
            System.out.println("2. 수준별 단어 보기\n");
            System.out.println("3. 단어 검색\n");
            System.out.println("4. 단어 추가\n");
            System.out.println("5. 단어 수정\n");
            System.out.println("6. 단어 삭제\n");
            System.out.println("7, 파일 저장\n");
            System.out.println("0. 나가기\n");
            System.out.println("********************\n");
            System.out.println("=> 원하는 메뉴는?");
            number=new Scanner(System.in);
            menuNumber=number.next;
            switch(menuNumber){
                case 1:

            }
        }

        switch()

    }
}

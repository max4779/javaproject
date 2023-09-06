package study;
import java.util.Scanner;

public class wordManager {
    Scanner scan=new Scanner(System.in);
    wordCRUD WordCRUD;
    wordManager(){
        WordCRUD = new wordCRUD(scan);
    }
    public void start(){
        while(true) {
            int menuNumber = menu();
            System.out.println(menuNumber);

            if(menuNumber==0) break;

            else if(menuNumber==1){
                WordCRUD.viewList();
            }

            else if(menuNumber==4){
                WordCRUD.addWord();
            }

            else if(menuNumber==5){
                WordCRUD.Update();
            }

            else if(menuNumber==6){
                WordCRUD.Delete();
            }
        }
    }
    public int menu(){
        System.out.println("*** 영단어 마스터 ***");
        System.out.println("********************");
        System.out.println("1. 모든 단어 보기");
        System.out.println("2. 수준별 단어 보기");
        System.out.println("3. 단어 검색");
        System.out.println("4. 단어 추가");
        System.out.println("5. 단어 수정");
        System.out.println("6. 단어 삭제");
        System.out.println("7, 파일 저장");
        System.out.println("0. 나가기");
        System.out.println("********************");
        System.out.println("=> 원하는 메뉴는?");

        return scan.nextInt();
    }
}

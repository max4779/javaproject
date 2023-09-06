package study;
import java.util.ArrayList;
import java.util.Scanner;
public class wordCRUD implements ICRUD{
    ArrayList<wordData>list;
    Scanner scan;

    wordCRUD(Scanner scan){
     list=new ArrayList<>();
     this.scan=scan;
    }
    @Override
    public Object add() {
        System.out.println("=>  난이도(1,2,3) & 새 단어 입력 : ");
        int level=scan.nextInt();
        String word=scan.nextLine();

        System.out.println("뜻 입력 : ");
        String meaning = scan.nextLine();

        return new wordData(0, level, word, meaning);
    }

    public void addWord(){
        wordData first =(wordData)add();
        list.add(first);
        System.out.println("새 단어가 단어장에 추가되었습니다.");
    }


    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectOne(int id) {

    }
}

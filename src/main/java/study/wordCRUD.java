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
    public void viewList(){
        System.out.println("=> 원하는 메뉴는? ");

        for(int i=0; i<list.size();i++){
            System.out.print((i+1)+ " ");
            System.out.println(list.get(i).toString());
        }
    }
    public ArrayList<Integer> viewList(String keyword){
        ArrayList<Integer> updateList=new ArrayList<>();
        int j=0;

        System.out.println("=> 원하는 메뉴는? ");

        for(int i=0; i<list.size();i++){
            String word=list.get(i).getWord();

            if(!word.contains(keyword)){
                continue;
            }

            System.out.print((j+1)+ " ");
            System.out.println(list.get(i).toString());
            updateList.add(i);
            j++;
        }
        return updateList;
    }

    public void Update(){
        System.out.println("=> 수정할 단어 검색 : ");
        String keyword=scan.next();
        ArrayList<Integer> updateList = this.viewList(keyword);

        System.out.println("=> 수정할 번호 검색 : ");
        int number=scan.nextInt();
        scan.nextLine();

        System.out.println("=> 뜻 입력 : ");
        String meaning = scan.nextLine();
        wordData word=list.get(updateList.get(number-1));
        word.setMeaning(meaning);
    }

    public void Delete(){
        System.out.println("=> 삭제 할 단어 검색 : ");
        String keyword=scan.next();
        ArrayList<Integer> updateList = this.viewList(keyword);

        System.out.println("=> 삭제 할 번호 검색 : ");
        int number=scan.nextInt();
        scan.nextLine();

        System.out.println("=> 정말로 삭제하시겠습니까? (Y/N) ");
        String ans = scan.next();
        if(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("Y")){
            list.remove((int)updateList.get(number-1));
            System.out.println("단어가 삭제되었습니다. ");
        }
        else{
            System.out.println("취소되었습니다.");
        }
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

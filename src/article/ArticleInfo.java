package article;

import java.util.ArrayList;

public class ArticleInfo {

    public static void main(String[] args) {
        Article ar1 = new Article("Art1","sdf-fds-sdf", 26.2);
        Article ar2 = new Article("Art2","sdf-fds-sdf", 12.1);
        Article ar3 = new Article("Art3","sdf-fds-sdf", 26.1);
        Article ar4 = new Article("Art4","sdf-fds-sdf",11.1);

        ArrayList<Article> list = new ArrayList<>();
        list.add(ar1);
        list.add(ar2);
        list.add(ar3);
        list.add(ar4);

        System.out.printf("all");

        for (Article a:list
             ) {
            System.out.println(a);
        }

        System.out.println("-------------------------------------------------------------");


        ArticleInfo  info = new ArticleInfo();
        info.testArticle(list, a -> a.getPrice()>20);

    }




    public void testArticle(ArrayList<Article> list, CheckArtikle ca){


        for (Article a:list
             ) {

            if(ca.checkArticle(a)){
                System.out.println(a);
            }


        }

    }


}
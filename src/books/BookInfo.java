package books;

import java.util.ArrayList;

public class BookInfo {

    public static void main(String[] args) {
        ArrayList<Book> booklist  = new ArrayList<>();

        booklist.add(new Book("Capra cu tri iezi", 2003));
        booklist.add(new Book("fffff", 2005));
        booklist.add(new Book("ffffdssd", 2008));
        booklist.add(new Book("lk;sdlk", 2006));

        BookInfo binfo = new BookInfo();
        binfo.testBook(booklist , ( Book book) -> book.getJahr() >2002);
    }


    void testBook(ArrayList<Book> list, CheckBook cb){

        for (Book b: list
             )
            if (cb.checkBook(b)){
                System.out.println(b);
            }

        }

    }





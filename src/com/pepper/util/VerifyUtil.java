package com.pepper.util;

import com.pepper.bean.Book;

public class VerifyUtil {

    public static boolean compareTo(Book book1, Book book2) {
        boolean resul1 = false;
        boolean resul2 = false;
        boolean resul3 = false;
        boolean resul4 = false;
        if (book1.getName() == null && book2.getName() == null) {
            resul1 = true;
        }
        if ((book1.getName() != null && book1.getName().equals(book2.getName()))) {
            resul2 = true;
        }
        if (resul1 || resul2) {
            resul1 = true;
        }

        if (book1.getAuthor() == null && book2.getAuthor() == null) {
            resul3 = true;
        }
        if ((book1.getAuthor() != null && book1.getAuthor().equals(book2.getAuthor()))) {
            resul4 = true;
        }
        if (resul3 || resul4) {
            resul3 = true;
        }
        if (resul1 && resul3 && book1.getId()==book2.getId()) {
            return true;
        }
        return false;
    }
}

import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static public String findBook(Book[] booksArr, int bookCode) {
        for (Book book : booksArr) {
            if (book.getBookCode() == bookCode) {
                return book.getName();
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Book book1 = new Book(1, "Đường Xưa Mây Trắng", 200000, "Thích Nhất Hạnh");
        Book book2 = new Book(2, "Cứ bình tĩnh", 120000, "Nguyễn Nhật Minh");
        Book book3 = new Book(3, "Đắc Nhân Tâm", 250000, "Dale Carnegie");
        Book book4 = new Book(4, "Tuổi trẻ đáng giá bao nhiêu", 175000, "Rosie Nguyễn");
        Book book5 = new Book(5, "Hiểu về trái tim", 215000, "Minh Niệm");
        Book book6 = new Book(6, "Con đường đến tự do", 215000, "DaLai Lama");

        Book[] booksArr = {book1, book2, book3, book4, book5, book6};

        double sum = 0;
        for (Book book : booksArr) {
            sum += book.getPrice();
        }
        System.out.println("Tổng 6 cuốn sách là: ");
        System.out.println(sum);


        System.out.println("Sách có giá trên 100");
        for (Book book : booksArr) {
            if (book.getPrice() > 100) {
                System.out.println(book.getName());
            }
        }

        System.out.println("Sách có tác giả tên Minh là: ");
        for (Book book : booksArr) {
            if (Objects.equals(book.getAuthor(),"Minh")) {
                System.out.println(book.getName());
            }
        }

        System.out.println("Tìm tên sách có code 3: ");
        System.out.println(findBook(booksArr,3));
    }
}
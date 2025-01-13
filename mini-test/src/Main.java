//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //Tạo 3 cuốn sách thuộc lớp ProgrmmaingBook
        ProgrammingBook pb1 = new ProgrammingBook(001, "Java Basics", 150, "Author A", "Java", "Spring");
        ProgrammingBook pb2 = new ProgrammingBook(002, "Python Advanced", 200, "Author B", "Python", "Django");
        ProgrammingBook pb3 = new ProgrammingBook(003, "Java Patterns", 180, "Author C", "Java", "None");

        //Tạo 3 cuốn sách thuộc lớp FictionBook
        FictionBook fb1 = new FictionBook(101, "Fiction One", 120, "Author D", "Viễn tưởng 1");
        FictionBook fb2 = new FictionBook(102, "Fiction Two", 90, "Author E", "Viễn tưởng 2");
        FictionBook fb3 = new FictionBook(103, "Fiction Three", 70, "Author F", "Viễn tưởng 1");

        Book[] books = {pb1, pb2, pb3, fb1, fb2, fb3};

        //Tíốn tổng tiền của 6 cuốn sách
        double totalPrice = 0;
        for (Book book : books) {
            totalPrice += book.getPriceAfterDiscount();
        }
        System.out.println("Tổng giá của tất cae các cuốn sách sau khi giảm giá: " + totalPrice);

        //Đếm số sách ProgrammingBook có ngôn ngữ là Java
        int javaBookCount = 0;
        for (Book book : books) {
            if (book instanceof ProgrammingBook) {
                if (((ProgrammingBook) book).getLanguage().equalsIgnoreCase("Java")) {
                    javaBookCount++;
                }
            }
        }
        System.out.println("Số sách ProgrammingBook có ngôn ngữ 'Java': " + javaBookCount);

        //Đếm số sách Fiction có category là "Viễn tưởng 1"
        int fictionCategoryCount = 0;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                if (((FictionBook) book).getCategory().equalsIgnoreCase("Viễn tưởng 1")) {
                    fictionCategoryCount++;
                }
            }
        }
        System.out.println("Số sách Fiction có category là: " + fictionCategoryCount);

        //Số sách Fiction có giá trên < 100
        int fictionPriceCount = 0;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                if (book.getPrice() < 100) {
                    fictionPriceCount++;
                }
            }
        }
        System.out.println("Số sách Fiction có giá < 100: " + fictionPriceCount);
    }
}
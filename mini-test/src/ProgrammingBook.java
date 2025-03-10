public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public ProgrammingBook(int bookCode, String name, double price, String author, String language, String framework) {
        super (bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public double getPriceAfterDiscount() {
        return getPrice() * 0.95; // 5% discount
    }
}

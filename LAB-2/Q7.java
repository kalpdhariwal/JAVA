class Q7 {
    String title;
    String author;
    int pages;

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Q7 book1 = new Q7();
        book1.title = "Rich Dad Poor Dad";
        book1.author = "Robert Kiyosaki";
        book1.pages = 450;

        Q7 book2 = new Q7();
        book2.title = "The Psychology of Money";
        book2.author = "Morgan Housel";
        book2.pages = 300;

        book1.displayDetails();
        book2.displayDetails();
    }
}

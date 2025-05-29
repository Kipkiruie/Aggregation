public class Book {
    String name;
    int year;
    int pages;

    Book(String name,int year, int pages){
        this.name  = name;
        this.pages = pages;
        this.year = year;
    }
    String displayInfo(){
        return this.name +" "+  this.pages+" "+ this.year;
    }
}

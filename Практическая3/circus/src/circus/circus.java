package circus;

public class circus {
	private String NameofThePresentation;
	private String City;
	private int PremiereDate;
	private int TicketPrice;
	private String Author;
	private String Genre;
	private int NumberofActors;
	
    public circus(String nameofThePresentation, String city, int premiereDate, int ticketPrice,String author, String genre, int numberofactors){
    	this.NameofThePresentation = nameofThePresentation;
    	this.City= city;
    	this.PremiereDate = premiereDate;
        this.TicketPrice = ticketPrice;
        this.Author= author;
        this.Genre = genre;
        this.NumberofActors = numberofactors;
    }
   
    public String getNameofThePresentation(){
        return NameofThePresentation;
    }
 
    public void setNameofThePresentation(String nameofThePresentation){
    	this.NameofThePresentation = nameofThePresentation;
    }
    
    public String City(){
        return City;
    }
 
    public void setCity(String city){
    	this.City= city;
    }
    
    public int getPremiereDate(){
        return PremiereDate;
    }
 
    public void setPremiereDate(int premiereDate){
    	this.PremiereDate = premiereDate;
    }
    
    public int getTicketPrice(){
        return TicketPrice;
    }
 
    public void TicketPrice(int ticketPrice){
    	 this.TicketPrice = ticketPrice;
    }
    
    public String getAuthor(){
        return Author;
    }
 
    public void setAuthor(String author){
    	 this.Author= author;
    }
    public String getGenre() {
    	return Genre;
    }
    public void setGenre(String genre) {
    	 this.Genre = genre;
    }
    public int getNumberofActors(){
        return NumberofActors;
    }
 
    public void setNumberofActors(int numberofactors){
    	 this.NumberofActors = numberofactors;
    }
    
    public String toString(){
        return "Название представления :" + NameofThePresentation + "\n " +"Город: " + City + "\n " + "Дата премьеры: " + PremiereDate + "\n " +"Цена билета: " + TicketPrice + "\n " + "Автор: " + Author + "\n "  + "Жанр: " + Genre + "\n "  + "Количество актеров: " + NumberofActors;
    
    }
    public static void main (String[] args) {
    	Circus cir = new Circus ("Огни", "Самара", "03.04.2022", 1500,"Павлов Алексей","Фэнтэзи",50);
        System.out.print(cir);
    }
}

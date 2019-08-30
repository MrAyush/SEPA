class Date {
	int day, month, year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void printDate() {
		System.out.print(day + "-" + month + "-" + year);
	}
	public void calculateAge(Date date) {
		System.out.print(date.year - this.year + " years " + (date.month % this.month) + " months " + (date.day % this.day));
	}
	
}

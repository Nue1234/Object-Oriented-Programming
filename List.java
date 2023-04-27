public class List {
	int book1;
	int book2;
	int book3;

	public List(int book1, int book2, int book3)
  {
        this.book1 = book1;
        this.book2 = book2;
        this.book3 = book3;

	}
	public int getcopy1() {
		return book1;
	}
	public void setcopy1(int copy) {
		this.book1 = copy;
	}
	public int getcopy2() {
		return book2;
	}
	public void setcopy2(int copy) {
		this.book2 = copy;
	}
	public int getcopy3() {
		return book3;
	}
	public void setcopy3(int copy) {
		this.book3 = copy;
	}

}

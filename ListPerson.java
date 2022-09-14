import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListPerson {
	// 1. fields
	private ArrayList<Person> listPerson;

	// 2. get set
	public ArrayList<Person> getListPerson() {
		return listPerson;
	}

	public void setListPerson(ArrayList<Person> listPerson) {
		this.listPerson = listPerson;
	}

	// 3.constructors
	public ListPerson() {
		this.listPerson = new ArrayList<Person>();
	}

	// 4. in out
	private void inMenu() {
		System.out.println("1. Nhap/them Student.");
		System.out.println("2. Nhap/them Employee.");
		System.out.println("3. Nhap/them Customer.");
		System.out.println("0. Thoat.");
	}

	public void nhap(Scanner sc) {
		boolean flag = true;
		do {
			inMenu();
			dummyData();
			System.out.println("Moi chon: ");
			int chon = Integer.parseInt(sc.nextLine());
			Person person;
			switch (chon) {
			case 1:
				person = new Student();
				person.nhap(sc);
				listPerson.add(person);
				break;
			case 2:
				person = new Employee();
				person.nhap(sc);
				listPerson.add(person);
				break;
			case 3:
				person = new Customer();
				person.nhap(sc);
				listPerson.add(person);
				break;
			case 0:
				flag = false;
				break;
			default: System.out.println("Moi nhap tu 0 den 3!");
			}
		} while (flag);
	}

	public void xuat() {
		for (Person ps : this.listPerson) {
			ps.xuat();
		}
	}

	//5. business
	public void dummyData() {
		Person person;
		person = new Student("long", "92 Tân định", "1", "abc@gmail.com", 8, 4, 9);
		this.listPerson.add(person);

		person = new Student("hùng", "2 Nhà bè", "2", "daabc@gmail.com", 5, 10, 9);
		this.listPerson.add(person);

		person = new Employee("Lan", "4 Phú Tân", "3", "fdaabc@gmail.com", 15, 20);
		this.listPerson.add(person);

		person = new Employee("Việt", "3 Bến Tre", "4", "dgbc@gmail.com", 20, 20);
		this.listPerson.add(person);

		person = new Employee("Ngà", "4 Tiền Giang", "5", "ddgbc@gmail.com", 30, 24);
		this.listPerson.add(person);

		person = new Customer("An", "5 Đà Nẵng", "6", "ddgbc@gmail.com", "CyberLearn", 20, "Good");
		this.listPerson.add(person);

		person = new Customer("Vùng", "8 Đà Nẵng", "7", "rdgbc@gmail.com", "CyberSoft", 25, "Very Good");
		this.listPerson.add(person);

	}
	
	public void xoaTheoMa(String maXoa) {
		for (Person ps : this.listPerson) {
			if(ps.getMa().equalsIgnoreCase(maXoa)) {
				this.listPerson.remove(ps);
			}
		}
	}
	
	//Sap xep theo abc
	private void interchangeSort(ArrayList<Person> _list) {
		int i, j;
		for(i =0; i<_list.size()-1;i++) {
			for(j = i+1; j<_list.size();j++) {
				Person personI = _list.get(i);
				Person personJ = _list.get(j);
				if(personJ.getHoTen().compareToIgnoreCase(personI.getHoTen()) < 0) {
					Collections.swap(_list, i, j);
				}
			}
		}
	}
	
	public void sortName() {
		interchangeSort(listPerson);
	}
}

import java.util.Scanner;

/*
 * Muc dich: quan ly truong dan lap quoc te
 * Ngay tao: 23/10/2021
 * Nguoi tao: Dustin
 * Version: 1.0
 * 
 * */
public class Person {
	//1.fields
	protected String hoTen;
	protected String diaChi;
	protected String ma;
	protected String email;
	//2.get set
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//3. constructor
	public Person() {
		
	}
	public Person(String hoTen, String diaChi, String ma, String email) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.ma = ma;
		this.email = email;
	}
	
	//4. in out
	public void nhap(Scanner sc) {
		System.out.println("Nhap ho ten: ");
		this.hoTen = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		this.diaChi = sc.nextLine();
		System.out.println("Nhap ma: ");
		this.ma = sc.nextLine();
		System.out.println("Nhap email: ");
		this.email = sc.nextLine();
	}
	
	public void xuat() {
		System.out.print("Ho ten: "+this.hoTen+"\tMa: "+this.ma+"\tDia chi: "+this.diaChi+
				"\tEmail: "+this.email);
	}
	
	
}

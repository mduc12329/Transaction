import java.util.Scanner;

/*
 * Muc dich: quan ly truong dan lap quoc te
 * Ngay tao: 23/10/2021
 * Nguoi tao: Dustin
 * Version: 1.0
 * 
 * */
public class Employee extends Person {
	// 1.fields
	protected float soNgayLamViec;
	protected int luongTheoNgay;
	// 2. get, set

	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	public int getLuongTheoNgay() {
		return luongTheoNgay;
	}

	public void setLuongTheoNgay(int luongTheoNgay) {
		this.luongTheoNgay = luongTheoNgay;
	}

	// 3. constructors
	public Employee() {

	}

	public Employee(String hoTen, String diaChi, String ma, String email, float soNgayLamViec, int luongTheoNgay) {
		super(hoTen, diaChi, ma, email);
		this.soNgayLamViec = soNgayLamViec;
		this.luongTheoNgay = luongTheoNgay;
	}
	
	//4. in out
	@Override
	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.println("Nhap so ngay lam viec: ");
		this.soNgayLamViec = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap luong theo ngay: ");
		this.luongTheoNgay = Integer.parseInt(sc.nextLine());
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\tSo ngay lam viec: "+this.soNgayLamViec+"\tLuong theo ngay: "+this.luongTheoNgay);
	}
}

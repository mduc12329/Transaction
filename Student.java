import java.util.Scanner;

/*
 * Muc dich: quan ly lop con student
 * Ngay tao: 23/10/2021
 * Nguoi tao: Dustin
 * Version: 1.0
 * 
 * */
public class Student extends Person {
	// 1.fields
	protected float toan, ly, hoa;

	// 2. get set
	public float getToan() {
		return toan;
	}

	public void setToan(float toan) {
		this.toan = toan;
	}

	public float getLy() {
		return ly;
	}

	public void setLy(float ly) {
		this.ly = ly;
	}

	public float getHoa() {
		return hoa;
	}

	public void setHoa(float hoa) {
		this.hoa = hoa;
	}

	// 3.constructors
	public Student() {

	}

	public Student(String hoTen, String diaChi, String ma, String email, float toan, float ly, float hoa) {
		super(hoTen, diaChi, ma, email);
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}

	// 4. in out
	@Override
	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.println("Nhap diem toan: ");
		this.toan = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap diem ly: ");
		this.ly = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap diem hoa: ");
		this.hoa = Float.parseFloat(sc.nextLine());
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\tToan: " + this.toan + "\tLy: " + this.ly + "\tHoa: " + this.hoa);
	}

}

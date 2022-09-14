import java.util.Scanner;

/*
 * Muc dich: quan ly truong dan lap quoc te
 * Ngay tao: 23/10/2021
 * Nguoi tao: Dustin
 * Version: 1.0
 * 
 * */
public class Customer extends Person {
	// 1. fields
	protected String tenCongTy;
	protected float triGiaHoaDon;
	protected String danhGia;
	// 2. get set

	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public float getTriGiaHoaDon() {
		return triGiaHoaDon;
	}

	public void setTriGiaHoaDon(float triGiaHoaDon) {
		this.triGiaHoaDon = triGiaHoaDon;
	}

	public String getDanhGia() {
		return danhGia;
	}

	public void setDanhGia(String danhGia) {
		this.danhGia = danhGia;
	}

	// 3.constructors
	public Customer() {

	}

	public Customer(String hoTen, String diaChi, String ma, String email, String tenCongTy, float triGiaHoaDon, String danhGia) {
		super(hoTen, diaChi, ma, email);
		this.tenCongTy = tenCongTy;
		this.triGiaHoaDon = triGiaHoaDon;
		this.danhGia = danhGia;
	}
	
	//4. in out
	@Override
	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.println("Nhap vao ten cong ty: ");
		this.tenCongTy = sc.nextLine();
		System.out.println("Nhap vao tri gia hoa don: ");
		this.triGiaHoaDon = Float.parseFloat(sc.nextLine());
		System.out.println("Danh gia cong ty: ");
		this.danhGia = sc.nextLine();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\tTen cong ty: "+this.tenCongTy+"\tTri gia hoa don: "+this.triGiaHoaDon+"\tDanh gia: "+this.danhGia);
		
	}
	
}

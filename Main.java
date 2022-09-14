import java.util.Scanner;

/*
 * Muc dich: quan ly truong dan lap quoc te
 * Ngay tao: 23/10/2021
 * Nguoi tao: Dustin
 * Version: 1.0
 * 
 * */

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		doMenu(sc);
	}

	private static void inMenu() {
		System.out.println("1. Them person.");
		System.out.println("2. Xoa theo ma.");
		System.out.println("3. Xuat danh sach.");
		System.out.println("4. Xuat danh sach sap xep.");
		System.out.println("0. Thoat.");
	}

	private static void doMenu(Scanner sc) {
		boolean flag = true;
		ListPerson objListPerson = new ListPerson();
		objListPerson.dummyData();
		do {
			inMenu();
			System.out.println("Moi chon: ");
			int nhap = Integer.parseInt(sc.nextLine());
			switch (nhap) {
			case 1:
				objListPerson.nhap(sc);
				break;
			case 2:
				System.out.println("Nhap ma xoa: ");
				String nhapMaXoa = sc.nextLine();
				objListPerson.xoaTheoMa(nhapMaXoa);
				break;
			case 3:
				objListPerson.xuat();
				break;
			case 4:
				objListPerson.sortName();
				objListPerson.xuat();
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Moi nhap tu 0 den 3!");
			}
		} while (flag);
	}
}

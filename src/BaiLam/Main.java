package BaiLam;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void Menu() {
		System.out.println("Nhap 1 trong cac kieu so sau: ");
        System.out.println("1. So Thuc");
        System.out.println("2. Phan So");
        System.out.println("3. So Phuc");
        System.out.println("4. Tong ket");
        System.out.println("0. Thoat chuong trinh");
	}
    public static void main(String[] args) {

        ArrayList<Object> mixList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int chon;
        
        do {
        	Menu();
        	chon = sc.nextInt();

            switch (chon) {
                case 1:
                	System.out.println("Nhap so thuc: ");
                	float t=sc.nextFloat();
                	SoThuc st = new SoThuc(t);
                	mixList.add(st);
                    break;
                case 2:
                	System.out.println("Nhap tu so: ");
					int x=sc.nextInt();
					System.out.println("Nhap mau so: ");
					int y=sc.nextInt();
                	PhanSo ps = new PhanSo(x, y);
                    mixList.add(ps);
                    break;
                case 3:
                	System.out.println("Nhap phan thuc: ");
					int a=sc.nextInt();
					System.out.println("Nhap phan ao: ");
					int b=sc.nextInt();
                    SoPhuc sp = new SoPhuc(a, b);
                    mixList.add(sp);
                    break;
                case 4:
                	SoThuc sum1 = new SoThuc(0);
                	PhanSo sum2 = new PhanSo(0, 1);
                	SoPhuc sum3 = new SoPhuc(0, 0);
                	
                    for (Object num : mixList) {
                    	if (num instanceof SoThuc) {
                    		SoThuc sothuc = (SoThuc) num;
                            sothuc.hienThi();
                            sum1 = (SoThuc) sum1.add(sothuc);
                        }
                    	else if (num instanceof PhanSo) {
                            PhanSo phanso = (PhanSo) num;
                            phanso.hienThi();
                            sum2 = (PhanSo) sum2.add(phanso);
                        }
                        else if (num instanceof SoPhuc) {	
                            SoPhuc sophuc = (SoPhuc) num;
                            sophuc.hienThi();
                            sum3 = (SoPhuc) sum3.add(sophuc);
                        }
                    }
                    System.out.println();
                    System.out.print("Tong so thuc: " );
                    sum1.hienThi();
                    System.out.println();
                    System.out.print("Tong phan so: ");
                    sum2.hienThi();
                    System.out.println();
                    System.out.print("Tong so phuc: ");
                    sum3.hienThi();
                    System.out.println();
                	break;
                case 0:
                	System.out.println("Thoat chuong trinh");
                	break;
                default:
                    System.out.println("Lua chon khong hop le");
                    return;
            }
        }while(chon!=0);
    }
}
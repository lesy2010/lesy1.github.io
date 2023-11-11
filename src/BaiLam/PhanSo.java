package BaiLam;

import java.util.Scanner;

public class PhanSo implements PhepCong {
	int tuso;
	int mauso;
	
	
	public PhanSo() {
		super();
	}
	public PhanSo(int tuso, int mauso) {
		super();
		this.tuso = tuso;
		this.mauso = mauso;
	}
	void nhap()
	{
		Scanner sc = new Scanner(System.in);
		this.tuso = sc.nextInt();
		this.mauso = sc.nextInt();
	}
	@Override
	public Object add(Object o) {
		// TODO Auto-generated method stub
		PhanSo kq = new PhanSo();
        PhanSo ps = (PhanSo) o;

        kq.tuso = this.tuso * ps.mauso + ps.tuso * this.mauso;
        kq.mauso = this.mauso * ps.mauso;

        // Simplify the result fraction
        int tg = toigian(kq.tuso, kq.mauso);
        kq.tuso /= tg;
        kq.mauso /= tg;

        return kq;
    }
	private int toigian(int a, int b) {
        if (b == 0) {
            return a;
        }
        return toigian(b, a % b);
    }
	void hienThi() {
        System.out.print(tuso + "/" + mauso +" ");
    }
}
